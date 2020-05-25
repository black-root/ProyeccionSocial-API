package com.ues.occ.proyeccionsocial.app.entities;

import javax.persistence.*;

@Entity
@Table(name = "documentos_requeridos")
@IdClass(DocumentosRequeridosId.class)
public class DocumentosRequeridos {
	
	@Id
	@ManyToOne(optional = false)
	private Evento evento;
	
	@Id
	@ManyToOne(optional = false)
	private Documento documento;
	
	@Column(nullable = true, name = "original")
	private boolean original;
	
	@Column(nullable = true, name = "copia")
	private boolean copia;
	
	@Column(nullable = true, name = "cantidadCopias", length = 3)
	private Integer cantidadDeCopias;

	public DocumentosRequeridos() {
	}
	
	public DocumentosRequeridos(Evento evento, Documento documento, boolean original, boolean copia,
			Integer cantidadDeCopias) {
		super();
		this.evento = evento;
		this.documento = documento;
		this.original = original;
		this.copia = copia;
		this.cantidadDeCopias = cantidadDeCopias;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public boolean isOriginal() {
		return original;
	}

	public void setOriginal(boolean original) {
		this.original = original;
	}

	public boolean isCopia() {
		return copia;
	}

	public void setCopia(boolean copia) {
		this.copia = copia;
	}

	public Integer getCantidadDeCopias() {
		return cantidadDeCopias;
	}

	public void setCantidadDeCopias(Integer cantidadDeCopias) {
		this.cantidadDeCopias = cantidadDeCopias;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cantidadDeCopias == null) ? 0 : cantidadDeCopias.hashCode());
		result = prime * result + (copia ? 1231 : 1237);
		result = prime * result + ((documento == null) ? 0 : documento.hashCode());
		result = prime * result + ((evento == null) ? 0 : evento.hashCode());
		result = prime * result + (original ? 1231 : 1237);
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
		DocumentosRequeridos other = (DocumentosRequeridos) obj;
		if (cantidadDeCopias == null) {
			if (other.cantidadDeCopias != null)
				return false;
		} else if (!cantidadDeCopias.equals(other.cantidadDeCopias))
			return false;
		if (copia != other.copia)
			return false;
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
		if (original != other.original)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DocumentosRequeridos [evento=" + evento + ", documento=" + documento + ", original=" + original
				+ ", copia=" + copia + ", cantidadDeCopias=" + cantidadDeCopias + "]";
	}
	
}
