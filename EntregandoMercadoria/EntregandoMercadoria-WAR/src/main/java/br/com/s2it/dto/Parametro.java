package br.com.s2it.dto;

public class Parametro {

	private String origem;
	
	private String destino;
	
	private String peso;
	
	private String precoCombustivelPorDistancia;

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getPrecoCombustivelPorDistancia() {
		return precoCombustivelPorDistancia;
	}

	public void setPrecoCombustivelPorDistancia(String precoCombustivelPorDistancia) {
		this.precoCombustivelPorDistancia = precoCombustivelPorDistancia;
	}
	
}