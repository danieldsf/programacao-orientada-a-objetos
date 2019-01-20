package br.com.caelum.cap10.sec06;

public interface Conta{
	
	public double getSaldo();
	public void deposita(double valor);
	public void saca(double valor);
	public void atualiza(double taxaSelic);

}
