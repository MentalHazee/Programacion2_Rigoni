package Cine;

import java.util.*;

public class Venta {
	private Date fecha;
	private Pago pago;
	private ArrayList<Funcion> funciones;
	private ArrayList<Cliente> clientes;

	public Venta(Date fecha, Pago pago, Funcion funcion, Cliente cliente) {
		super();
		this.fecha = fecha;
		this.pago = pago;
		this.agregarFuncion(funcion);
		this.agregarCliente(cliente);
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public ArrayList<Funcion> getFunciones() {
		return funciones;
	}

	public void setFunciones(ArrayList<Funcion> funciones) {
		this.funciones = funciones;
	}

	public void agregarFuncion(Funcion funcion) {
		if (this.funciones == null) {
			this.funciones = new ArrayList();
		}
		this.funciones.add(funcion);
	}

	public void removerFuncion(Funcion funcion) {
		if (this.funciones != null) {
			this.funciones.remove(funciones);
		}

	}

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}
	

	@Override
	public String toString() {
		return "Venta [fecha=" + fecha + ", pago=" + pago + ", funciones=" + funciones + ", clientes=" + clientes + "]";
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public void agregarCliente(Cliente cliente) {
		if (this.clientes == null) {
			this.clientes = new ArrayList();
		}
		this.clientes.add(cliente);
	}

	public void removerCliente(Cliente cliente) {
		if (this.clientes != null) {
			this.clientes.remove(cliente);
		}
	}

}
