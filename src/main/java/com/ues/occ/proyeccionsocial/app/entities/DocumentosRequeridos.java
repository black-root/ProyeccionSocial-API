package com.ues.occ.proyeccionsocial.app.entities;

import java.io.Serializable;

import javax.persistence.*;

//@IdClass(DocumentosRequeridosId.class)
@Entity
@Table(name = "documentos_requeridos")
public class DocumentosRequeridos implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DocumentosRequeridosId docReqId;

	@ManyToOne(optional = false)
	@JoinColumn(name = "evento_evento_id", insertable = false ,  updatable= false)
	private Evento evento;

	//I'm not sure if this is the best way about using insertable and updatable
	@ManyToOne(optional = false)
	@JoinColumn(name = "documento_documento_id", insertable = false ,  updatable= false)
	private Documento documento;

	public DocumentosRequeridosId getDocReqId() {
		return docReqId;
	}

	public void setDocReqId(DocumentosRequeridosId docReqId) {
		this.docReqId = docReqId;
	}

	@Column(nullable = true, name = "original")
	private boolean original;

	@Column(nullable = true, name = "copia")
	private boolean copia;

	@Column(nullable = true, name = "cantidadCopias", length = 3)
	private Integer cantidadDeCopias;

	public DocumentosRequeridos() {
	}

	/*
	 * public Evento getEvento() { return evento; }
	 * 
	 * public void setEvento(Evento evento) { this.evento = evento; }
	 * 
	 * public Documento getDocumento() { return documento; }
	 * 
	 * public void setDocumento(Documento documento) { this.documento = documento; }
	 */
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
		result = prime * result + ((docReqId == null) ? 0 : docReqId.hashCode());
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
		if (docReqId == null) {
			if (other.docReqId != null)
				return false;
		} else if (!docReqId.equals(other.docReqId))
			return false;
		if (original != other.original)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DocumentosRequeridos [docReqId=" + docReqId + ", original=" + original + ", copia=" + copia
				+ ", cantidadDeCopias=" + cantidadDeCopias + "]";
	}

	public DocumentosRequeridos(DocumentosRequeridosId docReqId, boolean original, boolean copia,
			Integer cantidadDeCopias) {
		super();
		this.docReqId = docReqId;
		this.original = original;
		this.copia = copia;
		this.cantidadDeCopias = cantidadDeCopias;
	}

}
