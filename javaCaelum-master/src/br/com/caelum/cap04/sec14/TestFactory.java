package br.com.caelum.cap04.sec14;

public class TestFactory {

	public static void main(String[] args) {
		// Exercicio 1 - Pessoa;
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Julio Iglesias";
		pessoa.idade = 12;
		
		System.out.printf("Atualmente => Pessoa: %s, Idade: %d\n", pessoa.nome, pessoa.idade);
		
		pessoa.fazAniversario();
		pessoa.fazAniversario();
		pessoa.fazAniversario();
		
		System.out.printf("Apos 3 aniversarios => Pessoa: %s, Idade: %d\n", pessoa.nome, pessoa.idade);
		// Exercicio 2 - Porta:
		Porta porta = new Porta();
		porta.abre();
		porta.fecha();
		porta.pinta("VERMELHO");
		porta.pinta("AZUL");
		porta.dimensaoX = 12;
		porta.dimensaoY = 14;
		porta.dimensaoZ = 20;
		porta.abre();
		System.out.printf("Porta aberta: %s\n", porta.estaAberta() ? "SIM" : "NAO");
		// Exercicio 3 - Casa:
		Casa casa = new Casa();
		casa.pinta("AZUL");
		casa.porta1 = new Porta();
		casa.porta2 = new Porta();
		casa.porta3 = new Porta();
		casa.porta1.abre();
		casa.porta2.abre();
		casa.porta3.fecha();
		System.out.printf("Quantidade de portas abertas: %d\n", casa.quantasPortasEstaoAbertas());
	}
}