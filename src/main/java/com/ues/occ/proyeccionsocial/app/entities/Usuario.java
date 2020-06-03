package com.ues.occ.proyeccionsocial.app.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

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

	@Column(length = 200, nullable = false)
	private String clave;

	//@ManyToOne(optional = false, cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@ManyToOne(optional = false)
	private RolUsuario rolUsuario;

	protected Usuario() {
	}

	public Integer getUsuarioID() {
		return usuarioID;
	}

	public void setUsuarioID(Integer usuarioID) {
		this.usuarioID = usuarioID;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public RolUsuario getRolUsuario() {
		return rolUsuario;
	}

	public void setRolUsuario(RolUsuario rolUsuario) {
		this.rolUsuario = rolUsuario;
	}

	@Override
	public String toString() {
		return "Usuario [usuarioID=" + usuarioID + ", nombre=" + nombre + ", Apellido=" + Apellido + ", email=" + email
				+ ", clave=" + clave + ", rolUsuario=" + rolUsuario+ "]";
	}

	public Usuario(String nombre, String apellido, String email, String clave,
			RolUsuario rolUsuario) {
		super();
		//this.usuarioID = usuarioID;
		this.nombre = nombre;
		Apellido = apellido;
		this.email = email;
		this.clave = clave;
		this.rolUsuario = rolUsuario;
	}

}
