public class BonecoDeOlinda implements Boneco{
	
	//Fica implicito que temos uma constante declarada;
	private int contador;
	private final String[] partes = {"\n o\n", "/", "|", "\\\n", "/", "\\"}; //Nao eh necessario tornar as partes publicas;
	
	public BonecoDeOlinda(){
		contador = 0;
	}
	
	public int getContador(){
		return this.contador;
	}
	
	public void inserirParte(){
		if(this.contador < QUANTIDADE_DE_PARTES)
			this.contador++; //Incrementa para Mostrar mais;
	}
	
	public String show(){
		String str = "\nBONECO\n====\n   |"; //Gerando o Boneco Formatado;
		
		for(int i = 0; i < contador && i < partes.length; i++){ //Evitando procurar por indice inexistente;
			str += partes[i];
		}
		
		return String.format("%s\n", str);
	}
	
	@Override
	public String toString(){
		return this.show(); //Melhorar;
	}
}
