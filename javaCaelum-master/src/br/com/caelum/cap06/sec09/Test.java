package br.com.caelum.cap06.sec09;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FabricaDeCarros fb1 = FabricaDeCarros.getInstance();
		FabricaDeCarros fb2 = FabricaDeCarros.getInstance();
		
		System.out.println(fb1);
		System.out.println(fb2);
	}

}
