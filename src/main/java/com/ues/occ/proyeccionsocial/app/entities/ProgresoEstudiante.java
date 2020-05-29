package com.ues.occ.proyeccionsocial.app.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "progreso_estudiante")
public class ProgresoEstudiante implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "carnet", length = 10)
	private String carnet;
	
	@Column(name = "progreso_horas_realizadas", nullable = false, length = 3)
	private Integer progresoHorasRealizadas;
	
	@OneToMany(targetEntity = EstadoDocumentoPorEstudiante.class, mappedBy = "progresoEstudiante", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<EstadoDocumentoPorEstudiante> estadoDocumentoPorEstudiante = new ArrayList<>();

	
	public ProgresoEstudiante() {
		// TODO Auto-generated constructor stub
	}


	public ProgresoEstudiante(String carnet, List<EstadoDocumentoPorEstudiante> estadoDocumentoPorEstudiante) {
		super();
		this.carnet = carnet;
		this.estadoDocumentoPorEstudiante = estadoDocumentoPorEstudiante;
	}


	public String getCarnet() {
		return carnet;
	}


	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}


	public Integer getProgresoHorasRealizadas() {
		return progresoHorasRealizadas;
	}


	public void setProgresoHorasRealizadas(Integer progresoHorasRealizadas) {
		this.progresoHorasRealizadas = progresoHorasRealizadas;
	}


	@Override
	public String toString() {
		return "ProgresoEstudiante [carnet=" + carnet + ", progresoHorasRealizadas=" + progresoHorasRealizadas + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carnet == null) ? 0 : carnet.hashCode());
		result = prime * result
				+ ((estadoDocumentoPorEstudiante == null) ? 0 : estadoDocumentoPorEstudiante.hashCode());
		result = prime * result + ((progresoHorasRealizadas == null) ? 0 : progresoHorasRealizadas.hashCode());
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
		ProgresoEstudiante other = (ProgresoEstudiante) obj;
		if (carnet == null) {
			if (other.carnet != null)
				return false;
		} else if (!carnet.equals(other.carnet))
			return false;
		if (estadoDocumentoPorEstudiante == null) {
			if (other.estadoDocumentoPorEstudiante != null)
				return false;
		} else if (!estadoDocumentoPorEstudiante.equals(other.estadoDocumentoPorEstudiante))
			return false;
		if (progresoHorasRealizadas == null) {
			if (other.progresoHorasRealizadas != null)
				return false;
		} else if (!progresoHorasRealizadas.equals(other.progresoHorasRealizadas))
			return false;
		return true;
	}
	
	
	
}
