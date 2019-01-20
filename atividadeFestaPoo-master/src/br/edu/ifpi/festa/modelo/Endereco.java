package br.edu.ifpi.festa.modelo;

public class Endereco {
	
	private String pais;
	private String provincia;
	private String cidade;
	private String codigoPostal;
	private String descricaoMunicipal;
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public String getProvincia() {
		return provincia;
	}
	
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getCodigoPostal() {
		return codigoPostal;
	}
	
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	public String getDescricaoMunicipal() {
		return descricaoMunicipal;
	}
	
	public void setDescricaoMunicipal(String descricaoMunicipal) {
		this.descricaoMunicipal = descricaoMunicipal;
	}
}
