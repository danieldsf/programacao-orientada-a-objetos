package br.com.caelum.cap04.sec14;

public class Casa {
	
	String cor;
	Porta porta1;
	Porta porta2;
	Porta porta3;
	
	int quantasPortasEstaoAbertas(){
		return (porta1.estaAberta() ? 1 : 0) + (porta2.estaAberta() ? 1 : 0) + (porta3.estaAberta() ? 1 : 0);
	}
	
	void pinta(String s){
		cor = s;
	}
}
