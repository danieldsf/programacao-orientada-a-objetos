package br.com.caelum.cap09.sec06;

public class Banco {
	private int contador; 
	private Conta contas [];
	
	public Banco(){
		contas = new Conta[255]; //Limite;
	}
	
	public void adiciona(Conta c){
		if(contador < contas.length)
			contas[contador++] = c;
	}
	
	public Conta pegaContas(int x){
		return contas[x];
	}
	
	public int pegaTotalDeContas(){
		return contador;
	}
}
