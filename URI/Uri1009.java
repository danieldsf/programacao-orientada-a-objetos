import java.util.Scanner;

public class Uri1009 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nome = "";
		double salarioFixo = 0, totalVendas = 0, salarioTotal = 0;
		
		nome = in.next();
		in.nextLine();
		
		salarioFixo = in.nextDouble();
		in.nextLine();
		
		totalVendas = in.nextDouble();
		in.nextLine();
		
		salarioTotal = salarioFixo + (totalVendas * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f\n", salarioTotal);
	}
}
