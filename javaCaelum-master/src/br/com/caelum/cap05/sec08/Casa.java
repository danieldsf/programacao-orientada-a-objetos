package br.com.caelum.cap05.sec08;

import java.util.Arrays;

public class Casa {
	String cor;
	Porta portas[] = new Porta[255];
	int quantidadeDePortas = 0;
	
	int quantasPortasEstaoAbertas(){
		int cont = 0;
		
		for (int i = 0; i < quantidadeDePortas; i++) {
			cont += (portas[i].aberta ? 1 : 0);
		}
		
		return cont;
	}
	
	void adicionaPorta(Porta p){
		if(quantidadeDePortas < portas.length)
			portas[quantidadeDePortas++] = p;
		else{
			expandeVetor();
			adicionaPorta(p);
		}
	}
	
	void expandeVetor(){
		Porta [] maior = Arrays.copyOf(portas, portas.length + 5);
		portas = maior;
	}
	
	void pinta(String s){
		cor = s;
	}
	
	int totalDePortas(){
		return quantidadeDePortas;
	}
}