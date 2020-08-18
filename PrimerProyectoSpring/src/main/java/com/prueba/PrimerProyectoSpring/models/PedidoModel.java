package com.prueba.PrimerProyectoSpring.models;

import java.time.LocalDate;
import java.util.Set;

public class PedidoModel {
	
	private int id;
	private LocalDate fecha;
	private int cantidad;
	private ClienteModel cliente;
	private Set<ProductoModel> productos;
	
	public PedidoModel() {}

	public PedidoModel(int id, LocalDate fecha, int cantidad, ClienteModel cliente) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.cliente = cliente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public ClienteModel getCliente() {
		return cliente;
	}

	public void setCliente(ClienteModel cliente) {
		this.cliente = cliente;
	}

	public Set<ProductoModel> getProductos() {
		return productos;
	}

	public void setProductos(Set<ProductoModel> productos) {
		this.productos = productos;
	}
	
	

}
