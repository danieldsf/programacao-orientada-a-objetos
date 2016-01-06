public class TestFactory{
	
	public static void main(String [] args){

		Funcionario f1 = new Funcionario();
		Data data = new Data();
		f1.nome = "Joao Bidu";
		f1.contrata();

		f1.mostra(); //Da Erro de Null Pointer Exception;

		f1.dataEntrada = data;
		
		//f1.mostra(); //Funciona e mostra valores nulos pra data;
	}
}