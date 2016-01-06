import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		//Atividade: Corrida de Lesmas:
		Scanner in = new Scanner(System.in);
		int l = 0;
		
		while(true){
			int v, maior; 
			byte nivel;
			
			l = in.nextInt();
			
			if(l < 0){
				break;
			}
			
			maior = v = in.nextInt(); //Primeiro valor; 
			
			for (int i = 1; i < l; i++) {
				v = in.nextInt();
				
				if(v > maior){
					maior = v;
				}
			}
			
			//Saida:
			
			
			if(maior < 10){
				nivel = 1;
			}else if(maior < 20){
				nivel = 2;
			}else{
				nivel = 3;
			}
			//
			System.out.println(nivel);
		}
		
	}
}
