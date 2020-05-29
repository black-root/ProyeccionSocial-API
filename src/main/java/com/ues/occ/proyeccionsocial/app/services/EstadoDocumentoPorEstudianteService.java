package com.ues.occ.proyeccionsocial.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ues.occ.proyeccionsocial.app.entities.EstadoDocumentoPorEstudiante;
import com.ues.occ.proyeccionsocial.app.entities.EstadoDocumentoPorEstudianteId;
import com.ues.occ.proyeccionsocial.app.repository.EstadoDocumentoPorEstudianteRepository;

@Service
public class EstadoDocumentoPorEstudianteService {

	@Autowired
	private EstadoDocumentoPorEstudianteRepository estadoDocPorAlumRepository;

	
	public EstadoDocumentoPorEstudiante findById(Integer documentosRequeridosId, String progresoEstudianteId) {
		return estadoDocPorAlumRepository.findById(new EstadoDocumentoPorEstudianteId(
				documentosRequeridosId,
				progresoEstudianteId.toUpperCase()
				)).get();
	}


	public Iterable<EstadoDocumentoPorEstudiante> findAll() {
		// TODO Auto-generated method stub
		return estadoDocPorAlumRepository.findAll();
	}
	
	
}
