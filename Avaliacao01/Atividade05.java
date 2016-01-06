import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		//Atividade: Consumo Medio de um Automovel:
		Scanner in = new Scanner(System.in);
		int totalErros = 0, valorAtual = 0;
		final int SENHA = 2002; 
		
		while(totalErros < 3){
			valorAtual = in.nextInt();
			
			if(valorAtual != SENHA){
				totalErros++;
				System.out.println("Senha invalida");
			}else{
				System.out.println("Acesso Permitido");
				break;
			}
		}
	}
}
