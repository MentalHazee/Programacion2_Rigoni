package Cine;

import java.util.*;

public class Compra {
	private Date fecha;
	private ArrayList<Insumo> insumos = new ArrayList();
	private ArrayList<Proveedor>proveedores;
	
	public Compra(Date fecha) {
		this.fecha = fecha;
		this.agregarInsumo(new Insumo());
		//this.agregarProveedor
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public ArrayList<Insumo> getInsumos() {
		return insumos;
	}

	public void setInsumos(ArrayList<Insumo> insumos) {
		this.insumos = insumos;
	}

	public void agregarInsumo(Insumo insumo) {

		this.insumos.add(insumo);
	}
	

	public void removerInsumo(Insumo insumo) {

		this.insumos.remove(insumo);
	}

	public ArrayList<Proveedor> getProveedores() {
		return proveedores;
	}

	public void setProveedores(ArrayList<Proveedor> proveedores) {
		this.proveedores = proveedores;
	}
	
	
	@Override
	public String toString() {
		return "Compra [fecha=" + fecha + ", insumos=" + insumos + ", proveedores=" + proveedores + "]";
	}

	public void agregarProveedor(Proveedor proveedor) {
		if(this.proveedores==null) {
			this.proveedores=new ArrayList();
		}
		this.proveedores.add(proveedor);
		
	}
	public void removerProveedor(Proveedor proveedor) {
		if(this.proveedores!=null) {
			this.proveedores.remove(proveedor);
		}
	}
}


