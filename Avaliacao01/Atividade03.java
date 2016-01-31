import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		//Atividade: Condicoes entre numeros
		Scanner in = new Scanner(System.in);
		int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
		
		boolean primeiraCondicao = ((b > c) && (d > a) && ((c+d) > (a+b)));
		boolean segundaCondicao = ((c > 0) && (d > 0) && (a % 2 == 0));
		
		if(primeiraCondicao && segundaCondicao){
			System.out.println("Valores aceitos");
		}else{
			System.out.println("Valores nao aceitos");
		}
	}
}
