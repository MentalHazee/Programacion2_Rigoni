package Practico_5;

public class TicketSoporte {
	private int id;
	private String descripcion;
	private Estados estado;
	private String fechaCreacion;
	private Usuario user = null;
	private String tecnico = "No hay técnico";

	// --------------- CONSTRUCTOR ---------------------

	public TicketSoporte(int id, String descripcion, String fechaCreacion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.estado = estado.ABIERTO;
		this.fechaCreacion = fechaCreacion;

	}

	public TicketSoporte(int id, String descripcion, String fechaCreacion, Usuario user) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.estado = estado.ABIERTO;
		this.fechaCreacion = fechaCreacion;
		this.user = user;

	}

	public TicketSoporte(int id, String descripcion, String fechaCreacion, Usuario user, String tecnico) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.estado = estado.ABIERTO;
		this.fechaCreacion = fechaCreacion;
		this.user = user;
		this.tecnico = tecnico;

	}

	// -------------- GETTER AND SETTER ------------------------------

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Estados getEstado() {
		return estado;
	}

	public void setEstado(Estados estado) {
		this.estado = estado;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public String getTecnico() {
		return tecnico;
	}

	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}

	// -------------------- METODOS ---------------------

	public void cerrarTicket() {
		this.estado = estado.CERRADO;
	}

	public String mostrarDetalle() {
		return "Ticket ID: " + id + "\n" + "Descripción: " + descripcion + "\n" + "Estado: " + estado + "\n"
				+ "Fecha de creación: " + fechaCreacion + "\n" + "Usuario: " + user + "\n" + "Técnico: " + tecnico;
	}

	public void asignarTecnico(String tecnico) {
		this.tecnico = tecnico;
	}
	
	

}
