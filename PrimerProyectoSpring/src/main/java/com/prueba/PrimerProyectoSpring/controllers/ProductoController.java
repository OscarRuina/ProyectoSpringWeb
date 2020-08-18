package com.prueba.PrimerProyectoSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prueba.PrimerProyectoSpring.helpers.ViewRouteHelper;

@Controller
public class ProductoController {
	
	@RequestMapping("/menuProducto")
	public String menuProducto() {
		return ViewRouteHelper.VISTAMENUPRODUCTO;
	}

}
