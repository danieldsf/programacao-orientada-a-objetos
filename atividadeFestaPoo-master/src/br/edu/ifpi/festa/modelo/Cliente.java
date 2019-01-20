package br.edu.ifpi.festa.modelo;

import java.util.List;

public class Cliente {
	private Endereco endereco;
	private String nome;
	private List<Telefone> telefones; //Lista de Telefones;
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Telefone> getTelefone() {
		return this.telefones;
	}
	
	public void setTelefone(List<Telefone> telefone) {
		this.telefones = telefone;
	}
	
	@Override
	public String toString(){
		return String.format("Cliente: %s, Telefone: %s, Endereco: %s", this.getNome(), this.getTelefone(), this.getEndereco());
	}
}
