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

import com.ues.occ.proyeccionsocial.app.entities.CargoAdministrativoPorDepartamento;
import com.ues.occ.proyeccionsocial.app.services.CargoAdministrativoPorDepartamentoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api/proyeccion-social/cargo-administrativo-por-departamento")
public class CargoAdministrativoPorDepartamentoController {

	
	@Autowired
	private CargoAdministrativoPorDepartamentoService service;
	
	
	@GetMapping(value = "/{id}")
	public Optional<CargoAdministrativoPorDepartamento> findById(@PathVariable("id") Integer id){
		return service.findById(id);
	}
	
	@GetMapping(value = "/")
	public Iterable<CargoAdministrativoPorDepartamento> findAll(){
		return service.findAll();
	}
	
	@PostMapping(value = "/")
	public ResponseEntity<CargoAdministrativoPorDepartamento> create(@RequestBody CargoAdministrativoPorDepartamento entity){
		return new ResponseEntity<CargoAdministrativoPorDepartamento>(
				service.create(entity), HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<CargoAdministrativoPorDepartamento> update(
			@RequestBody CargoAdministrativoPorDepartamento entity, @PathVariable("id") Integer id){
		return new ResponseEntity<CargoAdministrativoPorDepartamento>(
				service.update(entity, id), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<CargoAdministrativoPorDepartamento> delete(@PathVariable("id") Integer id){
	
		service.delete(id);
		
		return new ResponseEntity<CargoAdministrativoPorDepartamento>(HttpStatus.NO_CONTENT);
	}
	
}
