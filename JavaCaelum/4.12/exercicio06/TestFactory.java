public class TestFactory{
	
	public static void main(String [] args){

		Funcionario f1 = new Funcionario();
		Data data = new Data();

		f1.dataEntrada = data;
		f1.nome = "Joao Bidu";
		f1.contrata();
		
		//Desenhar Estado de Memoria do Segundo caso;
	}
}