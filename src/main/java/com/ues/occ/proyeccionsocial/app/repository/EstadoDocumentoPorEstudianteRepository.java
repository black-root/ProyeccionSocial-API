package com.ues.occ.proyeccionsocial.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ues.occ.proyeccionsocial.app.entities.EstadoDocumentoPorEstudiante;
import com.ues.occ.proyeccionsocial.app.entities.EstadoDocumentoPorEstudianteId;

@Repository
public interface EstadoDocumentoPorEstudianteRepository extends CrudRepository<EstadoDocumentoPorEstudiante, EstadoDocumentoPorEstudianteId> {
}
