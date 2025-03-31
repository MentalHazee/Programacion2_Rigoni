package Practico_3.Kata1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Julian", "Santos", "Progaramación", 8.0);
        estudiante1.mostrarInfo();

        estudiante1.subirCalificacion(1);
        System.out.println(estudiante1.getCalificacion());
        System.out.println("");
        estudiante1.bajarCalificacion(4.5);
        System.out.println(estudiante1.getCalificacion());
    }
}