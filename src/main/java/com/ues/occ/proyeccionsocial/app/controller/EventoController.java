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

import com.ues.occ.proyeccionsocial.app.entities.Evento;
import com.ues.occ.proyeccionsocial.app.services.EventoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api/proyeccion-social/evento")
public class EventoController {

	@Autowired
	private EventoService eventoServ;
	
	@GetMapping(value = "/")
	public Iterable<Evento> getAllEventos(){
		return eventoServ.findAllEventos();
	}
	
	@GetMapping(value = "/{id}")
	public Evento getEventoById(@PathVariable("id") Integer id){
		return eventoServ.findById(id);
	}
	
	@PostMapping(value = "/")
	public ResponseEntity<Evento> createEvento(@RequestBody Evento entity){
		
		return new ResponseEntity<Evento>(eventoServ.createEvento(entity), HttpStatus.CREATED);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteEvento(@PathVariable("id") Integer id) {
		eventoServ.deleteEvento(id);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Evento> updateEvento(@RequestBody Evento entity, @PathVariable("id") Integer id){
		Evento evento = eventoServ.updateEvento(entity, id);
		
		if(evento != null) {
			return new ResponseEntity<Evento> (evento, HttpStatus.OK);
		} else {
			return new ResponseEntity<Evento>(entity, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	
}
