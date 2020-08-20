package com.prueba.PrimerProyectoSpring.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.PrimerProyectoSpring.entities.Cliente;

@Repository("clienteRepository")
public interface IClienteRepository extends JpaRepository<Cliente,Serializable>{
	
	public abstract Cliente findByNroCliente(String nroCliente);

}
