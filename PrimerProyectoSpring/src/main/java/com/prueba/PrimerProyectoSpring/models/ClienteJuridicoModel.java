package com.prueba.PrimerProyectoSpring.models;

public class ClienteJuridicoModel extends ClienteModel{
	
	private String razonSocial;
	private String cuit;
	
	public ClienteJuridicoModel() {}

	public ClienteJuridicoModel(long id, String nroCliente, String razonSocial, String cuit) {
		super(id, nroCliente);
		this.razonSocial = razonSocial;
		this.cuit = cuit;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	
	

}
