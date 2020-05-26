package com.ues.occ.proyeccionsocial.app.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "evento")
public class Evento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eventoId;

	@Column(nullable = false, length = 100, name = "descripcion")
	private String descripcion;

	@Column(nullable = false, name = "fecha_inicio")
	private Date fechaDeInicio;

	@Column(nullable = true, name = "fecha_fin")
	private Date fechaDeFin;

	@OneToMany(mappedBy = "evento", cascade = CascadeType.ALL, fetch = FetchType.EAGER)

	private Set<DocumentosRequeridos> documentosRequeridos;

	public Integer getEventoId() {
		return eventoId;
	}

	public void setEventoId(Integer eventoId) {
		this.eventoId = eventoId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaDeInicio() {
		return fechaDeInicio;
	}

	public void setFechaDeInicio(Date fechaDeInicio) {
		this.fechaDeInicio = fechaDeInicio;
	}

	public Date getFechaDeFin() {
		return fechaDeFin;
	}

	public void setFechaDeFin(Date fechaDeFin) {
		this.fechaDeFin = fechaDeFin;
	}

	public Evento() {
	}

	public Evento(Integer eventoId, String descripcion, Date fechaDeInicio, Date fechaDeFin) {
		super();
		this.eventoId = eventoId;
		this.descripcion = descripcion;
		this.fechaDeInicio = fechaDeInicio;
		this.fechaDeFin = fechaDeFin;
	}

	@Override
	public String toString() {
		return "Evento [eventoId=" + eventoId + ", descripcion=" + descripcion + ", fechaDeInicio=" + fechaDeInicio
				+ ", fechaDeFin=" + fechaDeFin + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((eventoId == null) ? 0 : eventoId.hashCode());
		result = prime * result + ((fechaDeFin == null) ? 0 : fechaDeFin.hashCode());
		result = prime * result + ((fechaDeInicio == null) ? 0 : fechaDeInicio.hashCode());
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
		Evento other = (Evento) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (eventoId == null) {
			if (other.eventoId != null)
				return false;
		} else if (!eventoId.equals(other.eventoId))
			return false;
		if (fechaDeFin == null) {
			if (other.fechaDeFin != null)
				return false;
		} else if (!fechaDeFin.equals(other.fechaDeFin))
			return false;
		if (fechaDeInicio == null) {
			if (other.fechaDeInicio != null)
				return false;
		} else if (!fechaDeInicio.equals(other.fechaDeInicio))
			return false;
		return true;
	}

}
