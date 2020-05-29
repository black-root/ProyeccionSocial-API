package com.ues.occ.proyeccionsocial.app.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "documentos_requeridos")
public class DocumentosRequeridos implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "documentos_requeridos_id")
	private Integer documentosRequeridosId;

	@ManyToOne()
	@JoinColumn(name = "evento_evento_id", referencedColumnName = "evento_id")
	private Evento evento;

	@ManyToOne()
	@JoinColumn(name = "documento_documento_id", referencedColumnName = "documento_id")
	private Documento documento;

	@Column(nullable = true, name = "original")
	private boolean original;

	@Column(nullable = true, name = "cantidad_copias", length = 3)
	private Integer cantidadDeCopias;
	
	@OneToMany(targetEntity = EstadoDocumentoPorEstudiante.class, mappedBy = "documentosRequeridos", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<EstadoDocumentoPorEstudiante> estadoDocumentoPorEstudiante = new ArrayList<>();

	public DocumentosRequeridos() {
	}

	public boolean isOriginal() {
		return original;
	}

	public void setOriginal(boolean original) {
		this.original = original;
	}

	public Integer getCantidadDeCopias() {
		return cantidadDeCopias;
	}

	public Integer getDocumentosRequeridosId() {
		return documentosRequeridosId;
	}

	public void setDocumentosRequeridosId(Integer documentosRequeridosId) {
		this.documentosRequeridosId = documentosRequeridosId;
	}

	public void setCantidadDeCopias(Integer cantidadDeCopias) {
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

	@Override
	public String toString() {
		return "DocumentosRequeridos [documentosRequeridosId=" + documentosRequeridosId + ", evento=" + evento
				+ ", documento=" + documento + ", original=" + original + ", cantidadDeCopias=" + cantidadDeCopias
				+ "]";
	}

	public DocumentosRequeridos(Evento evento, Documento documento, boolean original, Integer cantidadDeCopias) {
		super();
		this.evento = evento;
		this.documento = documento;
		this.original = original;
		this.cantidadDeCopias = cantidadDeCopias;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cantidadDeCopias == null) ? 0 : cantidadDeCopias.hashCode());
		result = prime * result + ((documento == null) ? 0 : documento.hashCode());
		result = prime * result + ((documentosRequeridosId == null) ? 0 : documentosRequeridosId.hashCode());
		result = prime * result
				+ ((estadoDocumentoPorEstudiante == null) ? 0 : estadoDocumentoPorEstudiante.hashCode());
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
		if (documento == null) {
			if (other.documento != null)
				return false;
		} else if (!documento.equals(other.documento))
			return false;
		if (documentosRequeridosId == null) {
			if (other.documentosRequeridosId != null)
				return false;
		} else if (!documentosRequeridosId.equals(other.documentosRequeridosId))
			return false;
		if (estadoDocumentoPorEstudiante == null) {
			if (other.estadoDocumentoPorEstudiante != null)
				return false;
		} else if (!estadoDocumentoPorEstudiante.equals(other.estadoDocumentoPorEstudiante))
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
	
	
	
}
