package com.prueba.PrimerProyectoSpring.entities;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProducto")
	private long idProducto;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "precio")
	private float precio;
	
	@Column(name = "createAt")
	@CreationTimestamp
	private LocalDate createAt;
	
	@Column(name = "updateAt")
	@UpdateTimestamp
	private LocalDate updateAt;
	
	@ManyToMany(mappedBy = "productos")
	private Set<Pedido> pedidos;
	
	public Producto() {}

	public Producto(String nombre, float precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public long getIdProducto() {
		return idProducto;
	}

	protected void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public LocalDate getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDate createAt) {
		this.createAt = createAt;
	}

	public LocalDate getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(LocalDate updateAt) {
		this.updateAt = updateAt;
	}

	public Set<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	public boolean agregarPedido(Pedido pedido) {
		return pedidos.add(pedido);
	}
	
	public boolean eliminarPedido(Pedido pedido) {
		return pedidos.remove(pedido);
	}

}
