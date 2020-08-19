package com.prueba.PrimerProyectoSpring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "fisica")
@PrimaryKeyJoinColumn(name = "id")
public class ClienteFisico extends Cliente{
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "dni")
	private int dni;
	
	public ClienteFisico() {}

	public ClienteFisico(String nroCliente, String nombre, String apellido, int dni) {
		super(nroCliente);
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return super.toString() + " [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
	}
	
	

}
