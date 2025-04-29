package PracticoColecciones;

public class Producto {
	private String id;
	private String nombre;
	private double precio;
	private int cantidad;
	private CategoriaProducto categoria;

	public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.categoria = categoria;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public CategoriaProducto getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaProducto categoria) {
		this.categoria = categoria;
	}

	public void mostrarInfo() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "ID = " + id + "\nNombre = " + nombre + "\nPrecio = $" + precio + "\nCantidad = " + cantidad
				+ "\nCategoria = " + categoria;
	}

}
