package br.com.caelum.cap10.sec05;

public class TestaTributavel {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());
		
		//Testando o polimorfismo:
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
		
		//System.out.println(t.getSaldo());
		
		
	}
}
