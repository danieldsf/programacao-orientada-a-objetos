package br.com.caelum.cap10.sec06;

public class ContaPoupanca implements Conta{
	
	private double saldo;
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void deposita(double valor){
		this.saldo += valor; 
	}
	
	public void saca(double valor){
		this.saldo -= valor;
	}
	
	public void atualiza(double taxaSelic){
		this.saldo += this.saldo * taxaSelic * 3;
	}
}
