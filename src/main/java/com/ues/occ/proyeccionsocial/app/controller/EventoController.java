package com.ues.occ.proyeccionsocial.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ues.occ.proyeccionsocial.app.entities.Evento;
import com.ues.occ.proyeccionsocial.app.services.EventoService;

@RestController
@RequestMapping(value = "/api/proyeccion-social/evento")
public class EventoController {

	@Autowired
	private EventoService eventoServ;
	
	@GetMapping(value = "/all")
	public Iterable<Evento> getAllEventos(){
		return eventoServ.findAllEventos();
	}
	
	@GetMapping(value = "/{id}")
	public Evento getEventoById(@PathVariable("id") Integer id){
		return eventoServ.findById(id);
	}
	
}
