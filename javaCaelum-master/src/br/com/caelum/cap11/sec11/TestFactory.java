package br.com.caelum.cap11.sec11;

public class TestFactory {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		try{			
			cp.deposita(-100);
		}catch(ValorInvalidoException e){
//		}catch(IllegalArgumentException e){
//			System.out.println("Voc� tentou depositar um valor inv�lido");
			System.out.println(e.getMessage());
		}
	}
}