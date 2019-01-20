import javax.swing.*;
import java.util.*;

public class TestFactory{
	
	//Funcao que encapsula a saida de dados com JOptionPane:
	public static void msg(String mensagem){
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
	//Funcao que encapsula entrada/saida de dados com JOptionPane:
	public static String input(String str){
		return JOptionPane.showInputDialog(str).toUpperCase();//Grava tudo maiusculo;
	}
	
	//Adicionando um tema:
	public static void adicionarTexto(){
		//
		String str = "Temas ja existentes:\n";
		List<Tema> temas = Forca.getInstance().getTemas();
		for(Tema t : temas){
			str += String.format("[Nome: %s - Textos: %d]\n", t.getNome(), t.getConteudoAtivo().size());
		}
		
		msg(str);
		//
		String tema = input("Digite o nome do Tema: ");
		String[] palavras = input("Digite palavras separadas por espaco").split(",");
		
		Forca.getInstance().adicionarConteudo(tema, palavras);
	}
	
	public static void showRank(){
		
		
		String str = "Ranking Geral: ";
		List<Rodada> listaR = Forca.getInstance().getRank();
		if(listaR.size() == 0){
			msg("Ainda nao eh posivel contabilizar o rank\ntente novamente mais tarde");
			return;
		}
		
		int cont = 1;
		for(Rodada r : listaR){
			str += String.format("\n%d - %s - %d pts", cont, r.getJogador().getNome(), r.getPontuacao());
			cont++;
		}
		
		msg(str);
	}
	
	public static void novaRodada(){
		if(!Forca.getInstance().enabledRodada()){
			msg("Nao eh possivel iniciar nova rodada\ntodas as palavras foram sorteadas!");
			return;
		}
		
		Jogador jogador = new Jogador(input("Digite o nome do Jogador: "));
		
		Rodada r = Forca.getInstance().abreRodada(jogador);
		
		while(r.getStatus() == Rodada.EM_ANDAMENTO){
			String l = input(r.getDadosRodada());
			r.sugereLetra(l.charAt(0));
		}
		
		if(r.getStatus().equals(Rodada.VENCIDA)){
			msg("Parabens, voce venceu");
		}
		
		if(r.getStatus().equals(Rodada.PERDIDA)){
			msg("Que pena, você perdeu");
		}
	}
	
	public static void main(String [] args){
		final String menu = "#### OPCOES ####\n\n" + 
		"1 - Adicionar Conteudo\n" + 
		"2 - Nova Rodada\n" + 
		"3 - Ver ranking\n"+
		"----------------------\n\n"+
		"0 - Sair\n\n"+
		"Digite uma opcao:";
		
		//Conjuntos:
		//Rodada;
		Forca f = Forca.getInstance();
		f.adicionarConteudo("futebol", "ceara", "bahia", "vasco", "juventus");
		f.adicionarConteudo("anime", "naruto", "another", "beyblade");
		f.adicionarConteudo("anime", "yu yu hakusho", "another", "beyblade");
		
		//msg(String.format("%s - %d, %d", f.getTemas().toString(), f.getTemas().get(0).getConteudoAtivo().size(), f.getTemas().get(1).getConteudoAtivo().size()));
		//
		while(true){
			String op = input(menu);
			
			switch(op){
				case "1":
					adicionarTexto();
				break;
				case "2":
					novaRodada();
				break;
				case "3":
					showRank();
				break;
				case "0":
					msg("Adeus!");
					System.exit(0); //Terminando a execucao;
				break;
				default:
					msg("Opcao Invalida, Tente Novamente!");
				break;
			}
			
		}
		//
	}
}
