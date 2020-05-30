package com.ues.occ.proyeccionsocial.app.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ues.occ.proyeccionsocial.app.entities.CargoAdmnistrativo;
import com.ues.occ.proyeccionsocial.app.repository.CargoAdmnistrativoRepository;

@Service
public class CargoAdmnistrativoService {

	@Autowired
	private CargoAdmnistrativoRepository cargoAdministrativoRepository;

	public Optional<CargoAdmnistrativo> findById(Integer id) {
		// TODO Auto-generated method stub
		return cargoAdministrativoRepository.findById(id);
	}

	public Iterable<CargoAdmnistrativo> findAll() {
		// TODO Auto-generated method stub
		return cargoAdministrativoRepository.findAll();
	}

	public CargoAdmnistrativo create(CargoAdmnistrativo entity) {
		// TODO Auto-generated method stub
		return cargoAdministrativoRepository.save(entity);
	}

	public CargoAdmnistrativo update(CargoAdmnistrativo entity, Integer id) {
		// TODO Auto-generated method stub
		CargoAdmnistrativo cargo = cargoAdministrativoRepository.findById(id).get(); 
		cargo.setDescripcion(entity.getDescripcion());
		return cargoAdministrativoRepository.save(cargo);
	}

	public void delete(Integer id) {
		cargoAdministrativoRepository.deleteById(id);
	}
	
	
}
