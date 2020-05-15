package com.ues.occ.proyeccionsocial.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ues.occ.proyeccionsocial.app.entities.Usuario;
import com.ues.occ.proyeccionsocial.app.services.UsuarioService;

@RestController
@RequestMapping(value = "/api/proyeccion-social/usuario")
public class UsuarioRest {

	@Autowired
	private UsuarioService usuarioSv;
	
	@GetMapping(value = "/all")
	public Iterable<Usuario> getAllUsuarios() {
		return usuarioSv.findAllUsuarios();
	}
}
