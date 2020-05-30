package com.ues.occ.proyeccionsocial.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ues.occ.proyeccionsocial.app.entities.Departamento;
import com.ues.occ.proyeccionsocial.app.services.DepartamentoService;

@RestController
@RequestMapping(value = "/api/proyeccion-social/departamento")
public class DepartamentoController {

	@Autowired
	private DepartamentoService departamentoService;
	
	@GetMapping(value = "/{id}")
	public Optional<Departamento> getDepartamentoById(@PathVariable("id") Integer id){
		return departamentoService.findById(id);
	}
	
	@GetMapping(value = "/all")
	public Iterable<Departamento> getAllDepartamentos(){
		return departamentoService.findAll();
	}
	
}
