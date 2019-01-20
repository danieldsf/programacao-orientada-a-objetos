package br.edu.ifpi.restaurante.modelo;

public class Pedido {
	
	private String descricao;
	private double valor;
	
	public Pedido(){
	}
	
	public Pedido(String descricao, double valor){
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
}
