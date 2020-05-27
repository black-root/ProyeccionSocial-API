package com.ues.occ.proyeccionsocial.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ues.occ.proyeccionsocial.app.entities.DocumentosRequeridos;
import com.ues.occ.proyeccionsocial.app.entities.Usuario;
import com.ues.occ.proyeccionsocial.app.services.DocumentosRequeridosService;

@RestController
@RequestMapping(value = "/api/proyeccion-social/doc-requeridos")
public class DocumentosRequeridosController {

	@Autowired
	private DocumentosRequeridosService docReqService;

	@GetMapping(value = "/all")
	public Iterable<DocumentosRequeridos> getAllDocumentosRequeridos() {
		return docReqService.findAll();
	}

	@GetMapping(value = "/{eventoId}&{docId}")
	public Optional<DocumentosRequeridos> getDocumentosRequeridosById(@PathVariable("eventoId") Integer eventoId,
			@PathVariable("docId") Integer docId) {
		return docReqService.findById(eventoId, docId);
	}

	@PostMapping(value = "/create")
	public ResponseEntity<DocumentosRequeridos> createDocumentosRequeridos(@RequestBody DocumentosRequeridos entity) {
		
		if (docReqService.createDoccumentosRequeridos(entity) != null) {
			return new ResponseEntity<DocumentosRequeridos>(entity, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping(value = "/delete/{eventoId}&{documentoId}")
	public void deleteDocumentosRequeridos(
			@PathVariable("eventoId") Integer eventoId, 
			@PathVariable("documentoId") Integer documentoId) {
		/*if(docReqService.deleteById(eventoId, documentoId) == true ) {
			return new ResponseEntity<DocumentosRequeridos>(HttpStatus.NO_CONTENT);	
		} else {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}	*/
		docReqService.deleteById(eventoId, documentoId);
		//.return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@PutMapping(value = "/update/{eventoId}&{documentoId}")
	public ResponseEntity<DocumentosRequeridos> updateDocumentosRequeridos(
			@RequestBody DocumentosRequeridos entity, 
			@PathVariable("eventoId") Integer eventoId, 
			@PathVariable("documentoId") Integer documentoId) {
		if ( eventoId > 0 && documentoId > 0 && entity != null &&
				entity.getCantidadDeCopias() >= 0) {

			return new ResponseEntity<DocumentosRequeridos>(docReqService.updateDocumentosRequeridos(entity, eventoId, documentoId), HttpStatus.OK);

		} else {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
}
