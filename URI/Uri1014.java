import java.util.Scanner;

public class Uri1014 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int distanciaTotal = 0;
		double combustivelGasto = 0;
		distanciaTotal = in.nextInt();
		combustivelGasto = in.nextDouble();
		
		double distanciaPorLitro =  distanciaTotal / combustivelGasto; 
		
		System.out.printf("%.3f km/l\n", distanciaPorLitro);
	}
}
