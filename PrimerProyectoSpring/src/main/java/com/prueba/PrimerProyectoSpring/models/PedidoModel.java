package com.prueba.PrimerProyectoSpring.models;

import java.time.LocalDate;
import java.util.Set;

public class PedidoModel {
	
	private long id;
	private LocalDate fecha;
	private ClienteModel cliente;
	private Set<ProductoModel> productos;
	
	public PedidoModel() {}

	public PedidoModel(long id, LocalDate fecha, ClienteModel cliente) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.cliente = cliente;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
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
