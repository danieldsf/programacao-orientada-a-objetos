import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		//Atividade: Impressao Formatada -> 04:
		Scanner in = new Scanner(System.in);
		int n, cont = 1;
		
		n = in.nextInt();
		
		for (int i = 0; i < n; i++) { //Gera linhas
			for (int j = 0; j < 4; j++) { //Gera Colunas => (4) pode ser uma constante tambem;
				String saida = (cont % 4 == 0) ? "IFPI\n" : cont + " "; 
				System.out.print(saida);
				cont++;
			}
		}
		
	}
}
