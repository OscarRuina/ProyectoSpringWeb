package com.prueba.PrimerProyectoSpring.services;

import java.util.List;

import com.prueba.PrimerProyectoSpring.entities.Cliente;
import com.prueba.PrimerProyectoSpring.entities.ClienteFisico;
import com.prueba.PrimerProyectoSpring.entities.ClienteJuridico;
import com.prueba.PrimerProyectoSpring.models.ClienteFisicoModel;
import com.prueba.PrimerProyectoSpring.models.ClienteJuridicoModel;
import com.prueba.PrimerProyectoSpring.models.ClienteModel;

public interface IClienteService {
	
	public List<Cliente> getAll();
	
	public List<ClienteFisico> getClienteFisico();
	
	public List<ClienteJuridico> getClienteJuridico();
	
	public ClienteFisicoModel insertOrUpdate(ClienteFisicoModel model);
	
	public ClienteJuridicoModel insertOrUpdate(ClienteJuridicoModel model);
	
	public boolean remove(ClienteModel model);

}
