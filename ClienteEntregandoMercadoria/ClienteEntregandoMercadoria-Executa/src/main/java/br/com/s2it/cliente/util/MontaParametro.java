package br.com.s2it.cliente.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import br.com.s2it.cliente.dto.ParametrosDto;

/**
 * Classe que monta parâmetros a partir do arquivo lido
 * @author paulo.cotta
 *
 */
public class MontaParametro {

	/**
	 * Método que monta os parâmetros para serem consumidos pelo serviço 
	 * que fala qual é o caminho mais curto e barato
	 * @param stream
	 * @return
	 * @throws IOException 
	 */
	public List<ParametrosDto> montaParametroGrafo(InputStream stream) throws IOException{
		List<ParametrosDto> parametros = new ArrayList<ParametrosDto>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
		String atributo;
		while((atributo = reader.readLine()) != null) {
			parametros.add(montaParametro(atributo));
		}
		
		return parametros;
	}
	
	/**
	 * Método que monta os dados da classe parâmetro
	 * @param atributo
	 * @return
	 */
	private ParametrosDto montaParametro(String atributo){
		ParametrosDto parametro = null;
		
		if (!atributo.isEmpty()) {
			String words[] = atributo.split("\\s");
			
			parametro = new ParametrosDto();
			
			parametro.setParametros(words);
		}
		
		return parametro;
	}
	
}