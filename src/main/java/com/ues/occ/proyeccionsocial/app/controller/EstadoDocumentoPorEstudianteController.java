package com.ues.occ.proyeccionsocial.app.controller;

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

import com.ues.occ.proyeccionsocial.app.entities.EstadoDocumentoPorEstudiante;
import com.ues.occ.proyeccionsocial.app.services.EstadoDocumentoPorEstudianteService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api/proyeccion-social/estado-documento-por-estudiante")
public class EstadoDocumentoPorEstudianteController {

	@Autowired
	private EstadoDocumentoPorEstudianteService service;

	@GetMapping(value = "/{documentosRequeridosId}&{progresoEstudianteId:.+}")
	public ResponseEntity<EstadoDocumentoPorEstudiante> findById(
			@PathVariable("documentosRequeridosId") Integer documentosRequeridosId,
			@PathVariable("progresoEstudianteId") String progresoEstudianteId) {
		return new ResponseEntity<EstadoDocumentoPorEstudiante>(
				service.findById(documentosRequeridosId, progresoEstudianteId), HttpStatus.ACCEPTED);
	}

	@GetMapping(value = "/")
	public Iterable<EstadoDocumentoPorEstudiante> findAll() {
		return service.findAll();
	}

	@PostMapping(value = "/")
	public ResponseEntity<EstadoDocumentoPorEstudiante> create(
			@RequestBody EstadoDocumentoPorEstudiante entity) {
		return new ResponseEntity<EstadoDocumentoPorEstudiante>(
				service.create(entity), HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/{documentosRequeridosId}&{progresoEstudianteId:.+}")
	public ResponseEntity<EstadoDocumentoPorEstudiante> update(
			@RequestBody EstadoDocumentoPorEstudiante entity,
			@PathVariable("documentosRequeridosId") Integer documentosRequeridosId,
			@PathVariable("progresoEstudianteId") String progresoEstudianteId) {
		return new ResponseEntity<EstadoDocumentoPorEstudiante>(
				service.update(entity, documentosRequeridosId, progresoEstudianteId),
				HttpStatus.CREATED);
	}
	
	@DeleteMapping(value = "/{documentosRequeridosId}&{progresoEstudianteId:.+}")
	public ResponseEntity<EstadoDocumentoPorEstudiante> delete(
			@PathVariable("documentosRequeridosId") Integer documentosRequeridosId,
			@PathVariable("progresoEstudianteId") String progresoEstudianteId){
		service.delete(documentosRequeridosId, progresoEstudianteId);
		return new ResponseEntity<EstadoDocumentoPorEstudiante>(HttpStatus.NO_CONTENT);
	}

}
