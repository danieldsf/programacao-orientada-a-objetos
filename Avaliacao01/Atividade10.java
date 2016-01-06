import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int valorAtual = 0, quantiaPares = 0;
		
		for (int i = 0; i < 5; i++) {
			valorAtual = in.nextInt();
			if(valorAtual % 2 == 0){
				quantiaPares++;
			}
		}
		
		System.out.printf("%d valores pares\n", quantiaPares);
	}
}
