package com.prueba.PrimerProyectoSpring.converters;

import org.springframework.stereotype.Component;

import com.prueba.PrimerProyectoSpring.entities.Cliente;
import com.prueba.PrimerProyectoSpring.entities.ClienteFisico;
import com.prueba.PrimerProyectoSpring.entities.ClienteJuridico;
import com.prueba.PrimerProyectoSpring.entities.Contacto;
import com.prueba.PrimerProyectoSpring.models.ClienteFisicoModel;
import com.prueba.PrimerProyectoSpring.models.ClienteJuridicoModel;
import com.prueba.PrimerProyectoSpring.models.ClienteModel;
import com.prueba.PrimerProyectoSpring.models.ContactoModel;



@Component("clienteConverter")
public class ClienteConverter {
	
	
	public ClienteModel entityToModel(Cliente c) {
		return new ClienteModel(c.getIdCliente(),c.getNroCliente());
	}
	
	public Cliente modelToEntity(ClienteModel c) {
		return new Cliente(c.getNroCliente());
	}
	
	public ClienteFisicoModel entityToModel(ClienteFisico fisico) {
		Contacto co = fisico.getContacto();
		ClienteFisicoModel cf = new ClienteFisicoModel(fisico.getIdCliente(),fisico.getNroCliente(),fisico.getNombre(),fisico.getApellido(),fisico.getDni()); 
		ContactoModel cm = new ContactoModel(co.getIdContacto(),co.getDireccion(),co.getEmail(),co.getMovil(),co.getFijo(),cf);
		cf.setContacto(cm);
		return cf;
	}
	
	public ClienteFisico modelToEntity(ClienteFisicoModel cf) {
		ContactoModel cm = cf.getContacto();
		ClienteFisico f = new ClienteFisico(cf.getNroCliente(),cf.getNombre(),cf.getApellido(),cf.getDni());
		Contacto c = new Contacto(cm.getDireccion(),cm.getEmail(),cm.getMovil(),cm.getFijo(),f);
		f.setContacto(c);
		return f;
	}
	
	public ClienteJuridicoModel entityToModel(ClienteJuridico juridico) {
		Contacto co = juridico.getContacto();
		ClienteJuridicoModel cj = new ClienteJuridicoModel(juridico.getIdCliente(),juridico.getNroCliente(),juridico.getRazonSocial(),juridico.getCuit()); 
		ContactoModel cm = new ContactoModel(co.getIdContacto(),co.getDireccion(),co.getEmail(),co.getMovil(),co.getFijo(),cj);
		cj.setContacto(cm);
		return cj;
	}
	
	public ClienteJuridico modelToEntity(ClienteJuridicoModel cj) {
		ContactoModel cm = cj.getContacto();
		ClienteJuridico j = new ClienteJuridico(cj.getNroCliente(),cj.getRazonSocial(),cj.getCuit()); 
		Contacto c = new Contacto(cm.getDireccion(),cm.getEmail(),cm.getMovil(),cm.getFijo(),j);
		j.setContacto(c);
		return j;
	}

}
