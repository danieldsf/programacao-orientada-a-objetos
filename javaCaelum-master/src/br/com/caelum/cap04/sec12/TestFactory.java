package br.com.caelum.cap04.sec12;

public class TestFactory {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome = "Jonas";
		f1.salario = 100;
		//Funcionario.nome;
		
		Data novaData = new Data();
		f1.dataEntrada = novaData;
		//f1.recebeAumento(50);
		f1.mostra();
		
		//System.out.println("Nome do Funcionario: " + f1.nome);
		//System.out.println("Salario Mensal: " + f1.salario);
		f1.mostra();
		System.out.println("Salario Anual: " + f1.calculaSalarioAnual());
		System.out.println("Imposto de Renda: " + f1.calculaIR());
		
		//Comparando funcionarios com referencias diferentes:
		Funcionario f2 = new Funcionario();
		f2.nome = "Jonas";
		f2.salario = 100;
		
		System.out.println(f1 == f2 ? "Objetos Iguais" : "Objetos Nao iguais");
		
		//Comparando funcionarios com a mesma referencia:
		Funcionario f3 = f1;
		f1.nome = "Hugo";
		f1.salario = 200;
		
		System.out.println(f1 == f3 ? "Objetos Iguais" : "Objetos Nao iguais");
		
	}
}
