package entidades;

import java.util.ArrayList;

import java.util.ArrayList;

public class ArticuloManufacturado extends Articulo {

    private Integer tiempoEstimadoMinutos;
    private String preparacion;
    private ArrayList<ArticuloManufacturadoDetalle> detalles = new ArrayList<>();

    public ArticuloManufacturado() {
        super(); 
    }

    public ArticuloManufacturado(String denominacion, Double precioVenta, Integer tiempoEstimadoMinutos, String preparacion) {
        super(denominacion, precioVenta); 
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
    }

    public Integer getTiempoEstimadoMinutos() {
        return tiempoEstimadoMinutos;
    }

    public void setTiempoEstimadoMinutos(Integer tiempoEstimadoMinutos) {
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public ArrayList<ArticuloManufacturadoDetalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(ArrayList<ArticuloManufacturadoDetalle> detalles) {
        this.detalles = detalles;
    }

    public void addDetalle(ArticuloManufacturadoDetalle detalle) {
        this.detalles.add(detalle);
    }

    @Override
    public String toString() {
        return "ArticuloManufacturado{" +
                "tiempoEstimadoMinutos=" + tiempoEstimadoMinutos +
                ", preparacion='" + preparacion + '\'' +
                ", detalles=" + detalles +
                "} " + super.toString();
    }
}