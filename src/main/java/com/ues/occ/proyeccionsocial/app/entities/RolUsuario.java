package com.ues.occ.proyeccionsocial.app.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rol_usuario")
public class RolUsuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "rol_id",length = 2)
	private Integer rolID;
	
	@Column(name = "descripcion", nullable = false)
	private String descripcion;
	
	public RolUsuario() {
	}
	
	public RolUsuario(String descripcion) {
		super();
		this.descripcion = descripcion.toUpperCase();
	}

	public Integer getRolID() {
		return rolID;
	}

	public void setRolID(Integer rolID) {
		this.rolID = rolID;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "RolUsuario [idRol=" + rolID + ", descripcion=" + descripcion + "]";
	}
}
