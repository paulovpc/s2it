package br.com.s2it.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.s2it.dto.MostraGrafoDto;
import br.com.s2it.dto.Parametro;
import br.com.s2it.servico.CalculaEstruturaDadoServico;
import br.com.s2it.servico.CalculaEstruturaDadoServicoImpl;

/**
 * Classe REST que chama os dados de calculo do grafo de distância entre os pontos
 * @author paulo.cotta
 *
 */
@Path("/calcula-transporte")
public class CalculaKMTransporteController {

	private CalculaEstruturaDadoServico calculaEstruturaDadoServico;
	
	{
		calculaEstruturaDadoServico = new CalculaEstruturaDadoServicoImpl();
	}
	
	/**
	 * Método de request GET pois irei pesquisar um dado, seguindo o padrão de REST
	 * 	executa o menor caminho e retorna o JSON produzido
	 * @param parametrosDtos
	 * @return
	 */
	@GET
	@Path("/menor-caminho/{parametrosDtos}")
	@Produces(MediaType.APPLICATION_JSON)
	public Parametro menorCaminho(@PathParam("parametrosDtos") String parametrosDtos){
		MostraGrafoDto dto = calculaEstruturaDadoServico.menorCaminho(parametrosDtos);
		Parametro parametro = new Parametro();
		parametro.setDestino(dto.getCaminhoMaisCurto().get(0).getArestas().get(0).getDestino().getDescricao());
		parametro.setOrigem(dto.getCaminhoMaisCurto().get(0).getArestas().get(0).getOrigem().getDescricao());
		parametro.setPeso(dto.getCaminhoMaisCurto().get(0).getArestas().get(0).getPeso().toString());
		parametro.setPrecoCombustivelPorDistancia(dto.getValorCombustivelCaminho().toString());
		
		return parametro;
	}
	
}