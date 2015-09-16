package br.com.s2it.entregandomercadoria.util;

public class CriaArrayString {

	/**
	 * Método que cria o array de strings referente ao dado enviado
	 * @param dado
	 * @return
	 */
	public String[] montaArray(String dado){
		String[] array = dado.split(",");
		
		return array;
	}
	
}