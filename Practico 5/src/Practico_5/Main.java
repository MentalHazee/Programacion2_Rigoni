package Practico_5;

public class Main {

	public static void main(String[] args) {

		SistemaSoporte sistema = new SistemaSoporte();

		Usuario usuario = new Usuario(1, "Luis Alberto Spinetta", "artaud@rock.com");
		Tecnico tecnico = new Tecnico(101, "Charly García", "Redes");

		TicketSoporte ticket1 = sistema.crearTicket("El sistema no responde.", "25/6/2024", usuario);
		sistema.asignarTecnico(ticket1.getId(), tecnico);

		sistema.listarTickets();
		System.out.println("\nCantidad de tickets creados: " + SistemaSoporte.obtenerCantidadTickets());

		/*
		 * Usuario lucas = new Usuario (6969, "Lucas Eduardo Orton",
		 * "orton@randy.edu.ar"); TicketSoporte virus = new TicketSoporte(45135,
		 * "Se ha detectado un archivo malicioso", "09/12/2018", lucas,
		 * "Javier Piñata"); TicketSoporte peligro = new TicketSoporte(1523,
		 * "No se ha actualizado a Windows 11", "27/3/2025");
		 * 
		 * System.out.println(peligro.mostrarDetalle());
		 * 
		 * System.out.println("\n");
		 * 
		 * peligro.cerrarTicket(); System.out.println(peligro.mostrarDetalle());
		 * 
		 * System.out.println("\n");
		 * 
		 * System.out.println(virus.mostrarDetalle());
		 * 
		 * lucas.agregarTicket(peligro); lucas.agregarTicket(virus);
		 * 
		 * System.out.println("\n");
		 * 
		 * for(TicketSoporte tik : lucas.getTickets()) {
		 * System.out.println(tik.mostrarDetalle()); System.out.println("\n"); }
		 */

	}

}
