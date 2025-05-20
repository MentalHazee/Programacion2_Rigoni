package Entities;

import java.time.LocalTime;
import java.time.LocalDate;

import java.time.LocalTime;
import java.time.LocalDate;

public class Pedido {

    private LocalTime horaEstimadaFinalizacion;
    private Double total;
    private Double totalCosto;
    private EstadoEnum estado;
    private TipoEnvioEnum tipoEnvio;
    private FormaPagoEnum formaPago;
    private LocalDate fechaPedido;
    private Cliente cliente;

    public Pedido() {
    }

    public Pedido(LocalTime horaEstimadaFinalizacion, Double total, Double totalCosto, EstadoEnum estado, TipoEnvioEnum tipoEnvio, FormaPagoEnum formaPago, LocalDate fechaPedido, Cliente cliente) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
        this.total = total;
        this.totalCosto = totalCosto;
        this.estado = estado;
        this.tipoEnvio = tipoEnvio;
        this.formaPago = formaPago;
        this.fechaPedido = fechaPedido;
        this.cliente = cliente;
    }

    public LocalTime getHoraEstimadaFinalizacion() {
        return horaEstimadaFinalizacion;
    }

    public void setHoraEstimadaFinalizacion(LocalTime horaEstimadaFinalizacion) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTotalCosto() {
        return totalCosto;
    }

    public void setTotalCosto(Double totalCosto) {
        this.totalCosto = totalCosto;
    }

    public EstadoEnum getEstado() {
        return estado;
    }

    public void setEstado(EstadoEnum estado) {
        this.estado = estado;
    }

    public TipoEnvioEnum getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(TipoEnvioEnum tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public FormaPagoEnum getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPagoEnum formaPago) {
        this.formaPago = formaPago;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "horaEstimadaFinalizacion=" + horaEstimadaFinalizacion +
                ", total=" + total +
                ", totalCosto=" + totalCosto +
                ", estado=" + estado +
                ", tipoEnvio=" + tipoEnvio +
                ", formaPago=" + formaPago +
                ", fechaPedido=" + fechaPedido +
                ", cliente=" + cliente +
                '}';
    }
}