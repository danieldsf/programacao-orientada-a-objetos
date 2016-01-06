import java.util.Scanner;

public class Atividade14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int idade = 0, soma = 0, quantia = 1;
		
		while(true){
			idade = in.nextInt();
			
			if(idade > 0){
				soma += idade;
				quantia++;
			}
		}
		
		float avg = (float) soma / quantia;
		System.out.printf("%.2f\n", avg);
	}
}
