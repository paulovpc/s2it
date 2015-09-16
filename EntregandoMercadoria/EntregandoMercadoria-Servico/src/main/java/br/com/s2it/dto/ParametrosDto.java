package br.com.s2it.dto;

/**
 * DTO dos parâmetros referente aos pontos, origem, destino, precoCombustivel e autonomia
 * @author paulo.cotta
 *
 */
public class ParametrosDto {

	private String origem;
	
	private String destino;
	
	private String ponto1;
	
	private String ponto2;
	
	private Double precoCombustivel;
	
	private Integer autonomia;
	
	private Integer peso;
	
	private String nomeDoMapa;

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

	public String getPonto1() {
		return ponto1;
	}

	public void setPonto1(String ponto1) {
		this.ponto1 = ponto1;
	}

	public String getPonto2() {
		return ponto2;
	}

	public void setPonto2(String ponto2) {
		this.ponto2 = ponto2;
	}

	public Double getPrecoCombustivel() {
		return precoCombustivel;
	}

	public void setPrecoCombustivel(Double precoCombustivel) {
		this.precoCombustivel = precoCombustivel;
	}

	public Integer getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(Integer autonomia) {
		this.autonomia = autonomia;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public String getNomeDoMapa() {
		return nomeDoMapa;
	}

	public void setNomeDoMapa(String nomeDoMapa) {
		this.nomeDoMapa = nomeDoMapa;
	}
	
}