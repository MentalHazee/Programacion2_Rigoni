package Practico_3.Kata3;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro() {
    }

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void mostrarInfo(){
        System.out.println("\nTítulo: "+titulo+"\nAutor: "+autor+"\nAño de publicación: "+anioPublicacion);
    }

    public void setAnioPublicacion(int nuevoAnio) {
        if (nuevoAnio >= 1800 && nuevoAnio <= 2025){
            anioPublicacion = nuevoAnio;
        }else{
            System.out.println("\nEl año debe estar entre 1800 y 2025");
        }
    }

}



