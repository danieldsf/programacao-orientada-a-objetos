package br.com.caelum.cap09.sec06;

public abstract class Conta {
	
	protected double saldo;
	//Private Conta;
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public void saca(double valor){
		this.saldo -= valor;
	}
	
	public double getSaldo(){
		//atualiza(0.1);
		return this.saldo;
	}
	
	//public void atualiza(double taxa){
	//	this.saldo += this.saldo * taxa;
	//}
	public abstract void atualiza(double taxaSelic);
}
