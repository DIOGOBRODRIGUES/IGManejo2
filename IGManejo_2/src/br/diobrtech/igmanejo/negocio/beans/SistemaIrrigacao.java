package br.diobrtech.igmanejo.negocio.beans;

public class SistemaIrrigacao {
	
	//private String tipo; ***utilizar futuramente
	
	private float pm; //porcentagem de �rea molhada
	private float ia; //indice de aplica��o do aspersor
	
	public float getPm() {
		return pm;
	}
	public void setPm(float pm) {
		this.pm = pm;
	}
	public float getIa() {
		return ia;
	}
	public void setIa(float ia) {
		this.ia = ia;
	}

}
