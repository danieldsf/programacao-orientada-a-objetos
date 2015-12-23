import java.util.Scanner;

public class Uri1017 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		final double GASTO = 12.0;
		
		int tempoDeViagem = 0, velocidadeMedia = 0;
		
		tempoDeViagem = in.nextInt();
		in.nextLine();
		
		velocidadeMedia = in.nextInt();
		in.nextLine();
		
		double qtdLitros = (tempoDeViagem * velocidadeMedia) / GASTO;
		System.out.printf("%.3f\n", qtdLitros);
	}
}
