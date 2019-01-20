package br.edu.ifpi.restaurante.controlador;

import br.edu.ifpi.restaurante.modelo.*;

public class TestFactory {

	public static void main(String[] args) {
		
		Restaurante rs = new Restaurante("Feija de Corda"); //Criando Restaurante;
	
		Mesa m1 = rs.abreMesa(1);
		Mesa m2 = rs.abreMesa(2);
		Mesa m3 = rs.abreMesa(8);
		Mesa m4 = rs.abreMesa(10);
		Mesa m5 = rs.abreMesa(20);
		
		m2.adicionarPedido(new Pedido("Melao ao molho pardo", 15.0));
		m2.adicionarPedido(new Pedido("Farinha com caviar", 17.7));
		m2.adicionarPedido(new Pedido("Macarrao a Grega", 15.5));
		
		m1.adicionarPedido(new Pedido("Frango Dagua", 12.10));
		m1.adicionarPedido(new Pedido("Camaleao A Milanesa", 14.70));
		
		m3.adicionarPedido(new Pedido("Arroz Doce", 3.9));
		m3.adicionarPedido(new Pedido("Feijao Mexicano", 4.1));
		
		m4.adicionarPedido(new Pedido("Lasanha de Farinha", 80.0));
		m4.adicionarPedido(new Pedido("Marisabel de Soja", 12.30));
		
		m5.adicionarPedido(new Pedido("Farofa de Cuscuz", 31.00));
		m5.adicionarPedido(new Pedido("Legumes defumados", 17.5));
		m5.adicionarPedido(new Pedido("Panelada de beterraba", 11.5));
		m5.adicionarPedido(new Pedido("Torta de Chourico", 12.3));
		m5.adicionarPedido(new Pedido("Mousse de Cochonilha", 11.4));
		m5.adicionarPedido(new Pedido("Paio de Batata", 8.5));
		m5.setTaxaServico(true);
		m5.setRateio(2);
		
		JuncaoDeMesas jm1 = new JuncaoDeMesas(rs);
		JuncaoDeMesas jm2 = new JuncaoDeMesas(rs);
		
		jm1.adicionarMesa(m3);
		jm1.adicionarMesa(m4);
		
		jm2.adicionarMesa(m2);
		jm2.adicionarMesa(m1);
		jm2.setRateio(4);
		
		System.out.println(rs);
		System.out.println(m1.getRelatorioMesa());
		System.out.println(m3.getRelatorioMesa());
		System.out.println(m5.getRelatorioMesa());
	}
}
