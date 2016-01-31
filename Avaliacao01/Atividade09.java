import java.util.Scanner;

public class Atividade09 {
	
	public static void main(String[] args) {
		//Atividade: Consumo Medio de um Automovel:
		Scanner in = new Scanner(System.in);
		
		double valor = in.nextDouble();
		//Utilizando array
		int notas[] = {100, 50, 20, 10, 5, 2};
		int moedas[] = {100, 50, 25, 10, 5, 1};
		
		//Notas:
		System.out.println("NOTAS");
		for (int divisor : notas) {
			int qtd = (int)valor / divisor;
			System.out.printf("%d nota(s) de R$ %.2f\n", qtd, (double)divisor);
			valor -= qtd * divisor;
		}	
		
		//Moedas:
		System.out.println("MOEDAS");
		double valorMoedas = valor * 100;
		for (int divisor : moedas) {
			int qtd = (int) valorMoedas / divisor;
			System.out.printf("%d moeda(s) de R$ %.2f\n", qtd, (double)divisor/100);
			valorMoedas -= qtd * divisor;
		}
		
	}
}
