import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		//Atividade: Amostras de Animais:
		Scanner in = new Scanner(System.in);
		int cont, quantiaRatos, quantiaSapos, quantiaCoelhos, quantiaTotal;
		cont = quantiaRatos = quantiaSapos = quantiaCoelhos = quantiaTotal = 0;
		
		cont = in.nextInt();
		
		for (int i = 0; i < cont; i++) {
			int qtd = in.nextInt();
			String letra = in.next();
			
			if(letra.equals("C")){
				quantiaCoelhos += qtd;
			}else if(letra.equals("R")){
				quantiaRatos += qtd;
			}else if(letra.equals("S")){
				quantiaSapos += qtd;
			}
			
			quantiaTotal += qtd;
		}
		
		//Saida:
		System.out.printf("Total: %d cobaias\n", quantiaTotal);
		System.out.printf("Total de coelhos: %d\n", quantiaCoelhos);
		System.out.printf("Total de ratos: %d\n", quantiaRatos);
		System.out.printf("Total de sapos: %d\n", quantiaSapos);
		
		System.out.printf("Percentual de coelhos: %.2f %%\n",  100 * quantiaCoelhos / (float) quantiaTotal);
		System.out.printf("Percentual de ratos: %.2f %%\n",  100 *  quantiaRatos / (float) quantiaTotal);
		System.out.printf("Percentual de sapos: %.2f %%\n",  100 * quantiaSapos / (float) quantiaTotal);
	}
}
