package Practico_5;

import java.util.ArrayList;

public class Usuario {
	private int id;
	private String nombreCompleto;
	private String correo;
	private ArrayList<TicketSoporte> tickets = null;

	// --------------- CONSTRUCTOR --------------------------

	public Usuario(int id, String nombreCompleto, String correo) {
		super();
		this.id = id;
		this.nombreCompleto = nombreCompleto;
		this.correo = correo;
	}

	public Usuario(int id, String nombreCompleto, String correo, ArrayList tickets) {
		super();
		this.id = id;
		this.nombreCompleto = nombreCompleto;
		this.correo = correo;
		this.tickets = tickets;
	}

	// -------------- GETTER AND SETTER ------------------------------

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	
	public ArrayList<TicketSoporte> getTickets() {
		return tickets;
	}

	public void setTickets(ArrayList<TicketSoporte> tickets) {
		this.tickets = tickets;
	}
	
	@Override
	public String toString() {
		return nombreCompleto;
	}


	// -------------------- METODOS ---------------------

	public void agregarTicket(TicketSoporte ticket) {
		if (this.tickets == null) {
			this.tickets = new ArrayList();
		}
		this.tickets.add(ticket);
	}

	public void removerTicket(TicketSoporte ticket) {
		if (this.tickets != null) {
			this.tickets.remove(ticket);
		}
	}
	
	
}
