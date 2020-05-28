package com.ues.occ.proyeccionsocial.app.entities;

import java.io.Serializable;

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
}
