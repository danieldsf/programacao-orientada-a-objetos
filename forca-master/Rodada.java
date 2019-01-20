import java.util.*;

public class Rodada{
	
	//Constantes:
	public static final String EM_ANDAMENTO = "Em Andamento";
	public static final String PERDIDA = "Perdida";
	public static final String VENCIDA = "Vencida";
	
	//Atributos Comuns:
	private Set<String> letrasTotal;
	private Set<String> letrasCertas;
	private Set<String> letrasErradas;
	private String status;
	private int pontuacao;
	
	//Atributos Temporarios:
	private String nomeTema;
	private String textoCompleto;
	private String textoCifrado;
	private String bufferRetorno;
	
	//Composicoes:
	private Jogador jogador;
	private Set<Conteudo> conteudo;
	private Boneco boneco;
	private Tema tema;
	
	public Rodada(){
		//Evitando N.P.E:
		this.letrasTotal = new HashSet<>();
		this.letrasCertas = new HashSet<>();
		this.letrasErradas = new HashSet<>();
		
		//Carregar o Boneco se torna automatico, assim como o Conteudo;
		this.boneco = new BonecoDeOlinda();
		this.conteudo = new HashSet<>();
		this.bufferRetorno = "";
		this.status = Rodada.EM_ANDAMENTO;
	}
	
	public Rodada(Jogador jogador){
		this();
		this.jogador = jogador;
	}
	
	public Set<Conteudo> getConteudo(){
		return this.conteudo;
	}
	
	public void setConteudo(Set<Conteudo> conteudo){
		this.conteudo = conteudo;
		//
		this.setTextoCompleto();
		this.setTextoCifrado();
		this.setLetrasTotal();
	}
	
	private void setLetrasTotal(){
		for(int i = 0; i < this.textoCompleto.length(); i++){
			char l = textoCompleto.charAt(i);
			if(Character.isDigit(l) || Character.isLetter(l)){
				letrasTotal.add(String.valueOf(l));
			}
		}
	}
	
	public void setTema(Tema tema){
		this.tema = tema;
	}
	
	public Tema getTema(){
		return this.tema;
	}
	//public Set
	
	//Metodos para gerar as palavras:
	private void setTextoCompleto(){
		String str = "";
		
		boolean primeiro = true;
		
		for(Conteudo cc : conteudo){
			str += primeiro ? cc.getTexto() : " / " + cc.getTexto();
			primeiro = false;
		}
		
		this.textoCompleto = str;
	}
	//Gerando Cifra:
	private void setTextoCifrado(){
		String str = ""; //Acumulador;
		
		for(int i = 0; i < this.textoCompleto.length(); i++){
			if(Character.isLetter(textoCompleto.charAt(i)) || Character.isDigit(textoCompleto.charAt(i))){ //Se for letra ou digito;
				str += "-";
			}else{
				str += String.valueOf(this.textoCompleto.charAt(i));
			}
		}
		
		this.textoCifrado = str;
	}
	
	private void updateTextoCifrado(char letra){
		for(int i = 0; i < this.textoCompleto.length(); i++){
			if(letra == textoCompleto.charAt(i)){
				textoCifrado = textoCifrado.substring(0,i) + letra + textoCifrado.substring(i+1);
			}
		}
	}
	
	public void sugereLetra(char letra){
		String str = "Duplicada";
		
		if(letrasCertas.contains(String.valueOf(letra)) || letrasErradas.contains(String.valueOf(letra))){
			this.bufferRetorno = str;
			return;
		}
		
		int cont = 0;
		
		for(int i = 0; i < this.textoCompleto.length(); i++){
			if(letra == textoCompleto.charAt(i)){
				cont++;
			}
		}
		
		if(cont > 0){
			this.letrasCertas.add(String.valueOf(letra));
			str = "Aceita";
			pontuar(cont);
		}else{
			this.letrasErradas.add(String.valueOf(letra));
			str = "Errada";
			this.boneco.inserirParte();
		}
		
		avaliaStatus();
		updateTextoCifrado(letra); 
		this.bufferRetorno = str;
	}
	
	public String getTextoCompleto(){
		return this.textoCompleto;
	}
	
	public String getTextoCifrado(){
		return this.textoCifrado;
	}
	
	//Fim metodos para gerar as palavras;
	
	public void avaliaStatus(){
		if(this.letrasCertas.containsAll(this.letrasTotal)){
			this.status = Rodada.VENCIDA;
			
		}
		
		if(this.boneco.getContador() >= Boneco.QUANTIDADE_DE_PARTES){
			this.status = Rodada.PERDIDA;
		}
	}
	
	public boolean isExecutando(){
		return this.status.equals(Rodada.EM_ANDAMENTO);
	}
	
	public void pontuar(int n){
		this.pontuacao += 100 + (n * 15);
	}
	
	public int getPontuacao(){
		return this.pontuacao;
	}
	
	//Implementando Comparable Decrescente:
	public int compareTo(Rodada outra){
		if(this.pontuacao < outra.pontuacao)
			return 1; //-1
		
		if(this.pontuacao > outra.pontuacao)
			return -1; //1
			
		return 0;
	}
	
	public Jogador getJogador(){
		return this.jogador;
	}
	
	public String getStatus(){
		return this.status;
	}
	
	public String getDadosRodada(){
		String str = String.format("Jogador: %s - PONTOS: %d", this.getJogador().getNome(), this.getPontuacao());
		str += String.format("\n\nTema: %s\nTexto:\n\n%s\n\nLetras Corretas: %s\nLetras Erradas: %s", this.tema.getNome(), this.getTextoCifrado(), this.letrasCertas, this.letrasErradas);
		str += String.format("\nTotal de Erros: %d - Total de Acertos: %d", this.letrasCertas.size(), this.letrasErradas.size());
		str += String.format("\nUltima Sugestao: %s\n\n%s", this.bufferRetorno, this.boneco.show());
		return str;
	}
}
