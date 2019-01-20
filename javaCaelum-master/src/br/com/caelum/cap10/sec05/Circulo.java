package br.com.caelum.cap10.sec05;

public class Circulo implements AreaCalculavel{
	
	private int raio;
	
	public double calculaArea(){
		return Math.PI * this.raio * this.raio;
	}
	
}
