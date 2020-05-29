package com.ues.occ.proyeccionsocial.app.entities;

import java.io.Serializable;

public class EstadoDocumentoPorEstudianteId implements Serializable {

	private static final long serialVersionUID = 1L;

	
	private Integer documentosRequeridos;
	
	private String progresoEstudiante;
	
	public EstadoDocumentoPorEstudianteId() {
		// TODO Auto-generated constructor stub
	}

	public EstadoDocumentoPorEstudianteId(Integer documentosRequeridos, String progresoEstudiante) {
		super();
		this.documentosRequeridos = documentosRequeridos;
		this.progresoEstudiante = progresoEstudiante;
	}

	public Integer getDocumentosRequeridos() {
		return documentosRequeridos;
	}

	public void setDocumentosRequeridos(Integer documentosRequeridos) {
		this.documentosRequeridos = documentosRequeridos;
	}

	public String getProgresoEstudiante() {
		return progresoEstudiante;
	}

	public void setProgresoEstudiante(String progresoEstudiante) {
		this.progresoEstudiante = progresoEstudiante;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((documentosRequeridos == null) ? 0 : documentosRequeridos.hashCode());
		result = prime * result + ((progresoEstudiante == null) ? 0 : progresoEstudiante.hashCode());
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
		if (documentosRequeridos == null) {
			if (other.documentosRequeridos != null)
				return false;
		} else if (!documentosRequeridos.equals(other.documentosRequeridos))
			return false;
		if (progresoEstudiante == null) {
			if (other.progresoEstudiante != null)
				return false;
		} else if (!progresoEstudiante.equals(other.progresoEstudiante))
			return false;
		return true;
	}

	
}
