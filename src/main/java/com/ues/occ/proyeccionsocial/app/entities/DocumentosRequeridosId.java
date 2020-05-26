package com.ues.occ.proyeccionsocial.app.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class DocumentosRequeridosId implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "documento_documento_id")
	private Integer documnentId;

	@Column(name = "evento_evento_id")
	private Integer eventoId;

	public DocumentosRequeridosId(Integer documnentId, Integer eventoId) {
		super();
		this.documnentId = documnentId;
		this.eventoId = eventoId;
	}

	public DocumentosRequeridosId() {
	}

	public Integer getDocumnentId() {
		return documnentId;
	}

	public void setDocumnentId(Integer documnentId) {
		this.documnentId = documnentId;
	}

	public Integer getEventoId() {
		return eventoId;
	}

	public void setEventoId(Integer eventoId) {
		this.eventoId = eventoId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((documnentId == null) ? 0 : documnentId.hashCode());
		result = prime * result + ((eventoId == null) ? 0 : eventoId.hashCode());
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
		DocumentosRequeridosId other = (DocumentosRequeridosId) obj;
		if (documnentId == null) {
			if (other.documnentId != null)
				return false;
		} else if (!documnentId.equals(other.documnentId))
			return false;
		if (eventoId == null) {
			if (other.eventoId != null)
				return false;
		} else if (!eventoId.equals(other.eventoId))
			return false;
		return true;
	}

}
