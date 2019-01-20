package br.com.caelum.cap05.sec08;

public class TestFactory {

	public static void main(String[] args) {
		
		// Exercicio 2 - Porta:
		Porta porta = new Porta();
		porta.abre();
		// Exercicio 3 - Casa:
		Casa casa = new Casa();
		casa.pinta("AZUL");
		casa.adicionaPorta(new Porta());
		casa.adicionaPorta(new Porta());
		casa.adicionaPorta(new Porta());
		casa.adicionaPorta(porta);
		casa.portas[0].abre();
		casa.portas[1].fecha();
		casa.portas[2].abre();
		casa.portas[3].fecha();
		System.out.printf("Total de Portas: %d, Quantidade de portas abertas: %d\n", casa.totalDePortas(), casa.quantasPortasEstaoAbertas());
	}
}