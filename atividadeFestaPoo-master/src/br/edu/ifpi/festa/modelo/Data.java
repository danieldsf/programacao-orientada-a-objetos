package br.edu.ifpi.festa.modelo;

public class Data {
	
	private String dataFesta;
	private String horaInicio;
	private String horaTermino;
	public String getDataFesta() {
		return dataFesta;
	}
	public void setDataFesta(String dataFesta) {
		this.dataFesta = dataFesta;
	}
	public String getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	public String getHoraTermino() {
		return horaTermino;
	}
	public void setHoraTermino(String horaTermino) {
		this.horaTermino = horaTermino;
	}
	
	@Override
	public String toString(){
		return String.format("Dia: %s Horario: %s-%s", this.getDataFesta(), this.getHoraInicio(), this.getHoraTermino());
	}
	
}
