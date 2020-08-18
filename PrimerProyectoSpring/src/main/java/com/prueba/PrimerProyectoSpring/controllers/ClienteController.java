package com.prueba.PrimerProyectoSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prueba.PrimerProyectoSpring.helpers.ViewRouteHelper;
import com.prueba.PrimerProyectoSpring.models.ClienteFisicoModel;
import com.prueba.PrimerProyectoSpring.models.ClienteJuridicoModel;


@Controller
public class ClienteController {
	
	
	
	@RequestMapping("/menuCliente")
	public String menuCliente() {
		return ViewRouteHelper.VISTAMENUCLIENTE;
	}
	
	
	@RequestMapping("/altaClienteFisico")
	public String altaClienteFisico(Model model) {
		ClienteFisicoModel f = new ClienteFisicoModel();
		model.addAttribute("fisico", f);
		return ViewRouteHelper.FORMULARIOALTACLIENTEFISICO;
	}
	@RequestMapping("/procesarAltaClienteFisico")
	public String procesarAltaClienteFisico(@ModelAttribute("fisico") ClienteFisicoModel fisico) {
		return ViewRouteHelper.CONFIRMACIONALTACLIENTEFISICO;
	}
	
	@RequestMapping("/altaClienteJuridico")
	public String altaClienteJuridico(Model model) {
		ClienteJuridicoModel j = new ClienteJuridicoModel();
		model.addAttribute("juridico", j);
		return ViewRouteHelper.FORMULARIOALTACLIENTEJURIDICO;
	}
	@RequestMapping("/procesarAltaClienteJuridico")
	public String procesarAltaClienteJuridico(@ModelAttribute("juridico") ClienteJuridicoModel juridico) {
		return ViewRouteHelper.CONFIRMACIONALTACLIENTEJURIDICO;
	}
	
	

}
