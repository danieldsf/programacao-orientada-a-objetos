package br.com.caelum.cap11.sec11;

public class ContaPoupanca extends Conta{
	
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
		//super.atualiza(taxa * 2);
	}
	
}
