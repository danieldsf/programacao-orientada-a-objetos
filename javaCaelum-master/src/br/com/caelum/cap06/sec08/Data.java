package br.com.caelum.cap06.sec08;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	String dataFormatada(){
		return String.format("%02d/%02d/%04d", dia, mes, ano);
	}
	
}
