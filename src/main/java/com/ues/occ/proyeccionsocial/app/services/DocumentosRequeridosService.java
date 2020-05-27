package com.ues.occ.proyeccionsocial.app.services;

import java.util.Optional;

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

	public Optional<DocumentosRequeridos> findById(Integer id) {
		return docRequeridosRepository.findById(id);

	}

	public DocumentosRequeridos createDoccumentosRequeridos(DocumentosRequeridos entity) {

		return docRequeridosRepository.save(entity);

	}


	public void deleteById(Integer id) {
		/*
		 * DocumentosRequeridosId dcId = new DocumentosRequeridosId(eventoId,
		 * documentoId); Optional<DocumentosRequeridos> dc =
		 * docRequeridosRepository.findById(dcId);
		 * 
		 * if (dc.isPresent()) { docRequeridosRepository.deleteById(new
		 * DocumentosRequeridosId(eventoId, documentoId)); return true; } else { return
		 * false; }
		 */
		docRequeridosRepository.deleteById(id);
		;
	}

	public DocumentosRequeridos updateDocumentosRequeridos(DocumentosRequeridos entity, Integer eventoId,
			Integer documentoId) {
		// TODO Auto-generated method stub
		return null;
	}

}
