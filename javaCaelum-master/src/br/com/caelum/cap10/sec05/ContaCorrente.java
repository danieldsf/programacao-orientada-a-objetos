package br.com.caelum.cap10.sec05;

public class ContaCorrente extends Conta implements Tributavel{
	
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
		//super.atualiza(taxa * 2);
	}
	
	@Override
	public void deposita(double valor) {
		this.saldo += (valor - 0.1);
		//super.deposita(valor - 0.10);
	}
	
	public double calculaTributos(){
		return this.getSaldo() * 0.01;
	}
	
	
}
