package br.com.s2it.cliente.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Classe que Ler o arquivo
 * @author paulo.cotta
 *
 */
public class LerArquivo {

	/**
	 * Método que executa a leitura do arquivo referenciado
	 * @param nomeArquivo
	 * @return
	 */
	public FileInputStream getStream(String nomeArquivo){
		FileInputStream stream = null;
		try {
			stream = new FileInputStream(nomeArquivo);
		} catch (FileNotFoundException e) {
    		System.err.println(nomeArquivo + ": File not found");
    		System.exit(1);
    	}
		return stream;
	}
	
}