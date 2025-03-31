package Practico_3.Kata4;

public class Main {
    public static void main(String[] args) {
        Gallina gallina1 = new Gallina(5, 35);
        Gallina gallina2 = new Gallina(2, 89);
        Gallina gallina3 = new Gallina(3,100);


        gallina1.mostrarInfo();
        gallina2.mostrarInfo();
        gallina3.mostrarInfo();
        gallina1.ponerHuevo();
        gallina1.envejecer();
        gallina1.mostrarInfo();
        gallina2.ponerHuevo();
        gallina2.envejecer();
        gallina2.mostrarInfo();
        gallina3.ponerHuevo();
        gallina3.envejecer();
        gallina3.mostrarInfo();




    }
}
