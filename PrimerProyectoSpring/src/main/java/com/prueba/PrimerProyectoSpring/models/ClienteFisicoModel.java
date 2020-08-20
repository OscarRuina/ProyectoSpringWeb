package com.prueba.PrimerProyectoSpring.models;

public class ClienteFisicoModel extends ClienteModel{
	
	private String nombre;
	private String apellido;
	private int dni;
	
	public ClienteFisicoModel() {}

	public ClienteFisicoModel(long id, String nroCliente, String nombre, String apellido, int dni) {
		super(id, nroCliente);
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
	
	

}
