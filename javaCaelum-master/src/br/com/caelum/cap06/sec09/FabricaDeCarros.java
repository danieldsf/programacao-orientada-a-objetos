package br.com.caelum.cap06.sec09;

public final class FabricaDeCarros {
	
	private static final FabricaDeCarros INSTANCE = new FabricaDeCarros();
	//Outra Forma:
	//private static FabricaDeCarros instancia;
	
	private FabricaDeCarros(){
	}
	
	public static FabricaDeCarros getInstance(){ //Nome => getInstance;
		return INSTANCE;
	}
	
	//public static synchronized FabricaDeCarros getInstance(){
	//	if(instancia == null) 	
	//		instancia = new FabricaDeCarros;
	//	return instancia;
	//}
}
