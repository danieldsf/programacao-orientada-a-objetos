package br.com.caelum.cap06.sec08;
import java.util.Arrays;

class Empresa{
	private String nome;
	private String cnpj;
	private int contadorF = 0;
	private Funcionario [] empregados;// = new Funcionario[5];
	
	public Empresa(){
		
	}
	
	public Empresa(int qtdFuncionarios){
		empregados = new Funcionario[qtdFuncionarios];
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public int getContadorF() {
		return contadorF;
	}

	public void setContadorF(int contadorF) {
		this.contadorF = contadorF;
	}

	public Funcionario[] getEmpregados() {
		return empregados;
	}

	public void setEmpregados(Funcionario[] empregados) {
		this.empregados = empregados;
	}

	public void expandeVetor(){ //Expandindo Vetor
		int tamanho = empregados.length + 5;
		Funcionario [] maior = Arrays.copyOf(empregados, tamanho);
		empregados = maior;
	}
	
	public void adiciona(Funcionario f){
		if(contadorF < empregados.length)
			empregados[contadorF++] = f;
		else{
			expandeVetor();
			adiciona(f);
		}
	}
	
	public void mostraEmpregados(){
		int i = 1;
		for (Funcionario funcionario : empregados) {			
			if(funcionario != null){
				funcionario.mostra();
				i++;
			}
		}
		
	}
	
	public boolean contem(Funcionario f){
		for (int i = 0; i < contadorF; i++) {
			if(empregados[i] == f)
				return true;  //Achou
		}
		return false; //NAO ACHOU
	}
}