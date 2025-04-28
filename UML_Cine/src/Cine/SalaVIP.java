package Cine;

public class SalaVIP extends Sala {

	protected String beneficios;

	
	public SalaVIP(int numero, int capacidad, Funcion funcion, String beneficios) {
		super(numero, capacidad, funcion);
		this.beneficios = beneficios;
	}

	

	public String getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}

	@Override
	public String toString() {
		return "SalaVIP [beneficios=" + beneficios + "]";
	}
	
	
}
