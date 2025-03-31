package Practico_3.Kata3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Libro libro1 = new Libro("Estudio en Escarlata", "Sir Arthur Conan Doyle", 2003);

        libro1.setAnioPublicacion(1750);
        libro1.mostrarInfo();
        libro1.setAnioPublicacion(1887);
        libro1.mostrarInfo();
    }
}
