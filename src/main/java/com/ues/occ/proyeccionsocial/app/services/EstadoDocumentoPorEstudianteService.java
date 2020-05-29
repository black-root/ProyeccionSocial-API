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


	public EstadoDocumentoPorEstudiante create(EstadoDocumentoPorEstudiante entity) {
		
		return estadoDocPorAlumRepository.save(entity);
	}


	public void delete(Integer documentosRequeridosId, String progresoEstudianteId) {
		estadoDocPorAlumRepository.deleteById(new EstadoDocumentoPorEstudianteId(
				documentosRequeridosId, 
				progresoEstudianteId));
	}


	public EstadoDocumentoPorEstudiante update(EstadoDocumentoPorEstudiante entity, Integer documentosRequeridosId,
			String progresoEstudianteId) {
		EstadoDocumentoPorEstudiante estadoDocumentoPorEstudiante =
				estadoDocPorAlumRepository.findById(
						new EstadoDocumentoPorEstudianteId(documentosRequeridosId, progresoEstudianteId)).get();
		estadoDocumentoPorEstudiante.setAprobado(entity.isAprobado());
		estadoDocumentoPorEstudiante.setEntregado(entity.isEntregado());
		estadoDocumentoPorEstudiante.setFechaDeAprobacion(entity.getFechaDeAprobacion());
		estadoDocumentoPorEstudiante.setFechaDeEntrega(entity.getFechaDeEntrega());
		
		return estadoDocPorAlumRepository.save(estadoDocumentoPorEstudiante);
	}
	
	
}
