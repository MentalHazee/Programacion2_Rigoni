package test;
import Cine.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		
		Cine palmares = new Cine("Palmares Open Mall", "San Martin Sur 333");
		Cine barracas = new Cine("Barracas", "Acceso 1231");
		Empleado lucas = new Empleado("Lucas Norton", 43585221);
		Empleado german = new Empleado("German Marino", 44268440);
		Empleado julian = new Empleado("Julian Santos", 40941122);
		
		//------------------------------------
		
		//agregamos dos objetos EMPLEADO a palmares
		palmares.agregarEmpleado(lucas);
		palmares.agregarEmpleado(german);
		//asignamos un objeto CINE a cada empleado
		lucas.agregarCine(palmares);
		lucas.agregarCine(barracas);
		german.agregarCine(palmares);
		
		for (Empleado empleadis : palmares.getEmpleados()) {
			System.out.println(empleadis.getNombre()+" - DNI: "+empleadis.getDNI());
		}
		
		for (Cine cinis : lucas.getCines()) {
			System.out.println(cinis.getNombre());
		}
		
		/*
		Cine barraca = new Cine("Barraca","Calle Falsa 123");
		Empleado horacio = new Empleado("Horacio",43213613);
		Empleado matias = new Empleado("Matias",452613541);
		Pelicula lotr = new Pelicula("El Señor de los Anillos",Genero.ACCION);
		Entrada entrada=new Entrada(12.33,"Silla F");
		Entrada entrada2=new Entrada(10.66,"Silla A");
		Funcion matutina=new Funcion("10:00");
		Sala sala=new Sala(12,13,matutina);
		SalaVIP salavip= new SalaVIP(12,20,matutina,"CINE FAN");
		Cliente lucas= new Cliente("lucas","lucas@gmail.com");
		ClienteVIP julian=new ClienteVIP("julian","julianelmasvirgo@yahoo.com",1233);
		Pago pago=new Pago(12.23,TipoPago.TARJETA);
		Venta venta=new Venta(new Date(124,3,2),pago,matutina,lucas);

		
		//---------------------------------
		barraca.agregarEmpleado(horacio);
		System.out.println("Ponete a laburar "+horacio);
		barraca.agregarEmpleado(matias);
		System.out.println("Ponete a laburar "+matias);
		barraca.agregarPelicula(lotr);
		System.out.println("Agregamos la pelicula"+lotr.toString());
		barraca.agregarSala(sala);
		System.out.println("Dirigirse a la sala "+sala.toString());
		barraca.agregarSalaVip(salavip);
		System.out.println("dirigirse a la sala no pobre "+salavip.toString());
		venta.agregarCliente(lucas);
		System.out.println("Bienvenido "+lucas.toString());
		matutina.agregarEntrada(entrada);
		System.out.println("Sentate "+entrada.toString());
		venta.agregarCliente(julian);
		System.out.println("Bienvenido VIP "+julian.toString());
		matutina.agregarEntrada(entrada2);
		System.out.println("Sentate "+entrada2.toString());*/
		
		
		
	}

}
