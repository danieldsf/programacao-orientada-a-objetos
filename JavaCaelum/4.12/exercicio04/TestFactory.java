public class TestFactory{
	
	public static void main(String [] args){

		Funcionario f1 = new Funcionario();
		f1.nome = "Joao Bidu";
		f1.contrata();
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Joao Bidu";
		f2.contrata();
		
		if(f1 == f2){
			System.out.println("iguais");
		}else{
			System.out.println("diferentes");
		}

		//Mesmo com atributos iguais, a comparacao da false;
	}
}