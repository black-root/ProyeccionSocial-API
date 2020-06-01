package com.ues.occ.proyeccionsocial.app.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ues.occ.proyeccionsocial.app.entities.CargoAdministrativoPorDepartamento;
import com.ues.occ.proyeccionsocial.app.repository.CargoAdministrativoPorDepartamentoRepository;

@Service
public class CargoAdministrativoPorDepartamentoService {

	@Autowired
	private CargoAdministrativoPorDepartamentoRepository repository;

	public Optional<CargoAdministrativoPorDepartamento> findById(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	public Iterable<CargoAdministrativoPorDepartamento> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public CargoAdministrativoPorDepartamento create(CargoAdministrativoPorDepartamento entity) {
		// TODO Auto-generated method stub
		return repository.save(entity);
	}

	public CargoAdministrativoPorDepartamento update(CargoAdministrativoPorDepartamento entity, Integer id) {
		// TODO Auto-generated method stub
		
		CargoAdministrativoPorDepartamento cargoApD = repository.findById(id).get();
		cargoApD.setNombre(entity.getNombre());
		cargoApD.setHorarioHabil(entity.getHorarioHabil());
		cargoApD.setFechaDeCreacion(entity.getFechaDeCreacion());
		cargoApD.setEmail(entity.getEmail());
		
		
		
		return repository.save(entity);
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
