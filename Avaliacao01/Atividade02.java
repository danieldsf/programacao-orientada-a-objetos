import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		//Atividade: Vendedor 01
		Scanner in = new Scanner(System.in);
		String nome;
		double salarioFixo, montanteVendas;
		//
		nome = in.next();
		salarioFixo = in.nextDouble();
		montanteVendas = in.nextDouble();
		
		double salarioTotal = salarioFixo + (0.15 * montanteVendas); 
		System.out.printf("TOTAL = R$ %.2f\n", salarioTotal);
	}
}
