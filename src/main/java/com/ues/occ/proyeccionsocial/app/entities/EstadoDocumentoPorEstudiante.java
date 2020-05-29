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
	private EstadoDocumentoPorEstudianteId pk;
	
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
	private DocumentosRequeridos documentosRequeridos;

	
	@ManyToOne(targetEntity =  ProgresoEstudiante.class, optional = false)
	@JoinColumn(name = "progreso_estudiante_carnet", 
	referencedColumnName = "carnet",  insertable = false, updatable = false)
	private ProgresoEstudiante progresoEstudiante;
	
	public EstadoDocumentoPorEstudiante() {
		// TODO Auto-generated constructor stub
	}

	public EstadoDocumentoPorEstudianteId getPk() {
		return pk;
	}

	public void setPk(EstadoDocumentoPorEstudianteId pk) {
		this.pk = pk;
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

	public EstadoDocumentoPorEstudiante(EstadoDocumentoPorEstudianteId pk, boolean entregado, boolean aprobado,
			Date fechaDeEntrega, Date fechaDeAprobacion) {
		super();
		this.pk = pk;
		this.entregado = entregado;
		this.aprobado = aprobado;
		this.fechaDeEntrega = fechaDeEntrega;
		this.fechaDeAprobacion = fechaDeAprobacion;
	}

	@Override
	public String toString() {
		return "EstadoDocumentoPorEstudiante [pk=" + pk + ", entregado=" + entregado + ", aprobado=" + aprobado
				+ ", fechaDeEntrega=" + fechaDeEntrega + ", fechaDeAprobacion=" + fechaDeAprobacion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (aprobado ? 1231 : 1237);
		result = prime * result + (entregado ? 1231 : 1237);
		result = prime * result + ((fechaDeAprobacion == null) ? 0 : fechaDeAprobacion.hashCode());
		result = prime * result + ((fechaDeEntrega == null) ? 0 : fechaDeEntrega.hashCode());
		result = prime * result + ((pk == null) ? 0 : pk.hashCode());
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
		if (pk == null) {
			if (other.pk != null)
				return false;
		} else if (!pk.equals(other.pk))
			return false;
		return true;
	}	

}
