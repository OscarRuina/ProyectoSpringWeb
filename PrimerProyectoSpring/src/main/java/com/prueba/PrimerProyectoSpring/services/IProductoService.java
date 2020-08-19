package com.prueba.PrimerProyectoSpring.services;

import java.util.List;

import com.prueba.PrimerProyectoSpring.entities.Producto;
import com.prueba.PrimerProyectoSpring.models.ProductoModel;

public interface IProductoService {
	
	public List<Producto> getAll();
	
	public ProductoModel insertOrUpdate(ProductoModel productoModel);
	
	public boolean remove(ProductoModel productoModel);

}
