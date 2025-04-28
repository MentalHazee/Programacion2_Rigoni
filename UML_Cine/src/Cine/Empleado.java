package Cine;

import java.util.ArrayList;

public class Empleado {

	private String nombre;
	private int dni;
	private ArrayList<Cine> cines;

	public Empleado(String nombre, int dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDNI() {
		return dni;
	}

	public void setDNI(int dni) {
		this.dni = dni;
	}

	public ArrayList<Cine> getCines() {
		return cines;
	}

	public void setCines(ArrayList<Cine> cines) {
		this.cines = cines;
	}
	

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", dni=" + dni + ", cines=" + cines + "]";
	}

	public void agregarCine(Cine cine) {
		if (this.cines == null) {
			this.cines = new ArrayList<>();
		}
		this.cines.add(cine);
	}

	public void removerCine(Cine cine) {
		this.cines.remove(cine);

	}
}