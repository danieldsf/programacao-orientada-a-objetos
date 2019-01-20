package br.com.caelum.cap05.sec05;

import java.util.Arrays;

class Empresa{
	String nome;
	String cnpj;
	int contadorF = 0;
	Funcionario [] empregados = new Funcionario[5];
	
	void expandeVetor(){ //Expandindo Vetor
		int tamanho = empregados.length + 5;
		Funcionario [] maior = Arrays.copyOf(empregados, tamanho);
		empregados = maior;
	}
	
	void adiciona(Funcionario f){
		if(contadorF < empregados.length)
			empregados[contadorF++] = f;
		else{
			expandeVetor();
			adiciona(f);
		}
			
			//System.err.println("Array Cheio");
	}
	
	void mostraEmpregados(){
		int i = 1;
		for (Funcionario funcionario : empregados) {
			//System.out.printf("Funcionario %d: Salario: R$ %.2f\n", i, funcionario.salario);
			//System.out.printf("Funcionario %d: [%s]\n", i, funcionario);
			
			if(funcionario != null){
				funcionario.mostra();
				i++;
			}
			//i++;
		}
		
	}
	
	boolean contem(Funcionario f){
		//boolean achou = false;
		for (int i = 0; i < contadorF; i++) {
			if(empregados[i] == f)
				return true;  //Achou
		}
		
		return false; //NAO ACHOU
	}
}

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
				+ (this.dataEntrada != null ? this.dataEntrada.dataFormatada() : "00/00/00") + "\nSalario: " + this.salario + 
				"\nRG: " + this.Rg;
		
		System.out.println(str);
	}
	
	
}
