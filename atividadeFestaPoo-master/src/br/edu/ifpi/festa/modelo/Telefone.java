package br.edu.ifpi.festa.modelo;

public class Telefone {
	
	private String numero;
	private String descricao;
	
	public Telefone(){
		
	}
	
	public Telefone(String numero, String descricao){
		this.numero = numero;
		this.descricao = descricao;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String toString(){
		return String.format("Numero: %s, Descricao: %s", this.getNumero(), this.getDescricao());
	}
}
