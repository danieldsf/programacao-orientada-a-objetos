package br.com.caelum.cap07.sec07;

public class AtualizadorDeContas {
	
	private double saldoTotal;
	private double selic;
	
	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}
	
	public void roda(Conta c){
		//
		double saldoAntigo = c.saldo;
		System.out.println("Saldo Anterior: " + saldoAntigo);
		c.atualiza(this.selic);
		System.out.println("Saldo Atual: " + c.saldo);
		this.saldoTotal += (c.saldo - saldoAntigo);
		//
	}
	
	public double getSelic() {
		return selic;
	}

	public void setSelic(double selic) {
		this.selic = selic;
	}

	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}
	
	public double getSaldoTotal(){
		return this.saldoTotal;
	}
	
}
