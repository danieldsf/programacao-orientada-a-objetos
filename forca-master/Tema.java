import java.util.*;

public class Tema{
	
	private String nome;
	private List<Conteudo> conteudoAtivo;
	private List<Conteudo> conteudoSorteado;
	
	//Construtores:
	public Tema(){
		//Inicializar para evitar NullPointerException:
		this.conteudoAtivo = new ArrayList<>();
		this.conteudoSorteado = new ArrayList<>();
	}
	
	public Tema(String nome){
		this();
		this.nome = nome;
	}
	
	public Tema(String nome, List<Conteudo> conteudoAtivo){
		this(nome);
		this.conteudoAtivo = conteudoAtivo;
	}
	
	//Getters e Setters:
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public Conteudo getConteudo(int index){
		//Operador Ternario - Evitar Indices inexistentes:
		return (index < this.conteudoAtivo.size()) ? this.conteudoAtivo.get(index) : null;
	}
	
	public int getQuantidadeByTipo(String tipo){
		int contador = 0;
		
		for(Conteudo cc : conteudoAtivo){
			if(cc.getTipo().equals(tipo))
				contador++;
		}
		
		return contador;
	}
	
	public List<Conteudo> getConteudoAtivo(){
		return this.conteudoAtivo;
	}
}
