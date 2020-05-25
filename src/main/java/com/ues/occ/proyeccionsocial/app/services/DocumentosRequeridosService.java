package com.ues.occ.proyeccionsocial.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ues.occ.proyeccionsocial.app.entities.DocumentosRequeridos;
import com.ues.occ.proyeccionsocial.app.repository.DocumentosRequeridosRepository;

@Service
public class DocumentosRequeridosService {

	@Autowired
	private DocumentosRequeridosRepository docRequeridosRepository;

	public Iterable<DocumentosRequeridos> findAll() {
		return docRequeridosRepository.findAll();
	}
}
