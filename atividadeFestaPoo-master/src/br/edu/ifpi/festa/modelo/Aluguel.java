package br.edu.ifpi.festa.modelo;

public class Aluguel {
	
	private Cliente cliente;
	private Endereco endereco;
	private double valorCobrado;
	private Tema tema;
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public double getValorCobrado() {
		return valorCobrado;
	}
	
	public void setValorCobrado(double valorCobrado) {
		this.valorCobrado = valorCobrado;
	}
	
	public Tema getTema() {
		return tema;
	}
	
	public void setTema(Tema tema) {
		this.tema = tema;
	}
}
