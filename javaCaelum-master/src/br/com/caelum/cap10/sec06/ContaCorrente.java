package br.com.caelum.cap10.sec06;

public class ContaCorrente implements ContaTributavel{
	
	private double saldo;
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void deposita(double valor){
		this.saldo += (valor - 0.1); 
	}
	
	public void saca(double valor){
		this.saldo -= valor;
	}
	
	public void atualiza(double taxaSelic){
		this.saldo += this.saldo * taxaSelic * 2;
	}
	
	public double calculaTributos(){
		return this.getSaldo() * 0.01;
	}
}
