package Practico_4.GestionDeEmpleados;

public class Main {
    public static void main(String[] args) {
        Empleados Lucas = new Empleados("Lucas Norton", "Administrativo");
        Empleados Ignacio = new Empleados("Ignacio Navarria", "Gerente", 753552.95);
        Empleados German = new Empleados("German Marino", "Seguridad", 635000.00);

        System.out.println("\n");

        Ignacio.actualizarSalario(50);
        Lucas.actualizarSalario(1200000.00);

        System.out.println(Ignacio);
        System.out.println(Lucas);
        System.out.println(German);

        System.out.println("\nLa cantidad total de empleados es de: "+ Empleados.mostrarTotalEmpleados());
    }
}
