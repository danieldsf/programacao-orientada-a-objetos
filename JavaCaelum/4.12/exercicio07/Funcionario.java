public class Funcionario{
	String nome;
	String departamento;
	double salario;
	Data dataEntrada;
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

	void mostra(){
		System.out.printf("Nome: %s\nDepartamento: %s\nSalario: %.2f\n", this.nome, this.departamento, this.salario);
		System.out.printf("Data de Entrada\nDia: %d\nMes: %d\nAno: %d\n", this.dataEntrada.dia, this.dataEntrada.mes, this.dataEntrada.ano);
	}

}