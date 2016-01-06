public class TestFactory{
	
	public static void main(String [] args){

		Funcionario f1 = new Funcionario();
		
		f1.nome = "Joao Bidu";
		
		f1.rg = "3445101";
		
		f1.contrata();

		f1.recebeAumento(200);
		
		f1.mostra();

		//System.out.printf("Nome do Funcionario: %s\n", f1.nome);
		//System.out.printf("RG do Funcionario: %s\n", f1.rg);
		//System.out.printf("Salario Mensal do Funcionario: R$ %.2f\n", f1.salario);
		//System.out.printf("Salario Anual do Funcionario: R$ %.2f\n", f1.calculaGanhoAnual());		
	}
}