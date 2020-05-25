package com.ues.occ.proyeccionsocial.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ues.occ.proyeccionsocial.app.entities.DocumentosRequeridos;
import com.ues.occ.proyeccionsocial.app.entities.DocumentosRequeridosId;

@Repository
public interface DocumentosRequeridosRepository 
	extends CrudRepository<DocumentosRequeridos, DocumentosRequeridosId> {

}
