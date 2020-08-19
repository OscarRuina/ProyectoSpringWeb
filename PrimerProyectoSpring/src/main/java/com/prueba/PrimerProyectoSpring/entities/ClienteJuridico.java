package com.prueba.PrimerProyectoSpring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "juridica")
@PrimaryKeyJoinColumn(name = "id")
public class ClienteJuridico extends Cliente{
	
	@Column(name = "razonSocial")
	private String razonSocial;
	
	@Column(name = "cuit")
	private String cuit;
	
	public ClienteJuridico() {}

	public ClienteJuridico(String nroCliente, String razonSocial, String cuit) {
		super(nroCliente);
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

	@Override
	public String toString() {
		return super.toString() + " [razonSocial=" + razonSocial + ", cuit=" + cuit + "]";
	}
	
	

}
