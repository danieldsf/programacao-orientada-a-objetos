package br.com.caelum.cap06.sec08;

class Funcionario {
	private String nome;
	private String departamento;
	private Data dataEntrada;
	private double salario;
	private String Rg;
	
	public Funcionario(){
		
	}
	
	public Funcionario(String nome){
		this.nome = nome;
	}
	
	public void recebeAumento(double aumento){
		this.salario += aumento;
	}
	
	public double getGanhoAnual(){
		return this.getSalario() * 12;
	}
	
	public double calculaIR(){
		return 0;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Data getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Data dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getRg() {
		return Rg;
	}

	public void setRg(String rg) {
		Rg = rg;
	}

	public void mostra(){
		String str = "Dados do Funcionario: \nNome do Funcionario: " + this.nome
				+ "\nDepartamento: " + this.departamento + "\nData de Entrada: " 
				+ this.dataEntrada.dataFormatada() + "\nSalario: " + this.salario + 
				"\nRG: " + this.Rg;
		
		System.out.println(str);
	}
}
