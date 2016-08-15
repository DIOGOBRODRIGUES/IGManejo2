package br.diobrtech.igmanejo.negocio;

import br.diobrtech.igmanejo.negocio.beans.Agricultor;
import br.diobrtech.igmanejo.negocio.beans.Area;

public class Manejo {
	
	private float et; //evapotranspiração
	private float pp; //precipitação
	private float etc;
	private float cra;
	private float lamina;
	
	public void manejo (Agricultor agricultor, Area area){
		CRA(area);
		ETC(area);
		if(cra>this.etc)
			this.setLamina(this.etc);
		else
			setCra(cra-this.etc);
	}
	
	
	private void ETC (Area area){
		this.etc= getEt()*area.getCultura().getKc()-getPp();
	}
	


	private void CRA (Area area){
		 this.cra=(area.getSolo().getCc()-area.getSolo().getF())/10*area.getSolo().getD()
				 *area.getCultura().getZ()*area.getSolo().getF();
	}
	
	public float getEt() {
		return et;
	}


	public void setEt(float et) {
		this.et = et;
	}


	public float getPp() {
		return pp;
	}


	public void setPp(float pp) {
		this.pp = pp;
	}


	public float getEtc() {
		return etc;
	}


	public void setEtc(float etc) {
		this.etc = etc;
	}


	public float getCra() {
		return cra;
	}


	public void setCra(float cra) {
		this.cra = cra;
	}


	public float getLamina() {
		return lamina;
	}


	public void setLamina(float lamina) {
		this.lamina = lamina;
	}

	
	
	

}
