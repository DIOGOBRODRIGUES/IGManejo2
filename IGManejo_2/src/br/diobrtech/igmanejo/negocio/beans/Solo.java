package br.diobrtech.igmanejo.negocio.beans;

public class Solo {
	
	private float pm; //ponto de murcha
	private float cc; //capacidade de campo
	private float f; //fator f
	private float d; // densidade do solo
	private float cea; // condutivade eletrica atual
	private float cees; // condutividade eletrica do extrato de saturação
	
	
	
	public Solo(float pm, float cc, float f, float d, float cea, float cees) {
		super();
		this.pm = pm;
		this.cc = cc;
		this.f = f;
		this.d = d;
		this.cea = cea;
		this.cees = cees;
	}
	
	
	public float getPm() {
		return pm;
	}
	public void setPm(float pm) {
		this.pm = pm;
	}
	public float getCc() {
		return cc;
	}
	public void setCc(float cc) {
		this.cc = cc;
	}
	public float getF() {
		return f;
	}
	public void setF(float f) {
		this.f = f;
	}
	public float getD() {
		return d;
	}
	public void setD(float d) {
		this.d = d;
	}
	public float getCea() {
		return cea;
	}
	public void setCea(float cea) {
		this.cea = cea;
	}
	public float getCees() {
		return cees;
	}
	public void setCees(float cees) {
		this.cees = cees;
	}
	

}
