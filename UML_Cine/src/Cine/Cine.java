package Cine;

import java.util.ArrayList;

public class Cine {
	private String nombre;
	private String direccion;
	private ArrayList<Sala> salas;
	private ArrayList<SalaVIP> salasVip;
	private ArrayList<Empleado> empleados;
	private ArrayList<Compra> compras;
	private ArrayList<Pelicula> peliculas = new ArrayList();
	private ArrayList<Venta> ventas;

	public Cine(String nombre, String direccion) {
		super();
		 this.nombre = nombre;
		 this.direccion = direccion;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Sala> getSalas() {
		return salas;
	}

	public void setSalas(ArrayList<Sala> salas) {
		this.salas = salas;
	}

	public ArrayList<SalaVIP> getSalasVip() {
		return salasVip;
	}

	public void setSalasVip(ArrayList<SalaVIP> salasVip) {
		this.salasVip = salasVip;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public ArrayList<Compra> getCompras() {
		return compras;
	}

	public void setCompras(ArrayList<Compra> compras) {
		this.compras = compras;
	}

	public void agregarSala(Sala sala) {
		if (this.salas == null)
			this.salas = new ArrayList();
		this.salas.add(sala);
	}

	public void removerSala(Sala sala) {
		if (this.salas != null) {
			this.salas.remove(sala);
		}
	}

	public void agregarSalaVip(SalaVIP sala) {
		if (this.salasVip == null)
			this.salasVip = new ArrayList();
		this.salasVip.add(sala);
	}

	public void removerSalaVip(SalaVIP sala) {
		if (this.salasVip != null) {
			this.salasVip.remove(sala);
		}
	}

	public void agregarEmpleado(Empleado empleado) {
		if (this.empleados == null) {
			this.empleados = new ArrayList();
		}
		this.empleados.add(empleado);

	}

	public void modificarEmpleado(Empleado empleado, Empleado empleadoNuevo) {
		this.empleados.remove(empleado);
		this.empleados.add(empleadoNuevo);
	}

	public void removerEmpleado(Empleado empleado) {
		if (this.empleados != null) {
			this.empleados.remove(empleado);
		}
	}

	public void agregarCompra(Compra compra) {
		if (this.compras == null) {
			this.compras = new ArrayList();
		}
		this.compras.add(compra);
	}

	public void removerCompra(Compra compra) {
		if (this.compras != null) {

			this.compras.remove(compra);
		}

	}

	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(ArrayList<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	public ArrayList<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(ArrayList<Venta> ventas) {
		this.ventas = ventas;
	}
	

	@Override
	public String toString() {
		return "Cine [nombre=" + nombre + ", direccion=" + direccion + ", salas=" + salas + ", salasVip=" + salasVip
				+ ", empleados=" + empleados + ", compras=" + compras + ", peliculas=" + peliculas + ", ventas="
				+ ventas + "]";
	}

	public void agregarVentas(Venta venta) {
		if (this.ventas == null) {
			this.ventas = new ArrayList();
		}
	}

	public void removerVentas(Venta venta) {
		if (this.ventas != null) {
			this.ventas.remove(ventas);
		}
	}

	public void agregarPelicula(Pelicula pelicula) {
		this.peliculas.add(pelicula);
	}
	public void removerPelicula(Pelicula pelicula) {
		this.peliculas.remove(pelicula);
	}
	
	public Pelicula getPelicula(String titulo) {
		for(Pelicula p: peliculas) {
			if(p.getTitulo().equalsIgnoreCase(titulo)) {
				return p;
			}
		}
		return null;
	}
}

