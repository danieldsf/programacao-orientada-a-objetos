package br.com.caelum.cap04.sec12;

class Funcionario {
	String nome;
	String departamento;
	Data dataEntrada;
	double salario;
	String Rg;
	
	void recebeAumento(double aumento){
		this.salario += aumento;
	}
	
	double calculaSalarioAnual(){
		return this.salario * 12;
	}
	
	double calculaIR(){
		return 0;
	}
	
//	void mostra(){
//		String str = "Dados do Funcionario: \nNome do Funcionario: " + this.nome
//				+ "\nDepartamento: " + this.departamento + "\nData de Entrada: " 
//				+ this.dataEntrada + "\n Salario: " + this.salario + "\n RG: " + this.Rg;
//		
//		System.out.println(str);
//	}
	
//	void mostra(){
//		String str = "Dados do Funcionario: \nNome do Funcionario: " + this.nome
//				+ "\nDepartamento: " + this.departamento + "\nData de Entrada: " 
//				+ "Dia: " + this.dataEntrada.dia + " / Mes: " + this.dataEntrada.mes 
//				+ " / Ano: " + this.dataEntrada.ano + "\n Salario: " + this.salario + 
//				"\n RG: " + this.Rg;
//		
//		System.out.println(str);
//	}

	void mostra(){
		String str = "Dados do Funcionario: \nNome do Funcionario: " + this.nome
				+ "\nDepartamento: " + this.departamento + "\nData de Entrada: " 
				+ this.dataEntrada.dataFormatada() + "\nSalario: " + this.salario + 
				"\nRG: " + this.Rg;
		
		System.out.println(str);
	}
	
	
}
