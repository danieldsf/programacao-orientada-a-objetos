package br.com.caelum.cap11.sec11;

public abstract class Conta {
	
	protected double saldo;
	//Private Conta;
	
//	public void deposita(double valor) throws ValorInvalidoException{
	public void deposita(double valor){
		if(valor < 0){
			throw new ValorInvalidoException(valor);
//			throw new ValorInvalidoException();
//			throw new IllegalArgumentException("Voce tentou depositar um valor negativo");
		}else{
			this.saldo += valor;
		}
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
