package br.com.s2it.servico;

import java.util.List;

import br.com.s2it.dto.ParametrosDto;

public interface MontaParametroServico {

	/**
	 * Monta os parâmetros do array
	 * @param parametrosDtos
	 * @return
	 */
	public List<ParametrosDto> montaParametro(String parametrosDtos);
	
}