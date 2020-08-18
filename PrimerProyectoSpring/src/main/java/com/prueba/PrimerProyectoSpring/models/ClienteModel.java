package com.prueba.PrimerProyectoSpring.models;

public class ClienteModel {
	
	private int id;
	private String nroCliente;
	private ContactoModel contacto;
	
	public ClienteModel() {}

	public ClienteModel(int id, String nroCliente) {
		super();
		this.id = id;
		this.nroCliente = nroCliente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNroCliente() {
		return nroCliente;
	}

	public void setNroCliente(String nroCliente) {
		this.nroCliente = nroCliente;
	}

	public ContactoModel getContacto() {
		return contacto;
	}

	public void setContacto(ContactoModel contacto) {
		this.contacto = contacto;
	}
	
	

}
