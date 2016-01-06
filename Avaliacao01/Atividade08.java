import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		//Atividade: Consumo Medio de um Automovel:
		Scanner in = new Scanner(System.in);
		int idadeAtual = 0, somaIdades = 0, quantiaIdades = 0;
		
		while(true){
			idadeAtual = in.nextInt();
			if(idadeAtual > 0 ){
				somaIdades += idadeAtual;
				quantiaIdades++;
			}
		}
		
		float teste = somaIdades / quantiaIdades;
		
		System.out.printf("%.2f\n", teste);
		
	}
}
