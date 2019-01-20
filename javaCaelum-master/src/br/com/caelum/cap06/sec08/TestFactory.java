package br.com.caelum.cap06.sec08;

public class TestFactory {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setNome("Jonas");
		f1.setSalario(100);
		//f1.nome = "Jonas";
		//f1.salario = 100;
		
		Data novaData = new Data();
		f1.setDataEntrada(novaData);
		//f1.dataEntrada = novaData;
		
		System.out.println(f1.getSalario());
		
		//7 - DANDO NEW EMPRESA
		Empresa empresa = new Empresa();
		
		//9 - Pessoa Fisica
		//PessoaFisica p = new PessoaFisica("");
		PessoaFisica p = PessoaFisica.geraPessoa(""); //Null para invalido e objeto para valido;
		System.out.println(p);
	}
}
