public class Jogador{
	private String nome;
	
	public Jogador(){
		//Cria um nome padrao:
		this.nome = "Sem Nome";
	}
	
	public Jogador(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	@Override
	public String toString(){
		return String.format("Nome do Jogador: %s", this.nome);
	}
}
