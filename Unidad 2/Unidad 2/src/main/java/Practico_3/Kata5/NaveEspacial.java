package Practico_3.Kata5;

public class NaveEspacial {
    private String nombre;
    private int combustible;

    public NaveEspacial(String nombre, int combustible){
        this.nombre=nombre;
        this.combustible=combustible;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public void despegar(){
        if (this.combustible<10){
            System.out.println("ERROR");
        }else{
            this.combustible=combustible-10;
        }

    }
    public void avanzar(int distancia){
        if (this.combustible<distancia){
            System.out.println("-x No posee suficiente combustible para avanzar x-");
        }else{
            this.combustible=combustible-distancia;
            System.out.println("Usted avanzó "+distancia+ " años luz");
        }

    }
    public void recargarCombustible(int cantidad){
        if(this.combustible+cantidad>100){
            System.out.println("-x Se ha exedido del máximo de combustible x-");
        }else{
            this.combustible=cantidad+combustible;
            System.out.println("Carga exitosa, usted cargó "+ cantidad+ " litros de combustible");
        }

    }
    public void  mostrarEstado(){
        System.out.println("La nave "+ nombre+" tiene "+ combustible+ " litros de combustible.");
    }
}
