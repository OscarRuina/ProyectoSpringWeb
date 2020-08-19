package com.prueba.PrimerProyectoSpring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.prueba.PrimerProyectoSpring.converters.ProductoConverter;
import com.prueba.PrimerProyectoSpring.entities.Producto;
import com.prueba.PrimerProyectoSpring.models.ProductoModel;
import com.prueba.PrimerProyectoSpring.repositories.IProductoRepository;

@Service
public class ProductoService implements IProductoService {
	
	@Autowired
	@Qualifier("productoRepository")
	private IProductoRepository productoRepository;
	
	@Autowired
	@Qualifier("productoConverter")
	private ProductoConverter productoConverter;

	@Override
	public List<Producto> getAll() {
		return productoRepository.findAll();
	}

	@Override
	public ProductoModel insertOrUpdate(ProductoModel productoModel) {
		Producto producto = productoRepository.save(productoConverter.modelToEntity(productoModel));
		return productoConverter.entityToModel(producto);
	}

	@Override
	public boolean remove(ProductoModel productoModel) {
		boolean eliminado = false;
		try {
			productoRepository.delete(productoConverter.modelToEntity(productoModel));
		    eliminado = true;
		}catch(Exception e) {
						
		}
		return eliminado;
	}
}
