package br.com.caelum.cap03.sec14;

public class Fibonacci {
	
	public static long fibonacci(int n){
		int F = 0, ant = 0;
		
		for(int i = 1; i <= n; i++){
			if(i == 1){
				F = 1;
				ant = 0;
			}else{
				F += ant;
				ant = F - ant;
			}
		}	
		return F;
	}
	
	public static void main(String[] args) {
		long valor = 0;
		int cont = 1;
		
		do {
			valor = fibonacci(cont);
			System.out.println(valor);
			cont++;
		} while (valor < 100);
	}
}
