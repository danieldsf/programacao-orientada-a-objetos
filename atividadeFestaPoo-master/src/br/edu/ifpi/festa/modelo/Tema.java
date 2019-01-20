package br.edu.ifpi.festa.modelo;

import java.util.List;

public class Tema {
	private String nome;
	private double valorAluguel;
	private List<String> itens;
	private String cor;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorAluguel() {
		return valorAluguel;
	}
	
	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	
	public List<String> getItens() {
		return itens;
	}
	
	public void setItens(List<String> itens) {
		this.itens = itens;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String toString(){
		return String.format("Tema: %s - Cor: %s\nValor do Aluguel: R$ %.2f\nITENS:\n%s", this.getNome(), this.getCor(), this.getValorAluguel(), this.getItens());
	}
}
