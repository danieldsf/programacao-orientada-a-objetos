import java.util.Scanner;

public class Uri1006 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b, c, media;
		a = b = c = media = 0;
		int pesoA = 2, pesoB = 3, pesoC = 5;
		
		a = in.nextDouble();
		in.nextLine();
		
		b = in.nextDouble();
		in.nextLine();
		
		c = in.nextDouble();
		in.nextLine();
		
		media = ((a * pesoA) + (b * pesoB) + (c * pesoC)) / (pesoA + pesoB + pesoC);
		System.out.printf("MEDIA = %.1f\n", media);
	}
}