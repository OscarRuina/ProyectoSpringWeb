package com.prueba.PrimerProyectoSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prueba.PrimerProyectoSpring.helpers.ViewRouteHelper;


@Controller // indico que es un controlador
@RequestMapping("/") // especifico la ruta por la cual se va a acceder a los metodos por medio de los request
public class HomeController {
	
	@GetMapping("") // se accede al metodo por una peticion GET
    public String index() {
		return ViewRouteHelper.INDEX;
	}
	
	
	
	

}
