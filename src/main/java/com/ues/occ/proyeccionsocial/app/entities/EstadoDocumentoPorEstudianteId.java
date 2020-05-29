package com.ues.occ.proyeccionsocial.app.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EstadoDocumentoPorEstudianteId implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "documentos_requeridos_documentos_requeridos_id")
	private Integer documentosRequeridosId;
	
	@Column(name = "progreso_estudiante_carnet")
	private Integer progresoEstudianteId;
	
	public EstadoDocumentoPorEstudianteId() {
		// TODO Auto-generated constructor stub
	}

	public EstadoDocumentoPorEstudianteId(Integer documentosRequeridosId, Integer progresoEstudianteId) {
		super();
		this.documentosRequeridosId = documentosRequeridosId;
		this.progresoEstudianteId = progresoEstudianteId;
	}

	public Integer getDocumentosRequeridosId() {
		return documentosRequeridosId;
	}

	public void setDocumentosRequeridosId(Integer documentosRequeridosId) {
		this.documentosRequeridosId = documentosRequeridosId;
	}

	public Integer getProgresoEstudianteId() {
		return progresoEstudianteId;
	}

	public void setProgresoEstudianteId(Integer progresoEstudianteId) {
		this.progresoEstudianteId = progresoEstudianteId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((documentosRequeridosId == null) ? 0 : documentosRequeridosId.hashCode());
		result = prime * result + ((progresoEstudianteId == null) ? 0 : progresoEstudianteId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EstadoDocumentoPorEstudianteId other = (EstadoDocumentoPorEstudianteId) obj;
		if (documentosRequeridosId == null) {
			if (other.documentosRequeridosId != null)
				return false;
		} else if (!documentosRequeridosId.equals(other.documentosRequeridosId))
			return false;
		if (progresoEstudianteId == null) {
			if (other.progresoEstudianteId != null)
				return false;
		} else if (!progresoEstudianteId.equals(other.progresoEstudianteId))
			return false;
		return true;
	}
	
	
}
