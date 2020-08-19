package com.prueba.PrimerProyectoSpring.repositories;

import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.PrimerProyectoSpring.entities.Producto;

@Repository("productoRepository")
public interface IProductoRepository extends JpaRepository<Producto, Serializable>{
	
	public abstract Producto findByNombre(String nombre);
	
	public abstract Producto findByIdProducto(long idProducto);
	
}
