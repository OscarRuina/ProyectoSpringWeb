package com.prueba.PrimerProyectoSpring.converters;

import org.springframework.stereotype.Component;

import com.prueba.PrimerProyectoSpring.entities.Producto;
import com.prueba.PrimerProyectoSpring.models.ProductoModel;

@Component("productoConverter")
public class ProductoConverter {
	
	public ProductoModel entityToModel(Producto producto) {
		return new ProductoModel (producto.getIdProducto(),producto.getNombre(),producto.getPrecio());
	}
	
	public Producto modelToEntity(ProductoModel productoModel) {
		return new Producto (productoModel.getNombre(), productoModel.getPrecio());
	}

}
