package br.com.s2it.dto;

import java.util.List;

import br.com.s2it.entregandomercadoria.estrutura.Vertice;

public class MostraGrafoDto {

	private List<Vertice> caminhoMaisCurto;
	
	private Double valorCombustivelCaminho;
	
	private String msgErro;

	public Double getValorCombustivelCaminho() {
		return valorCombustivelCaminho;
	}

	public void setValorCombustivelCaminho(Double valorCombustivelCaminho) {
		this.valorCombustivelCaminho = valorCombustivelCaminho;
	}

	public List<Vertice> getCaminhoMaisCurto() {
		return caminhoMaisCurto;
	}

	public void setCaminhoMaisCurto(List<Vertice> caminhoMaisCurto) {
		this.caminhoMaisCurto = caminhoMaisCurto;
	}

	public String getMsgErro() {
		return msgErro;
	}

	public void setMsgErro(String msgErro) {
		this.msgErro = msgErro;
	}
	
}