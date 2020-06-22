package com.ues.occ.proyeccionsocial.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ues.occ.proyeccionsocial.app.entities.Documento;
import com.ues.occ.proyeccionsocial.app.services.DocumentoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api/proyeccion-social/documento")
public class DocumentoController {

	@Autowired
	private DocumentoService documentoService;
	
	@GetMapping(value = "/{id}")
	public Optional<Documento> getDocumentoById(Integer id){
		return documentoService.getDocumentoById(id);
	}
	
	@GetMapping(value = "/")
	public Iterable<Documento> getAllDocumentos(){
		return documentoService.findAll();
	}
	
	@PostMapping(value = "/")
	public ResponseEntity<Documento> createDocumento(@RequestBody Documento entity){
		return new ResponseEntity<Documento>(documentoService.create(entity), HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Documento> updateDocumento(@RequestBody Documento entity, @PathVariable("id") Integer id){
		return new ResponseEntity<Documento> (documentoService.updateDocumento(entity, id), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Documento> deleteDocumento(@PathVariable("id") Integer id){
		documentoService.deleteDocumento(id);
		return new ResponseEntity<Documento> (HttpStatus.NO_CONTENT);
	}
	
}
