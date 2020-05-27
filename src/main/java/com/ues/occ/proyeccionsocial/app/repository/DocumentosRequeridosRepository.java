package com.ues.occ.proyeccionsocial.app.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ues.occ.proyeccionsocial.app.entities.DocumentosRequeridos;

@Repository
public interface DocumentosRequeridosRepository 
	extends CrudRepository<DocumentosRequeridos, Integer> {

	@Transactional
	@Modifying
	@Query("delete from DocumentosRequeridos u WHERE u.documentosRequeridosId = ?1" )
	public void deleteDocumentosRequeridos(Integer id);
}
