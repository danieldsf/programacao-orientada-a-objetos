package br.edu.ifpi.festa.aplicacao;

import java.util.ArrayList;

import br.edu.ifpi.festa.modelo.*;

public class TestFactory {
	//Representar Cores;
	//
	public static void main(String[] args) {
		Endereco end1 = new Endereco();
		Endereco end2 = new Endereco();
		//
		Cliente cliente = new Cliente();
		cliente.setNome("Daniel Farias");
		cliente.setTelefone(new ArrayList<Telefone>());
		cliente.getTelefone().add(new Telefone("+5586994804953", "Pessoal"));
		cliente.setEndereco(end2);
		
		Tema tema = new Tema();
		tema.setNome("Gasparzinho");
		tema.setCor("Azul");
		tema.setValorAluguel(2500);
		tema.setItens(new ArrayList<String>());
		tema.getItens().add("Chaveiro");
		System.out.println(tema);
		
		Aluguel aluguel = new Aluguel();
		aluguel.setEndereco(end1);
		aluguel.setCliente(cliente);
		aluguel.setTema(tema);
		//
	}
}
