package br.com.caelum.cap11.sec02;

public class TesteErro {

	public static void main(String[] args) {
		System.out.println("inicio do main");
		//5 - Tratando erro na chamada do metodo1;
		try {
			metodo1();			
		} catch (Exception e) {
			System.out.println("erro: " + e);
		} 
		//Fim tratamento;
		//Resposta: o codigo do metodo 2 nao chega ao fim, assim como o metodo 1, vide resposta 4;
		
		System.out.println("fim do main");
	}

	static void metodo1() {
		System.out.println("inicio do metodo1");
		//4 - Tratando erro na chamada do metodo2;
//		try {
			metodo2();
//		} catch (Exception e) {
//			System.out.println("erro: " + e);
//		}
		//Fim tratamento;
		//Resposta: o codigo do metodo 2 nã chega ao fim, é interrompido a partir da descoberta do erro;
		System.out.println("fim do metodo1");
	}
	
	static void metodo2() {
		System.out.println("inicio do metodo2");
		int [] array = new int[10];
		//1 - Manipulando Array (com garantia de erro):
		
//		for (int i = 0; i < 15; i++) {
//			array[i] = i * 4;
//			System.out.println(array[i]);
//		}
		
		//Fim manipulando Array
		
		//2 - Manipulando Array (Tratando erro):
		
//		try{
//			for (int i = 0; i < 15; i++) {
//				array[i] = i * 4;
//				System.out.println(array[i]);
//			}
//		}catch (ArrayIndexOutOfBoundsException e){
//			System.out.println("erro: " + e);
//		}
		
		//Fim manipulando Array
		
		//Resposta: Ao encontrar a exceção o tratamento exibe uma mensagem composta pela string erro e o nome do erro especifico;
		
		//3 - Manipulando Array (Tratando erro dentro do for):
		for (int i = 0; i < 15; i++) {
//			try{
				array[i] = i * 4;
				System.out.println(array[i]);
//			}catch (ArrayIndexOutOfBoundsException e){
//				System.out.println("erro: " + e);
//			}
		}
		//Fim manipulando Array
		//Resposta: A diferença é que nesse caso, cada iteração é executada e o erro é tratado dentro do loop, sendo executado sobre o codigo de execução original;
		System.out.println("fim do metodo2");
	}
}
