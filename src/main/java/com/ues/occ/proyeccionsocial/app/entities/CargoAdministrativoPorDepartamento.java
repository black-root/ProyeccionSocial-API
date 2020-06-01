package com.ues.occ.proyeccionsocial.app.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cargo_admi_por_dep")
public class CargoAdministrativoPorDepartamento implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cargo_admi_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cargoAdmiId;
	
	@ManyToOne
	@JoinColumn(name = "cargo_administrativo_cargo_id", referencedColumnName = "cargo_id")
	private CargoAdministrativo cargoAdmnistrativo;
	
	@ManyToOne
	@JoinColumn(name = "departamento_departamento_id", referencedColumnName = "departamento_id")
	private Departamento departamento;
	
	@Column(name = "nombre", nullable = false, length = 100)
	private String nombre;
	
	@Column(name = "horario_habil", length = 200, nullable = true)
	private String horarioHabil;
	
	@Column(name = "fecha_de_creacion", nullable = true)
	private Date fechaDeCreacion;
	
	@Column(name = "email", nullable = true)
	private String email;

	public Integer getCargoAdmiId() {
		return cargoAdmiId;
	}

	public void setCargoAdmiId(Integer cargoAdmiId) {
		this.cargoAdmiId = cargoAdmiId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHorarioHabil() {
		return horarioHabil;
	}

	public void setHorarioHabil(String horarioHabil) {
		this.horarioHabil = horarioHabil;
	}

	public Date getFechaDeCreacion() {
		return fechaDeCreacion;
	}

	public void setFechaDeCreacion(Date fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CargoAdministrativo getCargoAdmnistrativo() {
		return cargoAdmnistrativo;
	}

	public void setCargoAdmnistrativo(CargoAdministrativo cargoAdmnistrativo) {
		this.cargoAdmnistrativo = cargoAdmnistrativo;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public CargoAdministrativoPorDepartamento() {
		
	}

	public CargoAdministrativoPorDepartamento(Integer cargoAdmiId, CargoAdministrativo cargoAdmnistrativo,
			Departamento departamento, String nombre, String horarioHabil, Date fechaDeCreacion, String email) {
		super();
		this.cargoAdmiId = cargoAdmiId;
		this.cargoAdmnistrativo = cargoAdmnistrativo;
		this.departamento = departamento;
		this.nombre = nombre;
		this.horarioHabil = horarioHabil;
		this.fechaDeCreacion = fechaDeCreacion;
		this.email = email;
	}

	@Override
	public String toString() {
		return "CargoAdministrativoPorDepartamento [cargoAdmiId=" + cargoAdmiId + ", cargoAdmnistrativo="
				+ cargoAdmnistrativo + ", departamento=" + departamento + ", nombre=" + nombre + ", horarioHabil="
				+ horarioHabil + ", fechaDeCreacion=" + fechaDeCreacion + ", email=" + email + "]";
	}

	
	
	
}
