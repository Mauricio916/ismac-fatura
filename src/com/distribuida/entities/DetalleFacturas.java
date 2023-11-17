package com.distribuida.entities;

public class DetalleFacturas {
	
	private int idDetFac;
	private int cantidad;
	private double subtotal;
	private int idFactura;
	private int idProducto;
	
	public DetalleFacturas() {}

	public int getIdDetFac() {
		return idDetFac;
	}

	public void setIdDetFac(int idDetFac) {
		this.idDetFac = idDetFac;
		
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
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

	@Override
	public String toString() {
		return "DetalleFacturas [idDetFac=" + idDetFac + ", cantidad=" + cantidad + ", subtotal=" + subtotal
				+ ", idFactura=" + idFactura + ", idProducto=" + idProducto + "]";
	}
	
	

}
