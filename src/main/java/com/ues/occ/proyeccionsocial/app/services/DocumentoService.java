package com.ues.occ.proyeccionsocial.app.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ues.occ.proyeccionsocial.app.entities.Documento;
import com.ues.occ.proyeccionsocial.app.repository.DocumentoRepository;

@Service
public class DocumentoService {

	@Autowired
	private DocumentoRepository documentoRepository;

	public Optional<Documento> getDocumentoById(Integer id) {
		// TODO Auto-generated method stub
		return documentoRepository.findById(id);
	}

	public Iterable<Documento> findAll() {
		// TODO Auto-generated method stub
		return documentoRepository.findAll();
	}

	public Documento create(Documento entity) {
		// TODO Auto-generated method stub
		return documentoRepository.save(entity);
	}

	public Documento updateDocumento(Documento entity, Integer id) {
		
		Optional<Documento> documento = documentoRepository.findById(id);
		documento.get().setDescripcion(entity.getDescripcion());
		
		return documentoRepository.save(documento.get());
	}

	public void deleteDocumento(Integer id) {
		documentoRepository.deleteById(id);
	}
	
	
}
