package br.com.s2it.servico;

import java.util.ArrayList;
import java.util.List;

import br.com.s2it.dto.ParametrosDto;
import br.com.s2it.entregandomercadoria.estrutura.Aresta;
import br.com.s2it.entregandomercadoria.estrutura.Grafo;
import br.com.s2it.entregandomercadoria.estrutura.Vertice;

public class ExecutaGrafoVerticeServicoImpl implements
		ExecutaGrafoVerticeServico {

	@Override
	public Grafo menorCaminhoExecutado(List<ParametrosDto> parametrosDtos) {
		List<Vertice> vertices = new ArrayList<Vertice>();
		List<Aresta> arestas = new ArrayList<Aresta>();
		Grafo grafo = null;
		
		//Monta GRAFO
		if(!parametrosDtos.isEmpty()){
			for(ParametrosDto parametrosDto : parametrosDtos){
				Aresta aresta = new Aresta(new Vertice(parametrosDto.getPonto1()), new Vertice(parametrosDto.getPonto2()));
				aresta.setOrigem(new Vertice(parametrosDto.getOrigem()));
				aresta.setDestino(new Vertice(parametrosDto.getDestino()));
				aresta.setPeso(new Integer(parametrosDto.getPeso()));
				arestas.add(aresta);
				Vertice vertice = new Vertice();
				vertice.setArestas(arestas);
				vertice.setDescricao(parametrosDto.getPonto1()+parametrosDto.getPonto2());
				vertice.setDistancia(new Integer(parametrosDto.getPeso()));
				vertice.setPai(new Vertice(parametrosDto.getOrigem()));
				vertice.setVizinhos(vertices);
				vertices.add(vertice);
			}
			
			grafo = new Grafo();
			grafo.setVertices(vertices);
		}
		
		return grafo;
	}

	
	
}