package Cine;
import java.util.*;
public class Funcion {
	
	private String horario;
	private ArrayList<Entrada>entradas;

	public Funcion(String horario) {
		super();
		this.horario = horario;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public ArrayList<Entrada> getEntradas() {
		return entradas;
	}

	public void setEntradas(ArrayList<Entrada> entradas) {
		this.entradas = entradas;
	}
	
	@Override
	public String toString() {
		return "Funcion [horario=" + horario + ", entradas=" + entradas + "]";
	}

	public void agregarEntrada(Entrada entrada) {
		if(this.entradas==null) {
			this.entradas=new ArrayList();
		}
		this.entradas.add(entrada);}
		
	public void removerEntrada(Entrada entrada) {
		if(this.entradas!=null) {
			this.entradas.remove(entrada);
		}
	}
}
	
		
