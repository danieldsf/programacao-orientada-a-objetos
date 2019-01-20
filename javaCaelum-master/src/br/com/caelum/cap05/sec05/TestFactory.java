package br.com.caelum.cap05.sec05;

public class TestFactory {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome = "Jonas";
		f1.salario = 100;
		
		Data novaData = new Data();
		f1.dataEntrada = novaData;
		
		//Comparando funcionarios com referencias diferentes:
		Funcionario f2 = new Funcionario();
		f2.nome = "Jonas";
		f2.salario = 100;
		
		//Comparando funcionarios com a mesma referencia:
		Funcionario f3 = f1;
		f1.nome = "Hugo";
		f1.salario = 200;
		
		//Empresa:
		Empresa empresa = new Empresa();
		empresa.adiciona(f1);
		empresa.adiciona(f2);
		
		for (int i = 0; i < 5; i++) {
			Funcionario f = new Funcionario();
			f.salario = 200 * i;
			empresa.adiciona(f);
		}
		
		//Imprimindo Salarios: 
		empresa.mostraEmpregados();
		Funcionario f5 = new Funcionario();
		System.out.println(empresa.contem(f1) ? "CONTEM" : "NAO CONTEM");
		System.out.println(empresa.contem(f5) ? "CONTEM" : "NAO CONTEM");
		//
	}
}