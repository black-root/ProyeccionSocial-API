package com.ues.occ.proyeccionsocial.app.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ues.occ.proyeccionsocial.app.entities.Documento;
import com.ues.occ.proyeccionsocial.app.entities.DocumentosRequeridos;
import com.ues.occ.proyeccionsocial.app.entities.DocumentosRequeridosId;
import com.ues.occ.proyeccionsocial.app.entities.Evento;
import com.ues.occ.proyeccionsocial.app.repository.DocumentoRepository;
import com.ues.occ.proyeccionsocial.app.repository.DocumentosRequeridosRepository;
import com.ues.occ.proyeccionsocial.app.repository.EventoRepository;

@Service
public class DocumentosRequeridosService {

	@Autowired
	private DocumentosRequeridosRepository docRequeridosRepository;

	@Autowired
	private EventoRepository eventoRep;

	@Autowired
	private DocumentoRepository docRepo;

	public Iterable<DocumentosRequeridos> findAll() {
		return docRequeridosRepository.findAll();
	}

	public Optional<DocumentosRequeridos> findById(Integer eventoId, Integer documentoId) {
		
		Evento evento = eventoRep.findById(eventoId).get();
		Documento documento = docRepo.findById(documentoId).get();
		return docRequeridosRepository.findById(new DocumentosRequeridosId(evento.getEventoId(),documento.getDocumentoId()));
	}

	public DocumentosRequeridos createDoccumentosRequeridos(DocumentosRequeridos entity) {
		if(!docRequeridosRepository.findById(new DocumentosRequeridosId(
				entity.getDocReqId().getEventoId(), 
				entity.getDocReqId().getDocumnentId())).isPresent()) {
			return docRequeridosRepository.save(entity);
		} else {
			return null;
		}
		
	}
}
