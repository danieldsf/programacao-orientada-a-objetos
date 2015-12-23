import java.util.Scanner;

public class Uri1008 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero = 0, qtdHorasWork = 0;
		double valorPorHora = 0;
		
		numero = in.nextInt();
		in.nextLine();
		
		qtdHorasWork = in.nextInt();
		in.nextLine();
		
		valorPorHora = in.nextDouble();
		in.nextLine();
		
		double salario = qtdHorasWork * valorPorHora;
		
		System.out.printf("NUMBER = %d\n", numero);
		System.out.printf("SALARY = U$ %.2f\n", salario);
	}
}
