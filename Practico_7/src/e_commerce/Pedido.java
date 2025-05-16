package e_commerce;
import java.util.*;

public class Pedido implements Pagable{
	
	private Cliente cliente;
	private String estado;
	private ArrayList<Producto> productos;
	
	
	public Pedido() {
		super();
	}

	public Pedido(ArrayList<Producto> productos) {
		super();
		this.productos = productos;
	}
	
	public Pedido(Cliente cliente) {
		super();
		this.cliente = cliente;
		this.estado = "Pendiente";
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	public double calcularTotal() {
		double total = 0.0;
		for (Producto producto: this.productos) {
			total += producto.getPrecio();
		}
		return total;
	}
	
	public void agregarProducto(Producto producto) {
		if (this.productos == null) {
			this.productos = new ArrayList(); 
		}
			this.productos.add(producto);
	}
	
	public void cambiarEstado(String nuevoEstado) {
		this.estado = nuevoEstado;
		cliente.notificar("El estado del pedido cambió a " + estado);
	}
}
