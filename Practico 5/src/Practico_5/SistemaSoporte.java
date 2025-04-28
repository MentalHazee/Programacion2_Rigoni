package Practico_5;

import java.util.ArrayList;
import java.util.List;

public class SistemaSoporte {
	private ArrayList<TicketSoporte> tickets= new ArrayList<>();
	private static int contador = 0;
	
   public TicketSoporte crearTicket(String descripcion, String fechaCreacion, Usuario usuario) {
        contador++;
        TicketSoporte ticket = new TicketSoporte(contador, descripcion, fechaCreacion, usuario);
        tickets.add(ticket);
        return ticket;
    }
	
	public void asignarTecnico(int ticketId, Tecnico tecnico) {
        for (TicketSoporte ticket : tickets) {
            if (ticket.getId() == ticketId) {
                ticket.asignarTecnico(tecnico.getNombre());
                return;
            }
        }
    }

    public void listarTickets() {
        for (TicketSoporte ticket : tickets) {
            System.out.println(ticket.mostrarDetalle());
        }
    }

    public static int obtenerCantidadTickets() {
        return contador;
    }
}
