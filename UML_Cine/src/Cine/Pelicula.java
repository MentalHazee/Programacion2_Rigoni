package Cine;

import java.util.ArrayList;

public class Pelicula {
	
	private String titulo;
	private Genero genero;
	private ArrayList<Funcion>funciones;
	
	public Pelicula(String titulo, Genero genero) {
		super();
		this.titulo = titulo;
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public ArrayList<Funcion> getFunciones() {
		return funciones;
	}

	public void setFunciones(ArrayList<Funcion> funciones) {
		this.funciones = funciones;
	}
	
	
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", genero=" + genero + ", funciones=" + funciones + "]";
	}

	public void agregarFuncion(Funcion funcion) {
		if(this.funciones==null){
			this.funciones=new ArrayList();
			}
		this.funciones.add(funcion);
	}
	public void removerFuncion(Funcion funcion) {
		if(this.funciones!=null) {
			this.funciones.remove(funcion);
		}
	}
	
}
