package com.prueba.PrimerProyectoSpring.entities;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "pedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPedido")
	private long idPedido;
	
	@Column(name = "fecha")
	private LocalDate fecha;
	
	@Column(name = "formaPago")
	private String formaPago;
	
	@ManyToOne(cascade = {CascadeType.PERSIST , CascadeType.MERGE , CascadeType.DETACH , CascadeType.REFRESH})
	@JoinColumn(name = "idCliente")
	private Cliente cliente;
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name = "pedido_producto",
	joinColumns = {@JoinColumn(name = "idPedido")} , 
	inverseJoinColumns = {@JoinColumn(name = "idProducto")})
	private Set<Producto> productos;
	
	public Pedido() {}

	public Pedido(LocalDate fecha, String formaPago, Cliente cliente) {
		super();
		this.fecha = fecha;
		this.formaPago = formaPago;
		this.cliente = cliente;
	}

	public long getIdPedido() {
		return idPedido;
	}

	protected void setIdPedido(long idPedido) {
		this.idPedido = idPedido;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Set<Producto> getProductos() {
		return productos;
	}

	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", fecha=" + fecha + ", formaPago=" + formaPago + "]";
	}

	public boolean agregarProducto(Producto producto) {
		return productos.add(producto);
	}
	
	public boolean eliminarProducto(Producto producto) {
		return productos.remove(producto);
	}
	

}
