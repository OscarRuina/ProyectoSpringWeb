package com.prueba.PrimerProyectoSpring.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.PrimerProyectoSpring.entities.ClienteFisico;

@Repository("clienteFisicoRepository")
public interface IClienteFisicoRepository extends JpaRepository<ClienteFisico,Serializable>{
	
	public abstract ClienteFisico findByNroCliente(String nroCliente);
	
	public abstract ClienteFisico findByDni(int dni);
	

}
