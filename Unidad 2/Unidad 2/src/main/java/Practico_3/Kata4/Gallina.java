package Practico_3.Kata4;

public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    private static int contadorGallina=0;

    public Gallina(int edad, int huevosPuestos) {
        idGallina = ++contadorGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }

    public void ponerHuevo(){
        huevosPuestos=huevosPuestos+1;
    }

    public void envejecer(){
        edad=edad+1;
    }

    public void mostrarInfo(){
        System.out.println(" La gallina "+idGallina+ " que tiene "+ edad +" años "+" puso "+huevosPuestos+" huevos.");
    }

}
