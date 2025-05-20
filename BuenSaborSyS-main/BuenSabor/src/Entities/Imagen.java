package Entities;

public class Imagen {

	private String demoninacion;

	public Imagen() {
	}

	public Imagen(String demoninacion) {
		this.demoninacion = demoninacion;
	}

	public String getDemoninacion() {
		return demoninacion;
	}

	public void setDemoninacion(String demoninacion) {
		this.demoninacion = demoninacion;
	}

	@Override
	public String toString() {
		return "Imagen{" + "demoninacion='" + demoninacion + '\'' + '}';
	}
}
