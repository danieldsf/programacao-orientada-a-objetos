import java.util.Scanner;

public class Atividade15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for (int i = 1; i < 11; i++) {
			System.out.printf("%d X %d = %d\n", i, n, n * i);
		}
		
	}
}
