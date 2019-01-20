package br.com.caelum.cap04.sec13;

public class Fibonacci {
	
//  //- Versao com mais linhas:	
//	public int calculaFibonacci(int n){
//		if(n == 1 || n == 2)
//			return 1;
//		else
//			return this.calculaFibonacci(n - 1) + this.calculaFibonacci(n - 2); 
//		//return n;
//	}
	
	public int calculaFibonacci(int n){
		return (n == 1 || n == 2) ? 1 : this.calculaFibonacci(n - 1) + this.calculaFibonacci(n - 2);
	}
}
