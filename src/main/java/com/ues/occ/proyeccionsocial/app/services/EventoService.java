package com.ues.occ.proyeccionsocial.app.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ues.occ.proyeccionsocial.app.entities.Evento;
import com.ues.occ.proyeccionsocial.app.repository.EventoRepository;

@Service
public class EventoService {

	@Autowired
	private EventoRepository eventoRepo;

	public Iterable<Evento> findAllEventos() {

		Iterable<Evento> eventos = eventoRepo.findAll();
		return eventos;
	}

	public Evento findById(Integer id) {
		Optional<Evento> evento = eventoRepo.findById(id);
		System.out.println(evento.get().toString());
		return evento.get();
	}

	public Evento createEvento(Evento entity) {
		// TODO Auto-generated method stub
		return eventoRepo.save(entity);
	}

	public void deleteEvento(Integer id) {
		eventoRepo.deleteById(id);
	}

	public Evento updateEvento(Evento entity, Integer id) {
		Optional<Evento> evento = eventoRepo.findById(id);
		if (evento.isPresent()) {
			evento.get().setEventoId(id);
			evento.get().setDescripcion(entity.getDescripcion());
			evento.get().setFechaDeInicio(entity.getFechaDeInicio());
			evento.get().setFechaDeFin(entity.getFechaDeFin());
			return eventoRepo.saveAndFlush(evento.get());
		}else {
			return null;
		}	
		
	}

}
