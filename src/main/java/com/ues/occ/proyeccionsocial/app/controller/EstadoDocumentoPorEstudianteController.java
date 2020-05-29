package com.ues.occ.proyeccionsocial.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ues.occ.proyeccionsocial.app.entities.EstadoDocumentoPorEstudiante;
import com.ues.occ.proyeccionsocial.app.services.EstadoDocumentoPorEstudianteService;

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

	
	@GetMapping(value = "/all")
	public Iterable<EstadoDocumentoPorEstudiante> findAll() {
		return service.findAll();
	}

}
