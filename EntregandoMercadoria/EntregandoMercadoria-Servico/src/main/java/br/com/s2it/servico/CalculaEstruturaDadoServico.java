package br.com.s2it.servico;

import br.com.s2it.dto.MostraGrafoDto;

/**
 * Interface referente ao serviço que irá executar o calculo
 * @author paulo.cotta
 *
 */
public interface CalculaEstruturaDadoServico {

	/**
	 * Método que calcula o menor caminho
	 * @param parametrosDtos
	 * @return
	 */
	public MostraGrafoDto menorCaminho(String parametrosDtos);
	
}