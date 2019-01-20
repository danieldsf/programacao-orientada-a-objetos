public class Conteudo{
	private String texto;
	private String tipo;
	public static final String FRASE = "Frase";
	public static final String PALAVRA = "Palavra";
	
	public Conteudo(){
	}
	
	public Conteudo(String texto){
		this.texto = texto;
		// Assim que seta uma palavra, define o tipo, nao eh necessario setter nem para tipo e nem para texto;
		this.setTipo(); 
	}
	
	public String getTipo(){
		return this.tipo;
	}
	
	public String getTexto(){
		return this.texto;
	}
	
	//private void defineTipo(){ - Um nome alternativo:
	private void setTipo(){
		//Se contem espaco, sera computado como frase;
		if(this.texto.contains(" ")) 
			this.tipo = FRASE;
		else
			this.tipo = PALAVRA;
	}	
	
	//Eh desnecessario um setTipo, pois o tipo eh imutavel:
	//public void setTipo(String tipo){
	//	this.tipo = tipo;
	//}
}
