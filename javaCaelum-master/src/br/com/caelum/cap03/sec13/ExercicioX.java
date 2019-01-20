package br.com.caelum.cap03.sec13;

public class ExercicioX {

	public static void main(String[] args) {
		
		//Imprimir de 150 a 300:
		for (int i = 150; i < 301; i++) {
			System.out.println(i);
		}
		
		//Imprimir soma de 1 até 10
		int soma = 0;
		for (int i = 1; i < 1001; i++) {
			soma += i;
		}
		
		System.out.println(soma);
		//Imprimir os multiplos de 3 entre 1 e 100:
		for (int i = 1; i < 101; i++) {
			if(i % 3 == 0){
				System.out.println(i);
			}
		}
		//Fatorial de 10:
		//int fatorial = 1;
		long fatorial = 1;
		for (int i = 1; i < 10; i++) {
			fatorial *= i;
		}
		
		System.out.println(fatorial);
		
		//Fatorial de Maiores => 20, 30, 40:
		fatorial = 1;
		
		for (int i = 1; i < 40; i++) {
			fatorial *= i;
		}
		
		System.out.println(fatorial);
		//Explicar erros de int pra long
		
		//6 - Numeros de Fibonacci:
		System.out.println("SEQUENCIA DE FIBONACCI:");
		int anterior = 0, proximo = 1, atual = 0;
		
		do{
			atual = proximo;
			System.out.println(atual);
			proximo += anterior;
			anterior = proximo - anterior;
		}while(atual < 100);
		//Fim de Fibonacci;
		
		//7 - Gerar saida:
		int x = 13;
		System.out.println("GERADOR DE SAIDAS: ");
		while(x > 1){
			if(x % 2 == 0)
				x /= 2;
			else
				x = (3 * x) + 1;
			
			System.out.println(x);
		}
		
		//8 - Piramide de multiplicaveis:
		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((i*j) + " ");
			}
			
			System.out.println(); //Quebra Linha;
		}
		
		//
	}
}
