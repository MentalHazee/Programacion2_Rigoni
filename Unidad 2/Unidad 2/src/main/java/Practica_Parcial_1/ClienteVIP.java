package Practica_Parcial_1;

public class ClienteVIP extends Cliente{

    protected float descuento;

    public ClienteVIP() {
    }

    public ClienteVIP(String nombre, String email, float descuento) {
        super(nombre, email);
        this.descuento = descuento;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
}
