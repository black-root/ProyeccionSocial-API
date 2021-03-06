package com.ues.occ.proyeccionsocial.app.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cargo_administrativo")
public class CargoAdministrativo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cargo_id", length = 3, nullable = false)
	private Integer cargoId;
	
	@Column(name = "descripcion", nullable = false, length = 100)
	private String descripcion;

	@OneToMany(targetEntity = CargoAdministrativoPorDepartamento.class, 
			mappedBy = "cargoAdmnistrativo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<CargoAdministrativoPorDepartamento> cargoAdmnistrativoPorDepartamento;
	
	public CargoAdministrativo(Integer cargoId, String descripcion) {
		super();
		this.cargoId = cargoId;
		this.descripcion = descripcion;
	}

	public CargoAdministrativo() {
		
	}

	public Integer getCargoId() {
		return cargoId;
	}

	public void setCargoId(Integer cargoId) {
		this.cargoId = cargoId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "CargoAdmnistrativo [cargoId=" + cargoId + ", descripcion=" + descripcion + "]";
	}
}
