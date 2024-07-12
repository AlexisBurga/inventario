package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="facturas")
public class Facturas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private Integer idFactura;
    
    private Integer idPedido;
    private Integer idTipoPago;

    @Column(name = "Total")
    private Double total;

    // Constructor sin argumentos
    public Facturas() {}

    // Constructor con argumentos

    // Getters y Setters
    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getIdTipoPago() {
        return idTipoPago;
    }

    public void setIdTipoPago(Integer idTipoPago) {
        this.idTipoPago = idTipoPago;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Facturas [idFactura=" + idFactura + ", idPedido=" + idPedido + ", idTipoPago=" + idTipoPago + ", total="
                + total + "]";
    }
}
