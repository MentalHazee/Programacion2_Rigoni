package e_commerce;

public class TarjetaCredito implements PagoConDescuento{
	
	private String numeroTarjeta;

	public TarjetaCredito(String numeroTarjeta) {
		super();
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	
	@Override
	public void procesarPago(double monto) {
		System.out.println("El monto es $" + monto + " en la cuenta: " + numeroTarjeta);
	}
	
	@Override
	public double aplicarDescuento(double porcentaje) {
		return 1 - (porcentaje / 100);
	}
	
}
