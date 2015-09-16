package br.com.s2it.servico;

import java.util.List;

import br.com.s2it.dto.ParametrosDto;
import br.com.s2it.entregandomercadoria.estrutura.Grafo;

public interface ExecutaGrafoVerticeServico {

	/**
	 * Menor caminho a ser executado
	 * @param parametrosDtos
	 * @return
	 */
	public Grafo menorCaminhoExecutado(List<ParametrosDto> parametrosDtos);
	
}