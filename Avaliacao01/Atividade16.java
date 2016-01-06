import java.util.Scanner;

public class Atividade16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String classe, filo, especie;
		classe = in.next();
		filo = in.next();
		especie = in.next();
		
		//Condicoes:
		boolean cond1 = (classe.equals("vertebrado") && filo.equals("ave") && especie.equals("carnivoro"));
		boolean cond2 = (classe.equals("vertebrado") && filo.equals("ave") && especie.equals("onivoro"));
		
		boolean cond3 = (classe.equals("vertebrado") && filo.equals("mamifero") && especie.equals("onivoro"));
		boolean cond4 = (classe.equals("vertebrado") && filo.equals("mamifero") && especie.equals("herbivoro"));
		
		boolean cond5 = (classe.equals("invertebrado") && filo.equals("inseto") && especie.equals("hematofogo"));
		boolean cond6 = (classe.equals("invertebrado") && filo.equals("inseto") && especie.equals("herbivoro"));
		
		boolean cond7 = (classe.equals("invertebrado") && filo.equals("anelideo") && especie.equals("hematofogo"));
		boolean cond8 = (classe.equals("invertebrado") && filo.equals("anelideo") && especie.equals("herbivoro"));
		
		//Saida:
		if(cond1){
			System.out.println("aguia");
		}else if(cond2){
			System.out.println("pomba");
		}else if(cond3){
			System.out.println("homem");
		}else if(cond4){
			System.out.println("vaca");
		}else if(cond5){
			System.out.println("pulga");
		}else if(cond6){
			System.out.println("lagarta");
		}else if(cond7){
			System.out.println("sanguessuga");
		}else{ //Cond 8 hehe
			System.out.println("minhoca");
		}
	}
}
