package com.prueba.PrimerProyectoSpring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.prueba.PrimerProyectoSpring.converters.ClienteConverter;
import com.prueba.PrimerProyectoSpring.entities.Cliente;
import com.prueba.PrimerProyectoSpring.entities.ClienteFisico;
import com.prueba.PrimerProyectoSpring.entities.ClienteJuridico;
import com.prueba.PrimerProyectoSpring.models.ClienteFisicoModel;
import com.prueba.PrimerProyectoSpring.models.ClienteJuridicoModel;
import com.prueba.PrimerProyectoSpring.models.ClienteModel;
import com.prueba.PrimerProyectoSpring.repositories.IClienteFisicoRepository;
import com.prueba.PrimerProyectoSpring.repositories.IClienteJuridicoRepository;
import com.prueba.PrimerProyectoSpring.repositories.IClienteRepository;

@Service
public class ClienteService implements IClienteService{
	
	@Autowired
	@Qualifier("clienteFisicoRepository")
	private IClienteFisicoRepository cf;
	
	@Autowired
	@Qualifier("clienteJuridicoRepository")
	private IClienteJuridicoRepository cj;
	
	@Autowired
	@Qualifier("clienteRepository")
	private IClienteRepository c;
	
	@Autowired
	@Qualifier("clienteConverter")
	private ClienteConverter converter;

	@Override
	public List<Cliente> getAll() {
		return c.findAll();
	}

	@Override
	public ClienteFisicoModel insertOrUpdate(ClienteFisicoModel model) {
		ClienteFisico f = cf.save(converter.modelToEntity(model));
		return converter.entityToModel(f);
	}

	@Override
	public ClienteJuridicoModel insertOrUpdate(ClienteJuridicoModel model) {
		ClienteJuridico j = cj.save(converter.modelToEntity(model));
		return converter.entityToModel(j);
	}

	@Override
	public boolean remove(ClienteModel model) {
		boolean eliminado = false;
		c.delete(converter.modelToEntity(model));
		eliminado = true;
		return eliminado;
	}

	@Override
	public List<ClienteFisico> getClienteFisico() {
		List<ClienteFisico> fisicos = new ArrayList<ClienteFisico>();
		this.getAll().forEach(Cliente -> {if(Cliente instanceof ClienteFisico) fisicos.add((ClienteFisico)Cliente);});
		return fisicos;
	}

	@Override
	public List<ClienteJuridico> getClienteJuridico() {
		List<ClienteJuridico> juridicos = new ArrayList<ClienteJuridico>();
		this.getAll().forEach(Cliente -> {if(Cliente instanceof ClienteJuridico) juridicos.add((ClienteJuridico)Cliente);});
		return juridicos;
	}
	
	

}
