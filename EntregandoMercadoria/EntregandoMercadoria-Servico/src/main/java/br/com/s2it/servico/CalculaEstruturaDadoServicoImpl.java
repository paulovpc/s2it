package br.com.s2it.servico;

import java.io.IOException;
import java.util.List;

import br.com.s2it.dto.MostraGrafoDto;
import br.com.s2it.dto.ParametrosDto;
import br.com.s2it.entregandomercadoria.constante.CaminhoArquivo;
import br.com.s2it.entregandomercadoria.estrutura.Aresta;
import br.com.s2it.entregandomercadoria.estrutura.Grafo;
import br.com.s2it.entregandomercadoria.estrutura.Vertice;
import br.com.s2it.entregandomercadoria.estruturadado.Dijkstra;
import br.com.s2it.entregandomercadoria.util.GravaGrafoArquivo;

/**
 * Classe responsável por calcular a estrutura de dados do Dijkstra referente ao grafo gerado
 * @author paulo.cotta
 *
 */
public class CalculaEstruturaDadoServicoImpl implements CalculaEstruturaDadoServico {

	private MontaParametroServico montaParametroServico;
	private ExecutaGrafoVerticeServico executaGrafoVerticeServico;
	private Dijkstra dijkstra;
	private GravaGrafoArquivo arquivo;
	
	{
		montaParametroServico = new MontaParametroServicoImpl();
		executaGrafoVerticeServico = new ExecutaGrafoVerticeServicoImpl();
		dijkstra = new Dijkstra();
		arquivo = new GravaGrafoArquivo();
	}
	
	@Override
	public MostraGrafoDto menorCaminho(String parametrosDtos) {
		MostraGrafoDto dto = new MostraGrafoDto();
		List<ParametrosDto> parametros = montaParametroServico.montaParametro(parametrosDtos);
		Grafo grafo = executaGrafoVerticeServico.menorCaminhoExecutado(parametros);
		
		//Após a montagem do grafo, ele executa o Dijkstra
		if(grafo != null){
			for(Vertice vertice : grafo.getVertices()){
				if(vertice != null){
					for(Aresta aresta : vertice.getArestas()){
						try{
							aresta.getOrigem().setArestas(vertice.getArestas());
							aresta.getDestino().setArestas(vertice.getArestas());
							aresta.getOrigem().setDistancia(aresta.getPeso());
							aresta.getDestino().setDistancia(aresta.getPeso());
							dto.setCaminhoMaisCurto(dijkstra.encontrarMenorCaminhoDijkstra(grafo, aresta.getOrigem(), aresta.getDestino()));
							if(dto.getCaminhoMaisCurto() != null){
								dto.setValorCombustivelCaminho((dto.getCaminhoMaisCurto().get(0).getDistancia()/parametros.get(0).getAutonomia())*parametros.get(0).getPrecoCombustivel());
							}else{
								dto.setMsgErro("Grafo sem caminho mais curto.");
							}
						}catch(Exception errorIndefinido){
							dto.setMsgErro("Grafo sem caminho mais curto. Error= " + errorIndefinido);
						}
					}
				}
				break;
			}
		}
		
		try {
			arquivo.gravaDadosGrafoBD(CaminhoArquivo.CAMINHO, parametros);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return dto;
	}
	
}