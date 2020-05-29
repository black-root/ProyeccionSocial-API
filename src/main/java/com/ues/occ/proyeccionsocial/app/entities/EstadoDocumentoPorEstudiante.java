package com.ues.occ.proyeccionsocial.app.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "estado_documento_por_estudiante")
@IdClass(EstadoDocumentoPorEstudianteId.class)
public class EstadoDocumentoPorEstudiante implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "entregado", nullable = false)
	private boolean entregado;

	@Column(name = "aprobado", nullable = false)
	private boolean aprobado;

	@Column(name = "fecha_de_entrega", nullable = true)
	private Date fechaDeEntrega;

	@Column(name = "fecha_de_aprobacion", nullable = true)
	private Date fechaDeAprobacion;

	@Id
	@ManyToOne(targetEntity = DocumentosRequeridos.class, optional = false)
	@JoinColumn(name = "documentos_requeridos_documentos_requeridos_id", 
	referencedColumnName = "documentos_requeridos_id",  insertable = false, updatable = false)
	private DocumentosRequeridos documentosRequeridos;

	@Id
	@ManyToOne(targetEntity =  ProgresoEstudiante.class, optional = false)
	@JoinColumn(name = "progreso_estudiante_carnet", 
	referencedColumnName = "carnet",  insertable = false, updatable = false)
	private ProgresoEstudiante progresoEstudiante;

	public EstadoDocumentoPorEstudiante() {
		// TODO Auto-generated constructor stub
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

	public DocumentosRequeridos getDocumentosRequeridos() {
		return documentosRequeridos;
	}

	public void setDocumentosRequeridos(DocumentosRequeridos documentosRequeridos) {
		this.documentosRequeridos = documentosRequeridos;
	}

	public ProgresoEstudiante getProgresoEstudiante() {
		return progresoEstudiante;
	}

	public void setProgresoEstudiante(ProgresoEstudiante progresoEstudiante) {
		this.progresoEstudiante = progresoEstudiante;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (aprobado ? 1231 : 1237);
		result = prime * result + ((documentosRequeridos == null) ? 0 : documentosRequeridos.hashCode());
		result = prime * result + (entregado ? 1231 : 1237);
		result = prime * result + ((fechaDeAprobacion == null) ? 0 : fechaDeAprobacion.hashCode());
		result = prime * result + ((fechaDeEntrega == null) ? 0 : fechaDeEntrega.hashCode());
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
		EstadoDocumentoPorEstudiante other = (EstadoDocumentoPorEstudiante) obj;
		if (aprobado != other.aprobado)
			return false;
		if (documentosRequeridos == null) {
			if (other.documentosRequeridos != null)
				return false;
		} else if (!documentosRequeridos.equals(other.documentosRequeridos))
			return false;
		if (entregado != other.entregado)
			return false;
		if (fechaDeAprobacion == null) {
			if (other.fechaDeAprobacion != null)
				return false;
		} else if (!fechaDeAprobacion.equals(other.fechaDeAprobacion))
			return false;
		if (fechaDeEntrega == null) {
			if (other.fechaDeEntrega != null)
				return false;
		} else if (!fechaDeEntrega.equals(other.fechaDeEntrega))
			return false;
		if (progresoEstudiante == null) {
			if (other.progresoEstudiante != null)
				return false;
		} else if (!progresoEstudiante.equals(other.progresoEstudiante))
			return false;
		return true;
	}

	public EstadoDocumentoPorEstudiante(boolean entregado, boolean aprobado, Date fechaDeEntrega,
			Date fechaDeAprobacion, DocumentosRequeridos documentosRequeridos, ProgresoEstudiante progresoEstudiante) {
		super();
		this.entregado = entregado;
		this.aprobado = aprobado;
		this.fechaDeEntrega = fechaDeEntrega;
		this.fechaDeAprobacion = fechaDeAprobacion;
		this.documentosRequeridos = documentosRequeridos;
		this.progresoEstudiante = progresoEstudiante;
	}

	@Override
	public String toString() {
		return "EstadoDocumentoPorEstudiante [entregado=" + entregado + ", aprobado=" + aprobado + ", fechaDeEntrega="
				+ fechaDeEntrega + ", fechaDeAprobacion=" + fechaDeAprobacion + ", documentosRequeridos="
				+ documentosRequeridos + ", progresoEstudiante=" + progresoEstudiante + "]";
	}


}
