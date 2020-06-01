package com.ues.occ.proyeccionsocial.app.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ues.occ.proyeccionsocial.app.entities.CargoAdministrativo;
import com.ues.occ.proyeccionsocial.app.repository.CargoAdministrativoRepository;


@Service
public class CargoAdministrativoService {

	@Autowired
	private CargoAdministrativoRepository cargoAdministrativoRepository;

	public Optional<CargoAdministrativo> findById(Integer id) {
		// TODO Auto-generated method stub
		return cargoAdministrativoRepository.findById(id);
	}

	public Iterable<CargoAdministrativo> findAll() {
		// TODO Auto-generated method stub
		return cargoAdministrativoRepository.findAll();
	}

	public CargoAdministrativo create(CargoAdministrativo entity) {
		// TODO Auto-generated method stub
		return cargoAdministrativoRepository.save(entity);
	}

	public CargoAdministrativo update(CargoAdministrativo entity, Integer id) {
		// TODO Auto-generated method stub
		CargoAdministrativo cargo = cargoAdministrativoRepository.findById(id).get(); 
		cargo.setDescripcion(entity.getDescripcion());
		return cargoAdministrativoRepository.save(cargo);
	}

	public void delete(Integer id) {
		cargoAdministrativoRepository.deleteById(id);
	}
	
	
}
