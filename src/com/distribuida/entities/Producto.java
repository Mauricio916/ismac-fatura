package com.distribuida.entities;

public class Producto {

	private int idProducto;
	private String nombre;
	private String desripcion;
	private double precio;
	private int stock;
	
	
	public Producto() {}


	public int getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDesripcion() {
		return desripcion;
	}


	public void setDesripcion(String desripcion) {
		this.desripcion = desripcion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", desripcion=" + desripcion + ", precio="
				+ precio + ", stock=" + stock + "]";
	}
	
	


}