package br.diobrtech.igmanejo.negocio.beans;

public class Agricultor {
	private String nome;
	private String telefone;	
	private String email;
	private Area area;
	
		
	public Agricultor(String nome, String telefone, String email, Area area) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.area = area;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}

	
}
