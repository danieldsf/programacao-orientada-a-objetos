package br.com.caelum.cap03.sec03;

public class BalancoTrimestral {

	public static void main(String[] args) {
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000, gastosMarco = 17000;
		
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		System.out.println(gastosTrimestre);
		
		float mediaMensal = gastosTrimestre / 3;
		System.out.println("Valor da média mensal = " + mediaMensal);
	}
}
