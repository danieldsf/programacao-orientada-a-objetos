package br.com.caelum.cap04.sec13;

public class TestFactory {

	public static void main(String[] args) {
		Fibonacci fibo = new Fibonacci();
		for (int i = 1; i <= 6; i++) {
			System.out.println(fibo.calculaFibonacci(i));
		}
		//
	}
}
