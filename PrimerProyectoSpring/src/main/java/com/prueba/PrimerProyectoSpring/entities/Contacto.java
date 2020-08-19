package com.prueba.PrimerProyectoSpring.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name  ="contacto")
public class Contacto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idContacto")
	private long idContacto;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "movil")
	private String movil;
	
	@Column(name = "fijo")
	private String fijo;
	
	@OneToOne(mappedBy = "contacto" , cascade = CascadeType.ALL)
	private Cliente cliente;
	
	public Contacto() {}

	public Contacto(String direccion, String email, String movil, String fijo, Cliente cliente) {
		super();
		this.direccion = direccion;
		this.email = email;
		this.movil = movil;
		this.fijo = fijo;
		this.cliente = cliente;
	}

	public long getIdContacto() {
		return idContacto;
	}

	protected void setIdContacto(long idContacto) {
		this.idContacto = idContacto;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Contacto [direccion=" + direccion + ", email=" + email + ", movil=" + movil + ", fijo=" + fijo + "]";
	}
	
	
	
	

}
