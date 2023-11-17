package com.distribuida.principal;

import java.util.Date;

import com.distribuida.entities.*;

public class classPrincipal {
	
	public static void main(String[] args) {
		
		Clientes clientes = new Clientes();
		Factura factura = new Factura(); 
		DetalleFacturas detalle_facturas = new DetalleFacturas();
		Producto producto = new Producto();
		
		clientes.setIdCliente(2);
		clientes.setCedula(18055109);
		clientes.setNombre("Mano");
		clientes.setApellido("tata");
		clientes.setEdad(23);
		clientes.setFechaNac(new Date(05/04/2003));
		clientes.setDireccion("Avenida ");
		clientes.setTelefono(98315);
		clientes.setCorreo("sadasda@gamisl.com");
		
		factura.setIdFactura(5);
		factura.setFecha(new Date(0));
		factura.setTotalNeto(11);
		factura.setIva(0.16);
		factura.setTotal(19);
		factura.setIdCliente(2);
		
		producto.setIdProducto(2);
		producto.setNombre("leche");
		producto.setDesripcion("cruda");
		producto.setPrecio(2.2);
		producto.setStock(11);
		
		detalle_facturas.setIdDetFac(6);
		detalle_facturas.setCantidad(4);
		detalle_facturas.setSubtotal(12.5);
		detalle_facturas.setIdFactura(5);
		detalle_facturas.setIdProducto(2);

	}

}
