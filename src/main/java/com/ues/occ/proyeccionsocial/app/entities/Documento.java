package com.ues.occ.proyeccionsocial.app.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "documento")
public class Documento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "documento_id")
	private Integer documentoId;

	@Column(name = "descripcion", nullable = false, length = 150)
	private String descripcion;

	@OneToMany(mappedBy = "documento", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<DocumentosRequeridos> documentosRequeridos;

	public Documento() {
	}

	public Integer getDocumentoId() {
		return documentoId;
	}

	public void setDocumentoId(Integer documentoId) {
		this.documentoId = documentoId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Documento(Integer documentoId, String descripcion) {
		super();
		this.documentoId = documentoId;
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Documento [documentoId=" + documentoId + ", descripcion=" + descripcion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((documentoId == null) ? 0 : documentoId.hashCode());
		result = prime * result + ((documentosRequeridos == null) ? 0 : documentosRequeridos.hashCode());
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
		Documento other = (Documento) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (documentoId == null) {
			if (other.documentoId != null)
				return false;
		} else if (!documentoId.equals(other.documentoId))
			return false;
		if (documentosRequeridos == null) {
			if (other.documentosRequeridos != null)
				return false;
		} else if (!documentosRequeridos.equals(other.documentosRequeridos))
			return false;
		return true;
	}

}
