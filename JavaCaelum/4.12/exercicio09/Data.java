class Data{
	int dia;
	int mes;
	int ano;

	String formatada(){
		return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
	}
}