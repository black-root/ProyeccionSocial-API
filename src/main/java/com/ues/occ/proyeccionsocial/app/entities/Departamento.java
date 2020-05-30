package com.ues.occ.proyeccionsocial.app.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departamento")
public class Departamento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "departamento_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer departamentoId;
	
	@Column(name = "descripcion", nullable = false)
	private String descripcion;
	
	public Departamento() {
		
	}
	
	public Integer getDepartamentoId() {
		return departamentoId;
	}

	public void setDepartamentoId(Integer departamentoId) {
		this.departamentoId = departamentoId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Departamento(Integer departamentoId, String descripcion) {
		super();
		this.departamentoId = departamentoId;
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Departamento [departamentoId=" + departamentoId + ", descripcion=" + descripcion + "]";
	}
	
	
}
