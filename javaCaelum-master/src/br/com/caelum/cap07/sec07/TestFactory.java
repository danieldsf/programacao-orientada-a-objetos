package br.com.caelum.cap07.sec07;

public class TestFactory {

	public static void main(String[] args) {
		Conta c = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		//Conta cc = new ContaCorrente();
		//Conta cp = new ContaPoupanca();
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		//c.atualiza(0.01);
		//cc.atualiza(0.01);
		//cp.atualiza(0.01);
		
		Banco bb = new Banco();
		bb.adiciona(c);
		bb.adiciona(cc);
		bb.adiciona(cp);
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		//adc.roda(c);
		//adc.roda(cc);
		//adc.roda(cp);
		
		for (int i = 0; i < bb.pegaTotalDeContas(); i++) {
			adc.roda(bb.pegaContas(i));
		}
		
		//System.out.println(c.getSaldo());
		//System.out.println(cc.getSaldo());
		//System.out.println(cp.getSaldo());
		System.out.printf("Saldo Total: R$ %.2f\n", adc.getSaldoTotal()); //Arredondou;
	}
}