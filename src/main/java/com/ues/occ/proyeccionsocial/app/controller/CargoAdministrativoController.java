package com.ues.occ.proyeccionsocial.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ues.occ.proyeccionsocial.app.entities.CargoAdministrativo;
import com.ues.occ.proyeccionsocial.app.services.CargoAdministrativoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api/proyeccion-social/cargo-administrativo")
public class CargoAdministrativoController {

	@Autowired
	private CargoAdministrativoService service;
	
	@GetMapping(value = "/{id}")
	public Optional<CargoAdministrativo> getCargoAdmnistrativoById(@PathVariable("id") Integer id) {
		return service.findById(id);
	}
	
	@GetMapping(value = "/")
	public Iterable<CargoAdministrativo> getAllCargoAdmnistrativo() {
		return service.findAll();
	}
	
	@PostMapping(value = "/")
	public ResponseEntity<CargoAdministrativo> createCargoAdmnistrativo(@RequestBody CargoAdministrativo entity) {
		return new ResponseEntity<CargoAdministrativo>(service.create(entity), HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<CargoAdministrativo> updateCargoAdmnistrativo(
			@RequestBody CargoAdministrativo entity, @PathVariable("id") Integer id) {
		return new ResponseEntity<CargoAdministrativo>(service.update(entity, id), HttpStatus.CREATED);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<CargoAdministrativo> deleteCargoAdmnistrativo(@PathVariable("id") Integer id){
		service.delete(id);
		return new ResponseEntity<CargoAdministrativo>(HttpStatus.NO_CONTENT);
	}
}
