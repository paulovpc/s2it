package br.com.s2it.servico;

import java.util.ArrayList;
import java.util.List;

import br.com.s2it.dto.ParametrosDto;
import br.com.s2it.entregandomercadoria.util.CriaArrayString;

public class MontaParametroServicoImpl implements MontaParametroServico {

	@Override
	public List<ParametrosDto> montaParametro(String parametrosDtos){
		List<ParametrosDto> parametros = new ArrayList<ParametrosDto>();
		ParametrosDto parametro = null;
		
		if(parametrosDtos != null){
			String[] dados = new CriaArrayString().montaArray(parametrosDtos.replace("[", "").replace("]", ""));
			
			for(int i=5;i<dados.length-1;i++){
				parametro = new ParametrosDto();
				parametro.setOrigem(dados[0].trim());
				parametro.setDestino(dados[1].trim());
				parametro.setPrecoCombustivel(new Double(dados[2].trim()));
				parametro.setAutonomia(new Integer(dados[3].trim()));
				parametro.setNomeDoMapa(dados[4].trim());
				parametro.setPonto1(dados[i].trim().substring(0, 1));
				parametro.setPonto2(dados[i].trim().substring(1, 2));
				parametro.setPeso(new Integer(dados[i].trim().substring(2, dados[i].length()-1)));
				parametros.add(parametro);
			}
		}
		
		return parametros;
	}

}
