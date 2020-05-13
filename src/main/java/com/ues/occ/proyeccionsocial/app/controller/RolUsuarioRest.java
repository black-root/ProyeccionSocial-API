package com.ues.occ.proyeccionsocial.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ues.occ.proyeccionsocial.app.entities.RolUsuario;
import com.ues.occ.proyeccionsocial.app.services.RolUsuarioService;

@RestController
@RequestMapping(value = "/api/proyeccion-social")
public class RolUsuarioRest {

	@Autowired
	private RolUsuarioService rolUsuarioService;
	
	@GetMapping(value = "/rol-usuario/all")
	public Iterable<RolUsuario> getAllRolUsuario(){
		return rolUsuarioService.findAllRolUsuario();
	}
}
