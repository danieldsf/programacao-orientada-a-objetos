package br.edu.ifpi.restaurante.modelo;

public class Restaurante {
	//Numera Mesas com i
	private String nome;
	private Mesa[] mesas;
	
	public Restaurante(String nome){
		this.nome = nome;
		this.mesas = new Mesa[20];
		this.iniMesa();
	}
	
	private void iniMesa(){
		for(int i = 0; i < mesas.length; i++) //Numera Mesas:
			this.mesas[i] = new Mesa(i+1);
	}
	
	public Mesa[] getMesas() {
		return mesas;
	}

	public void setMesas(Mesa[] mesas) {
		this.mesas = mesas;
	}
	
	//Melhorar:
	public Mesa abreMesa(int numero){
		this.getMesas()[numero - 1].setEstado(Mesa.OCUPADA);
		return this.getMesas()[numero - 1];
	}
	
	public int contaCriterio(String criterio){
		int cont = 0;
		
		for (Mesa mesa : mesas) 
			if(mesa.getEstado() == criterio)
				cont++;
			
		return cont;
	}
	
	public int contaOcupadas(){
		return contaCriterio(Mesa.OCUPADA);
	}
	
	public int contaDisponiveis(){
		return contaCriterio(Mesa.DISPONIVEL);
	}
	
	public int contaReservadas(){
		return contaCriterio(Mesa.RESERVADA); 
	}
	
	public double totalAtual(){
		double valorTotal = 0;
		
		for (Mesa mesa : mesas) {
			if(mesa.getNumeroPedido() > 0)
				valorTotal += mesa.getTotalPedidos();
		}
		
		return valorTotal;
	}
	
	public String toString(){
		String str = String.format("Restaurante: %s" +
		"\nTotal de Mesas: %d, Ocupadas: %d, Disponiveis: %d, Reservadas: %s"
				+ "\nFaturamento Atual: R$ %.2f\n", this.nome, 
				this.getMesas().length, this.contaOcupadas(), 
				this.contaDisponiveis(), this.contaReservadas(), this.totalAtual());
		
		return str;
	}
}
