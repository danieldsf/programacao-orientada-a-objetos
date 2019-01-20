package br.com.caelum.cap11.sec11;

//public class ValorInvalidoException extends Exception{
public class ValorInvalidoException extends RuntimeException{
	
//	public ValorInvalidoException(String msg) {
	public ValorInvalidoException(double valor) {
		super("Valor invalido: " + valor);
	}
	
}
