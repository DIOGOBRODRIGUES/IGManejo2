package br.diobrtech.igmanejo.negocio.beans;

public class Area {
	private String nome;
	private Solo solo;
	private Cultura cultura;
	private SistemaIrrigacao sistemIrrigacao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Solo getSolo() {
		return solo;
	}
	public void setSolo(Solo solo) {
		this.solo = solo;
	}
	public Cultura getCultura() {
		return cultura;
	}
	public void setCultura(Cultura cultura) {
		this.cultura = cultura;
	}
	public SistemaIrrigacao getSistemIrrigacao() {
		return sistemIrrigacao;
	}
	public void setSistemIrrigacao(SistemaIrrigacao sistemIrrigacao) {
		this.sistemIrrigacao = sistemIrrigacao;
	}
	
	

}
