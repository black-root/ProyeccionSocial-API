package com.ues.occ.proyeccionsocial.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ues.occ.proyeccionsocial.app.entities.CargoAdmnistrativo;
import com.ues.occ.proyeccionsocial.app.services.CargoAdmnistrativoService;

@RestController
@RequestMapping(value = "/api/proyeccion-social/cargo-administrativo")
public class CargoAdministrativoController {

	@Autowired
	private CargoAdmnistrativoService service;
	
	@GetMapping(value = "/{id}")
	public Optional<CargoAdmnistrativo> getCargoAdmnistrativoById(@PathVariable("id") Integer id) {
		return service.findById(id);
	}
	
	@GetMapping(value = "/all")
	public Iterable<CargoAdmnistrativo> getAllCargoAdmnistrativo() {
		return service.findAll();
	}
	
	@PostMapping(value = "/create")
	public ResponseEntity<CargoAdmnistrativo> createCargoAdmnistrativo(@RequestBody CargoAdmnistrativo entity) {
		return new ResponseEntity<CargoAdmnistrativo>(service.create(entity), HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/update/{id}")
	public ResponseEntity<CargoAdmnistrativo> updateCargoAdmnistrativo(
			@RequestBody CargoAdmnistrativo entity, @PathVariable("id") Integer id) {
		return new ResponseEntity<CargoAdmnistrativo>(service.update(entity, id), HttpStatus.CREATED);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<CargoAdmnistrativo> deleteCargoAdmnistrativo(@PathVariable("id") Integer id){
		service.delete(id);
		return new ResponseEntity<CargoAdmnistrativo>(HttpStatus.NO_CONTENT);
	}
}
