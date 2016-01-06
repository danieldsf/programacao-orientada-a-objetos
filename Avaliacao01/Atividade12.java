import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double nota1, nota2;
		
		while(true){ //Nota 1
			nota1 = in.nextDouble();
			
			if(nota1 < 0 || nota1 > 10){
				System.out.println("nota invalida");
			}else{
				break;
			}
			
		}
		
		while(true){ //Nota 1
			nota2 = in.nextDouble();
			
			if(nota2 < 0 || nota2 > 10){
				System.out.println("nota invalida");
			}else{
				break;
			}
		}
		
		System.out.printf("media = %.2f", (nota1+nota2) / 2);
		
	}
}
