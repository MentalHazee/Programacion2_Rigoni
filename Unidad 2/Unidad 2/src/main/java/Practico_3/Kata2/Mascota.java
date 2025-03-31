package Practico_3.Kata2;

public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(){
    }

    //Generamos el constructor
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    //Generamos los Getter y Setters
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Comenzamos a crear los métodos
    public void mostrarInfo(){
        System.out.println("\nNombre de mascota: "+nombre+"\nEdad: "+edad+"\nEspecie: "+especie);
    }

    public void cumplirAnio(){
        edad = edad + 1;
    }

}
