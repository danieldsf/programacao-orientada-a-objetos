public class Funcionario{
	String nome;
	String departamento;
	double salario;
	String dataEntrada;
	String rg;

	void contrata(){
		salario = 880;
	}

	void recebeAumento(double aumento){
		salario += aumento;		
	}

	double calculaGanhoAnual(){
		return salario * 12;
	}
}