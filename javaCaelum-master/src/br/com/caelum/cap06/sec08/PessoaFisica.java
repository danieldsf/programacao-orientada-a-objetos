package br.com.caelum.cap06.sec08;

public class PessoaFisica {
	private String cpf;
	
	public PessoaFisica(){
		
	}
	
	public PessoaFisica(String cpf){
		this.cpf = cpf;
	}
	
	public static boolean valida(String x){
		return !x.equals("");
	}
	
	//Gera Pessoa:
	public static PessoaFisica geraPessoa(String x){
		return valida(x) ? new PessoaFisica(x) : null; 
	}
	//Fim Gera Pessoa;
}
