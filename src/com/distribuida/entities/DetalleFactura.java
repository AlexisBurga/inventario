package com.distribuida.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "detallefactura")
public class DetalleFactura {

	//Atributos
	private int idDetalle_factura;
	
	private int idFactura;
	private int idProducto;
	private int Cantidad;
	private double Preciounitario;
	public DetalleFactura(int idDetalle_factura, int idFactura, int idProducto, int cantidad, double preciounitario) {
		;
		this.idDetalle_factura = idDetalle_factura;
		this.idFactura = idFactura;
		this.idProducto = idProducto;
		Cantidad = cantidad;
		Preciounitario = preciounitario;
	}
	public int getIdDetalle_factura() {
		return idDetalle_factura;
	}
	public void setIdDetalle_factura(int idDetalle_factura) {
		this.idDetalle_factura = idDetalle_factura;
	}
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	public double getPreciounitario() {
		return Preciounitario;
	}
	public void setPreciounitario(double preciounitario) {
		Preciounitario = preciounitario;
	}
	@Override
	public String toString() {
		return "DetalleFactura [idDetalle_factura=" + idDetalle_factura + ", idFactura=" + idFactura + ", idProducto="
				+ idProducto + ", Cantidad=" + Cantidad + ", Preciounitario=" + Preciounitario + "]";
	}
	

	
}