package com.prueba.PrimerProyectoSpring.models;

public class ContactoModel {
	
	private long id;
	private String direccion;
	private String email;
	private String movil;
	private String fijo;
	private ClienteModel cliente;
	
	public ContactoModel() {}

	public ContactoModel(long id, String direccion, String email, String movil, String fijo, ClienteModel cliente) {
		super();
		this.id = id;
		this.direccion = direccion;
		this.email = email;
		this.movil = movil;
		this.fijo = fijo;
		this.cliente = cliente;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMovil() {
		return movil;
	}

	public void setMovil(String movil) {
		this.movil = movil;
	}

	public String getFijo() {
		return fijo;
	}

	public void setFijo(String fijo) {
		this.fijo = fijo;
	}

	public ClienteModel getCliente() {
		return cliente;
	}

	public void setCliente(ClienteModel cliente) {
		this.cliente = cliente;
	}
	
	
	

}
