package e_commerce;

public class main {

	public static void main(String[] args) {
		//------ K.1 ------
		Producto ram = new Producto("Memoria RAM", 25632.00);
		Producto memoria = new Producto("M.2 de 500GB", 55245.50);
		Pedido lucas = new Pedido();
		
		lucas.agregarProducto(memoria);
		lucas.agregarProducto(ram);
		
		System.out.println(lucas.calcularTotal());
		
		//------ K.2 -------
		TarjetaCredito visa = new TarjetaCredito("56546846515");
		PayPal x = new PayPal("lucasorton@gmail.com");
		
		x.procesarPago(52000.00);
		x.aplicarDescuento(10);
		
		visa.procesarPago(48522.00);
		visa.aplicarDescuento(50);
		
		//------- K.3 -------
		Cliente cliente = new Cliente("Edward Norton", "edu@gmail.com");
		Pedido pedido = new Pedido(cliente);
		
		pedido.cambiarEstado("Procesado");
		pedido.cambiarEstado("Entregado");
	}

}
