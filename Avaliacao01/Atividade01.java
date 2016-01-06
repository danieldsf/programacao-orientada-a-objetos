import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		//Atividade: Consumo Medio de um Automovel:
		Scanner in = new Scanner(System.in);
		int x; 
		float y;
		
		x = in.nextInt();
		y = in.nextFloat();
		
		float valorKmPorL = x / y;
		
		System.out.printf("%.3f km/l\n", valorKmPorL); 
	}
}
