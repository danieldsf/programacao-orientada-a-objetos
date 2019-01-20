package br.edu.ifpi.restaurante.modelo;

import java.util.Arrays;

public class Mesa {
	//CONSTANTES:
	public static final String DISPONIVEL = "Disponivel";
	public static final String OCUPADA = "Ocupada";
	public static final String RESERVADA = "Reservada";
	public static final String LINHA = "------------------------------------------";
	//ATRIBUTOS:
	private int numero;
	private Pedido pedidos[];
	private String estado;
	private int numeroPedido;
	private JuncaoDeMesas juncao;
	private int rateio;
	private boolean taxaServico;
	
	public Mesa(int numero){
		this.rateio = 1;
		this.taxaServico = false;
		this.estado = Mesa.DISPONIVEL;
		this.numero = numero;
		this.pedidos = new Pedido[5];
		this.normalizaPedidos();
	}
	
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getNumeroPedido() {
		return this.numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public JuncaoDeMesas getJuncao() {
		return this.juncao;
	}

	public void setJuncao(JuncaoDeMesas juncao) {
		this.juncao = juncao;
	}
	
	public void normalizaPedidos(){
		for(int i = 0; i < this.pedidos.length; i++)
			if(pedidos[i] == null)
				this.pedidos[i] = new Pedido();
	}
	
	public void adicionarPedido(Pedido pedido){
		if(!pedidoLiberado()){
			this.aumentaQtdPedidos(); //Aumenta vetor:	
		}
		
		this.pedidos[numeroPedido] = pedido;
		this.numeroPedido++;
	}
	
	public boolean pedidoLiberado(){
		return this.numeroPedido < this.pedidos.length;  
	}
	
	public void aumentaQtdPedidos(){
		//Metodos Estatico que copia valores e retorno um novo array:
		this.pedidos = Arrays.copyOf(this.pedidos, this.pedidos.length + 5);
	}
	
//	public void aumentaQtdPedidos(){ //Aumenta o array de pedidos:
//		int tamanho = this.pedidos.length + 10;
//		Pedido tempPedido[] = new Pedido[tamanho];
//
//		for (int i = 0; i < this.pedidos.length; i++) {
//			tempPedido[i] = this.pedidos[i];
//		}
//		
//		this.setPedidos(tempPedido);
//		this.normalizaPedidos();
//	}

	public int getRateio() {
		return rateio;
	}

	public void setRateio(int rateio) {
		this.rateio = rateio;
	}

	public boolean isTaxaServico() {
		return taxaServico;
	}

	public void setTaxaServico(boolean taxaServico) {
		this.taxaServico = taxaServico;
	}

	public double getTotalPedidos(){
		double valor = 0;
		
		for (int i = 0; i < this.getNumeroPedido(); i++)
			valor += pedidos[i].getValor();
		
		return this.taxaServico ? valor * 1.1 : valor;
	}
	
	public int getNumero() {
		return this.numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Pedido[] getPedidos() {
		return this.pedidos;
	}


	public void setPedidos(Pedido[] pedidos) {
		this.pedidos = pedidos;
	}

	public String getRelatorioMesa(){
		String str = "\n"+Mesa.LINHA+"\n";
		
		if(this.juncao == null){
			str += String.format("MESA: %s\n%s\nDESCRICAO\t\t\tQUANTIDADE\n", this.getNumero(), Mesa.LINHA);
			
			str += this; //ToString;
			
			str += Mesa.LINHA + "\n";
			str += String.format("Valor Total\t\t\tR$ %.2f\n", this.getTotalPedidos());
			
			if(this.rateio > 1)
				str += String.format("Valor do Rateio por %d\t\tR$ %.2f\n", this.rateio, (this.getTotalPedidos() / this.rateio));
		}else{
			str += String.format("MESAS JUNTAS: %s\n%s\nDESCRICAO\t\t\tQUANTIDADE\n", this.juncao.listaMesas(), Mesa.LINHA);
			str += Mesa.LINHA + "\n";
			
			str += this.juncao; //ToString;
			str += Mesa.LINHA + "\n";
			//
			double valorJuncao = 0;
			
			for (int i = 0; i < this.juncao.getContador(); i++) {
				valorJuncao += this.juncao.getMesas()[i].getTotalPedidos();
			}
			//
			str += String.format("Valor Total\t\t\tR$ %.2f\n", valorJuncao);
			
			if(this.juncao.getRateio() > 1)
				str += String.format("Valor do Rateio por %d\t\t\tR$ %.2f\n", this.juncao.getRateio(), (valorJuncao / this.juncao.getRateio()));
			//Fim juntar Mesas;
		}
		
		str += Mesa.LINHA + "\n";
		
		return str;
	}
	
	public String toString(){	
		String str = "";
		
		for (int i = 0; i < this.numeroPedido; i++)
			str += String.format("%s\t\tR$ %.2f\n", this.pedidos[i].getDescricao(), this.pedidos[i].getValor());
		
		return str;
	}
}