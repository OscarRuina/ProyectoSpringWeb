package com.prueba.PrimerProyectoSpring.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.PrimerProyectoSpring.entities.ClienteJuridico;

@Repository("clienteJuridicoRepository")
public interface IClienteJuridicoRepository extends JpaRepository<ClienteJuridico,Serializable>{
	
	public abstract ClienteJuridico findByNroCliente(String nroCliente);
	public abstract ClienteJuridico findByCuit(String cuit);

}
