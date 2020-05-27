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
import com.ues.occ.proyeccionsocial.app.services.DocumentosRequeridosService;

@RestController
@RequestMapping(value = "/api/proyeccion-social/documentos-requeridos")
public class DocumentosRequeridosController {

	@Autowired
	private DocumentosRequeridosService docReqService;

	@GetMapping(value = "/all")
	public Iterable<DocumentosRequeridos> getAllDocumentosRequeridos() {
		return docReqService.findAll();
	}

	@GetMapping(value = "/{id}")
	public Optional<DocumentosRequeridos> getDocumentosRequeridosById(
			@PathVariable("id") Integer id) {
		return docReqService.findById(id);
	}

	@PostMapping(value = "/create")
	public ResponseEntity<DocumentosRequeridos> createDocumentosRequeridos(@RequestBody DocumentosRequeridos entity) {
		
			return new ResponseEntity<DocumentosRequeridos>(docReqService.createDoccumentosRequeridos(entity), HttpStatus.CREATED);
		
	}

	@DeleteMapping(value = "/delete/{id}")
	public void deleteDocumentosRequeridos(
			@PathVariable("id") Integer id) {
		/*if(docReqService.deleteById(eventoId, documentoId) == true ) {
			return new ResponseEntity<DocumentosRequeridos>(HttpStatus.NO_CONTENT);	
		} else {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}	*/
		docReqService.deleteById(id);
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
