package Cine;
import java.util.*;
public class Sala {
	private int numero;
	protected int capacidad;
	private ArrayList<Funcion>funcioneSala;
	
	public Sala(int numero, int capacidad,Funcion funcion) {
		super();
		this.numero = numero;
		this.capacidad = capacidad;
		this.agregarFuncionSala(funcion);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	

	@Override
	public String toString() {
		return "Sala [numero=" + numero + ", capacidad=" + capacidad + ", funcioneSala=" + funcioneSala + "]";
	}

	public ArrayList<Funcion> getFuncionesSala() {
		return funcioneSala;
	}

	public void setFuncionesSala(ArrayList<Funcion> funcionesSala) {
		this.funcioneSala = funcionesSala;
	}

	public void agregarFuncionSala(Funcion funcion) {
		if(this.funcioneSala==null) {
			this.funcioneSala=new ArrayList();
			
		}
		this.funcioneSala.add(funcion);
		
	}
	public void removerFuncion(Funcion funcion) {
		if(this.funcioneSala!=null) {
			this.funcioneSala.remove(funcion);
		}
	}
}
