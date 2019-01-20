package br.com.caelum.cap05.sec08;

public class Porta {
	
	boolean aberta;
	String cor;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;
	
	boolean estaAberta(){
		return aberta;
	}
	
	void abre(){
		aberta = true;
	}
	
	void fecha(){
		aberta = false;
	}
	
	void pinta(String s){
		cor = s;
	}
}
