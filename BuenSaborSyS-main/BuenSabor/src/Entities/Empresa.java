package entidades;

public class Empresa {

	private String nombre;
	private String razonSocial;
	private Integer cuil;

	private Set<Sucural> sucursales;

	public Empresa() {
	}

	public Empresa(String nombre, String razonSocial, Integer cuil) {
		this.nombre = nombre;
		this.razonSocial = razonSocial;
		this.cuil = cuil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public Integer getCuil() {
		return cuil;
	}

	public void setCuil(Integer cuil) {
		this.cuil = cuil;
	}

	@Override
	public String toString() {
		return "Empresa{" + "nombre='" + nombre + '\'' + ", razonSocial='" + razonSocial + '\'' + ", cuil=" + cuil
				+ '}';
	}
}