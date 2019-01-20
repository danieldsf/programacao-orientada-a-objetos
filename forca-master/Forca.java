import java.util.*;

public final class Forca{
	private List<Tema> temas;
	private List<Rodada> rodadas;
	private boolean finalizada;
	//Singleton:
	private static final Forca INSTANCE = new Forca();
	
	private Forca(){
		//Atribuicoes que independem do Singleton
		finalizada = false;
		temas = new ArrayList<>();
		rodadas = new ArrayList<>();
		//Fim Atribuicoes que independem do Singleton
	}
	
	public static Forca getInstance(){
		return INSTANCE;
	}
	//Fim Singleton;
	public List<Tema> getTemas(){
		return this.temas;
	}
	
	public boolean isFinalizada(){
		return finalizada;
	}
	
	public void adicionarConteudo(String tema, String... palavras){
		tema = tema.toUpperCase();
		List<Conteudo> c = new ArrayList<>();
		for(String p : palavras){
			c.add(new Conteudo(p.toUpperCase()));
		}
		
		for(int i = 0; i < temas.size(); i++){
			if(temas.get(i).getNome().equals(tema)){
				temas.get(i).getConteudoAtivo().addAll(c);
				return;
			}
		}
		Tema t = new Tema(tema);
		t.getConteudoAtivo().addAll(c);
		temas.add(t);
	}
	
	public Rodada abreRodada(Jogador jogador){
		Rodada rodada = new Rodada(jogador);
		//
		int nTema = randomRange(0, temas.size() - 1);
		int nPalavras = randomRange(1,3);
		rodada.setTema(temas.get(nTema));
		Set<Conteudo> conj = new HashSet<>();
		for(int i = 0; i < nPalavras && i < rodada.getTema().getConteudoAtivo().size(); i++){
			conj.add(rodada.getTema().getConteudoAtivo().get(i));
		}
		rodada.setConteudo(conj);
		//
		rodadas.add(rodada);
		return rodada;
	}
	
	public int randomRange(int min, int max){
		Random random = new Random();
		return random.nextInt(max - min + 1) + min; //Inclue piso e teto;
	}
	
	public List<Rodada> getRank(){
		List<Rodada> lista = new ArrayList<>();
		for(Rodada r : rodadas){
			if(r.getStatus().equals(Rodada.VENCIDA)){
				lista.add(r);
			}
		}
		RodadaComparator rc = new RodadaComparator();
		Collections.sort(lista, rc);
		
		return lista;
	}
	
	public boolean enabledRodada(){
		int cont = 0;
		
		for(Tema t : temas){
			if(t.getConteudoAtivo().size() > 0){
				cont++;
			}
		}
		
		return cont != 0;
	}
}
