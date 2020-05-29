package com.ues.occ.proyeccionsocial.app.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "estado_documento_por_estudiante")
public class EstadoDocumentoPorEstudiante implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EstadoDocumentoPorEstudianteId estadoDocumentoPorEstudianteId;

	@Column(name = "entregado", nullable = false)
	private boolean entregado;

	@Column(name = "aprobado", nullable = false)
	private boolean aprobado;

	@Column(name = "fecha_de_entrega", nullable = true)
	private Date fechaDeEntrega;

	@Column(name = "fecha_de_aprobacion", nullable = true)
	private Date fechaDeAprobacion;

	@ManyToOne(targetEntity = DocumentosRequeridos.class, optional = false)
	@JoinColumn(name = "documentos_requeridos_documentos_requeridos_id", 
	referencedColumnName = "documentos_requeridos_id",  insertable = false, updatable = false)
	private List<DocumentosRequeridos> documentosRequeridos = new ArrayList<>();

	@ManyToOne(targetEntity =  ProgresoEstudiante.class, optional = false)
	@JoinColumn(name = "progreso_estudiante_carnet", 
	referencedColumnName = "carnet",  insertable = false, updatable = false)
	private List<ProgresoEstudiante> progresoEstudiante = new ArrayList<>();

	public EstadoDocumentoPorEstudiante() {
		// TODO Auto-generated constructor stub
	}

	public EstadoDocumentoPorEstudiante(EstadoDocumentoPorEstudianteId estadoDocumentoPorEstudianteId,
			boolean entregado, boolean aprobado, Date fechaDeEntrega, Date fechaDeAprobacion,
			List<DocumentosRequeridos> documentosRequeridos, List<ProgresoEstudiante> progresoEstudiante) {
		super();
		this.estadoDocumentoPorEstudianteId = estadoDocumentoPorEstudianteId;
		this.entregado = entregado;
		this.aprobado = aprobado;
		this.fechaDeEntrega = fechaDeEntrega;
		this.fechaDeAprobacion = fechaDeAprobacion;
		this.documentosRequeridos = documentosRequeridos;
		this.progresoEstudiante = progresoEstudiante;
	}

	public EstadoDocumentoPorEstudianteId getEstadoDocumentoPorEstudianteId() {
		return estadoDocumentoPorEstudianteId;
	}

	public void setEstadoDocumentoPorEstudianteId(EstadoDocumentoPorEstudianteId estadoDocumentoPorEstudianteId) {
		this.estadoDocumentoPorEstudianteId = estadoDocumentoPorEstudianteId;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public boolean isAprobado() {
		return aprobado;
	}

	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}

	public Date getFechaDeEntrega() {
		return fechaDeEntrega;
	}

	public void setFechaDeEntrega(Date fechaDeEntrega) {
		this.fechaDeEntrega = fechaDeEntrega;
	}

	public Date getFechaDeAprobacion() {
		return fechaDeAprobacion;
	}

	public void setFechaDeAprobacion(Date fechaDeAprobacion) {
		this.fechaDeAprobacion = fechaDeAprobacion;
	}

	public List<DocumentosRequeridos> getDocumentosRequeridos() {
		return documentosRequeridos;
	}

	public void setDocumentosRequeridos(List<DocumentosRequeridos> documentosRequeridos) {
		this.documentosRequeridos = documentosRequeridos;
	}

	public List<ProgresoEstudiante> getProgresoEstudiante() {
		return progresoEstudiante;
	}

	public void setProgresoEstudiante(List<ProgresoEstudiante> progresoEstudiante) {
		this.progresoEstudiante = progresoEstudiante;
	}

	@Override
	public String toString() {
		return "EstadoDocumentoPorEstudiante [estadoDocumentoPorEstudianteId=" + estadoDocumentoPorEstudianteId
				+ ", entregado=" + entregado + ", aprobado=" + aprobado + ", fechaDeEntrega=" + fechaDeEntrega
				+ ", fechaDeAprobacion=" + fechaDeAprobacion + ", documentosRequeridos=" + documentosRequeridos
				+ ", progresoEstudiante=" + progresoEstudiante + "]";
	}	

}
