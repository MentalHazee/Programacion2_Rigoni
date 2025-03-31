package Practico_3.Kata5;

public class Main {
    public static void main(String[] args) {
        NaveEspacial HALCON_MILENARIO=new NaveEspacial("HALCON MILENARIO",50);
        NaveEspacial ENTERPRISE= new NaveEspacial("ENTERPRISE",40);

        HALCON_MILENARIO.avanzar(60);
        HALCON_MILENARIO.recargarCombustible(40);
        HALCON_MILENARIO.mostrarEstado();
        HALCON_MILENARIO.avanzar(60);
        HALCON_MILENARIO.mostrarEstado();
        System.out.println("________________________");
        ENTERPRISE.despegar();
        ENTERPRISE.recargarCombustible(150);
        ENTERPRISE.recargarCombustible(40);
        ENTERPRISE.mostrarEstado();
        ENTERPRISE.avanzar(60);
        ENTERPRISE.mostrarEstado();



    }
}
