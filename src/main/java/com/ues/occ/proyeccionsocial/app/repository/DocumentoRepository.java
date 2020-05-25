package com.ues.occ.proyeccionsocial.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ues.occ.proyeccionsocial.app.entities.Documento;

@Repository
public interface DocumentoRepository extends CrudRepository<Documento, Integer>{

}
