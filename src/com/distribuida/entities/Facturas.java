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
@Table (name="facturas")
public class Facturas {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id_facturas")
	private int idFactura;
	private int idPedido;
	private int idTipoPago;
	@Column (name = "Total")
	private double Total;
	
	
	public Facturas(int idFactura, int idPedido, int idTipoPago, double total) {
	
		this.idFactura = idFactura;
		this.idPedido = idPedido;
		this.idTipoPago = idTipoPago;
		Total = total;
	}
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public int getIdTipoPago() {
		return idTipoPago;
	}
	public void setIdTipoPago(int idTipoPago) {
		this.idTipoPago = idTipoPago;
	}
	public double getTotal() {
		return Total;
	}
	public void setTotal(double total) {
		Total = total;
	}
	@Override
	public String toString() {
		return "Facturas [idFactura=" + idFactura + ", idPedido=" + idPedido + ", idTipoPago=" + idTipoPago + ", Total="
				+ Total + "]";
	}
	
	
}