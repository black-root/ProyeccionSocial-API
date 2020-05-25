package com.ues.occ.proyeccionsocial.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ues.occ.proyeccionsocial.app.entities.DocumentosRequeridos;
import com.ues.occ.proyeccionsocial.app.services.DocumentosRequeridosService;

@RestController
@RequestMapping(value = "/api/proyeccion-social/doc-requeridos")
public class DocumentosRequeridosController {

	@Autowired
	private DocumentosRequeridosService docReqService;
	
	@GetMapping(value = "/all")
	public Iterable<DocumentosRequeridos> getAllDocumentosRequeridos(){
		return docReqService.findAll();
	}
}
