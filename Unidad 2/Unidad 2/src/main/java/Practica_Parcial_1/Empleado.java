package Practica_Parcial_1;

public class Empleado {

    //atributos
    private String nombre;
    private int dni;

    //constructor
    public Empleado(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    //getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

}
