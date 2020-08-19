package com.prueba.PrimerProyectoSpring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prueba.PrimerProyectoSpring.helpers.ViewRouteHelper;
import com.prueba.PrimerProyectoSpring.models.ProductoModel;
import com.prueba.PrimerProyectoSpring.services.IProductoService;

@Controller
public class ProductoController {
	
	@Autowired
	@Qualifier("productoService")
	private IProductoService productoService;
	
	@RequestMapping("/menuProducto")
	public String menuProducto() {
		return ViewRouteHelper.VISTAMENUPRODUCTO;
	}
	
	@RequestMapping("/altaProducto")
	public String altaProducto(Model model) {
		ProductoModel p = new ProductoModel();
		model.addAttribute("producto", p);
		return ViewRouteHelper.FORMULARIOALTAPRODUCTO;
	}
	
	@RequestMapping("/procesarAltaProducto")
	public String procesarAltaProducto(@ModelAttribute("producto") ProductoModel producto) {
		try {
			productoService.insertOrUpdate(producto);
		}catch(Exception e) {
			
		}
		return ViewRouteHelper.CONFIRMACIONALTAPRODUCTO;
	}

}
