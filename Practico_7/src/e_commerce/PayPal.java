package e_commerce;

public class PayPal implements PagoConDescuento{
	private String email;

	public PayPal(String email) {
		super();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public void procesarPago(double monto) {
		System.out.println("El monto es $" + monto + " en la cuenta: " + email);
	}
	
	@Override
	public double aplicarDescuento(double porcentaje) {
		return 1 - (porcentaje / 100);
	}
}
