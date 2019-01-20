package br.edu.ifpi.restaurante.modelo;

public class JuncaoDeMesas {
	private int contador;
	private Mesa mesas[];
	private int rateio;
	
	public JuncaoDeMesas(Restaurante rs){
		this.rateio = 1;
		this.contador = 0;
		this.mesas = new Mesa[rs.getMesas().length];
	}
	
	public int getContador(){
		return this.contador;
	}

	public Mesa[] getMesas() {
		return this.mesas;
	}
	
	public void adicionarMesa(Mesa mesa){
		this.mesas[this.contador++] = mesa;
		
		JuncaoDeMesas juncaoAntiga = mesa.getJuncao();
		
		if(juncaoAntiga != null){
			juncaoAntiga.removeMesa(mesa);
		}		
		
		mesa.setJuncao(this);
	}

	public void removeMesa(Mesa mesa) {
		int index = -1;
		for (int i = 0; i < this.contador; i++) {
			if(mesa == mesas[i])
				index = i;
		}
		
		if(index != -1){
			this.mesas[index] = null;
		}
		
		for (int i = index; i < contador - 1; i++) {
			this.mesas[i] = this.mesas[i + 1]; 
		}
		
		this.contador--;
	}

	public void setMesas(Mesa[] mesas) {
		this.mesas = mesas;
	}
	
	public int getRateio() {
		return rateio;
	}

	public void setRateio(int rateio) {
		this.rateio = rateio;
	}
	
	public String listaMesas(){
		String str = "(";
		
		for (int i = 0; i < this.contador; i++) {
			if(i == 0)
				str += mesas[i].getNumero();
			else
				str += "," + mesas[i].getNumero();
		}
		
		str += ")";
		
		return str;
	}

	public String toString(){
		String str = "";
		
		for (int i = 0; i < this.contador; i++)
			str += mesas[i];	
		
		return str;
	}	
}