package Cine;

public class Entrada {
	
	private double precio;
	private String asiento;
	
	public Entrada(double precio, String asiento) {
		super();
		this.precio = precio;
		this.asiento = asiento;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getAsiento() {
		return asiento;
	}

	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}

	@Override
	public String toString() {
		return "Entrada [precio=" + precio + ", asiento=" + asiento + "]";
	}
	
	
	
}
