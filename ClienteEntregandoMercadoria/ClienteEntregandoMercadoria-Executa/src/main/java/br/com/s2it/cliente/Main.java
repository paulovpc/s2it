package br.com.s2it.cliente;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.jboss.resteasy.util.HttpResponseCodes;

import br.com.s2it.cliente.constante.DadosUri;
import br.com.s2it.cliente.dto.ParametrosDto;
import br.com.s2it.cliente.util.LerArquivo;
import br.com.s2it.cliente.util.MontaParametro;

public class Main {

	//URI do serviço
	public static final String URI = DadosUri.DOMINIO + DadosUri.PORTA + DadosUri.NOME_APLICACAO;
	
	/**
	 * Método que monta as tuplas dos dados
	 * @param tratado
	 * @return
	 */
	private static List<String> montaTuplasDados(List<ParametrosDto> tratado){
		List<String> parametros = null;
		
		if(!tratado.isEmpty()){
			parametros = new ArrayList<String>();
			for(ParametrosDto dto : tratado){
				for(String tuplaDado : dto.getParametros()){
					parametros.add(tuplaDado);
				}
			}
		}
		
		return parametros;
	}
	
	/**
	 * Método main do client usando o resteasy-client
	 * @param args
	 */
	public static void main(String[] args) {
		String grafo = args[0];
		try {
			List<ParametrosDto> tratado = new MontaParametro().montaParametroGrafo(new LerArquivo().getStream(grafo));			
			
			List<String> parametros = montaTuplasDados(tratado);
			
			ResteasyClient client = new ResteasyClientBuilder().build();
			
			ResteasyWebTarget target = client.target(URI+"calcula-transporte/menor-caminho/"+parametros);
			
			Response response = target.request().get();

			Integer status = response.getStatus();
			String valor = response.readEntity(String.class);
			
			response.close();
			
			if(status == HttpResponseCodes.SC_OK){
				System.out.println(valor);
			}else{
				throw new RuntimeException("Error= " + status);
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

}