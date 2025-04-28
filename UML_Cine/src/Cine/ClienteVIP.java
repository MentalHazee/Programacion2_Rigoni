package Cine;

public class ClienteVIP extends Cliente{

	protected float descuento;
	
	public ClienteVIP(String nombre, String email, float descuento) {
		super(nombre, email);
		this.descuento = descuento;
		// TODO Auto-generated constructor stub
	}

	public float getDescuento() {
		return descuento;
	}

	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return "ClienteVIP [descuento=" + descuento + "]";
	}
	
	
}
