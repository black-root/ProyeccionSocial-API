package com.ues.occ.proyeccionsocial.app.entities;

import java.io.Serializable;

public class DocumentosRequeridosId implements Serializable {

	private static final long serialVersionUID = 1L;

	private Evento evento;

	private Documento documento;

	public DocumentosRequeridosId(Evento evento, Documento documento) {
		super();
		this.evento = evento;
		this.documento = documento;
	}

	public DocumentosRequeridosId() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((documento == null) ? 0 : documento.hashCode());
		result = prime * result + ((evento == null) ? 0 : evento.hashCode());
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
		if (documento == null) {
			if (other.documento != null)
				return false;
		} else if (!documento.equals(other.documento))
			return false;
		if (evento == null) {
			if (other.evento != null)
				return false;
		} else if (!evento.equals(other.evento))
			return false;
		return true;
	}

}
