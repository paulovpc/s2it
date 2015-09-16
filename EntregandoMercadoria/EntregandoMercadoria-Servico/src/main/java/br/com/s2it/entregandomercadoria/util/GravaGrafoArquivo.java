package br.com.s2it.entregandomercadoria.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import br.com.s2it.dto.ParametrosDto;

public class GravaGrafoArquivo {

	/**
	 * Método que grava os dados do grafo
	 * @param caminho
	 * @param parametros
	 * @throws IOException
	 */
	public void gravaDadosGrafoBD(String caminho, List<ParametrosDto> parametros) throws IOException{
		if(!caminho.isEmpty()){
			Boolean arquivoExiste = (new File(caminho+"bd.txt")).exists();
			if(arquivoExiste){
				if(!parametros.isEmpty()){
					BufferedWriter buffer = new BufferedWriter(new FileWriter(new File(caminho+"bd.txt")));
					
					buffer.append(leArquivo(caminho+"bd.txt"));
					
					buffer.append(parametros.get(0).getNomeDoMapa()).append("\n");
					buffer.append(parametros.get(0).getOrigem()).append(" ").append(parametros.get(0).getDestino())
					.append(" ").append(parametros.get(0).getPrecoCombustivel().toString())
					.append(" ").append(parametros.get(0).getAutonomia().toString()).append("\n");
					for(ParametrosDto parametro : parametros){
						buffer.append(parametro.getPonto1()).append(parametro.getPonto2()).append(parametro.getPeso().toString()).append("\n");
					}
					
					buffer.append("\n\n\n");
					buffer.close();
				}
			}else{
				throw new FileNotFoundException("Arquivo inexistente...");
			}
		}
	}
	
	/**
	 * Método que recupera os dados já gravados para prover a gravação novamente dos dados
	 * @param caminhoCompleto
	 * @return
	 * @throws IOException
	 */
	private StringBuilder leArquivo(String caminhoCompleto) throws IOException{
		StringBuilder linha = new StringBuilder();
		
		FileInputStream stream = new FileInputStream(caminhoCompleto);
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader br = new BufferedReader(reader);
		String escrita = br.readLine();
		linha.append(escrita);
		
		while(escrita != null){
			escrita = br.readLine();
			linha.append(escrita);
		}
		
		br.close();
		
		return linha;
	}
	
}