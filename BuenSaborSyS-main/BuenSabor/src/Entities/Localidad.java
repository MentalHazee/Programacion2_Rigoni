package Entities;

public class Localidad {

    private String nombre;

    private Set<Domicilio> domicilios;

    public Localidad() {
    }

    public Localidad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Localidad{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}