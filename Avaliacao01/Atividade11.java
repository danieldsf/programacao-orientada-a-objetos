import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int qtdAl = 0, qtdGas = 0, qtdDie = 0, valor = 0;
		
		while(true){
			valor = in.nextInt();
			
			if(valor == 1){
				qtdAl++;
			}else if(valor == 2){
				qtdGas++;
			}else if(valor == 3){
				qtdDie++;
			}else if(valor == 4){
				break;
			}			
		}
		//Saida:
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d\n", qtdAl);
		System.out.printf("Gasolina: %d\n", qtdGas);
		System.out.printf("Diesel: %d\n", qtdDie);
	}
}
