package com.ues.occ.proyeccionsocial.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "usuario_id")
	private Integer usuarioID;
	
	@Column(length = 45, nullable = false)
	private String nombre;
	
	@Column(length = 45, nullable = false)
	private String Apellido;
	
	@Column(length = 45, nullable = false)
	private String email;
	
	@Column(length = 45, nullable = false)
	private String clave;
	
	protected Usuario() {
	}
	
	
}
