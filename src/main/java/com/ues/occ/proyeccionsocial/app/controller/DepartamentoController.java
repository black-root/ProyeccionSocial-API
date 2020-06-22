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

import com.ues.occ.proyeccionsocial.app.entities.Departamento;
import com.ues.occ.proyeccionsocial.app.services.DepartamentoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api/proyeccion-social/departamento")
public class DepartamentoController {

	@Autowired
	private DepartamentoService departamentoService;
	
	@GetMapping(value = "/{id}")
	public Optional<Departamento> getDepartamentoById(@PathVariable("id") Integer id){
		return departamentoService.findById(id);
	}
	
	@GetMapping(value = "/")
	public Iterable<Departamento> getAllDepartamentos(){
		return departamentoService.findAll();
	}
	
	@PostMapping(value = "/")
	public ResponseEntity<Departamento> createDepartamento(@RequestBody Departamento departamento){
		return new ResponseEntity<Departamento>(departamentoService.createDepartamento(departamento), HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Departamento> updateDepartamento(
			@RequestBody Departamento departamento, @PathVariable("id") Integer id){
		return new ResponseEntity<Departamento>(departamentoService.updateDepartamento(departamento, id), HttpStatus.CREATED);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Departamento> deleteDepartamento(@PathVariable("id") Integer id){
		
		departamentoService.delete(id);
		
		return new ResponseEntity<Departamento>(HttpStatus.NO_CONTENT);
	}
}
