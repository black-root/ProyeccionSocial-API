package com.ues.occ.proyeccionsocial.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ues.occ.proyeccionsocial.app.entities.Usuario;
import com.ues.occ.proyeccionsocial.app.services.UsuarioService;

@RestController
@RequestMapping(value = "/api/proyeccion-social/usuario")
public class UsuarioRest {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value = "/all")
	public Iterable<Usuario> getAllUsuarios() {
		return usuarioService.findAllUsuarios();
	}
	
	@GetMapping(value = "/{id}")
	public Optional<Usuario> getByIdUsuario(@PathVariable("id") Integer id) {
		return usuarioService.findById(id);
	}
	
	@PostMapping(value = "/create")
	public Usuario createUsuario(@RequestBody Usuario entity) {
		return usuarioService.createUsuario(entity);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public void deleteUsuario(@PathVariable("id") Integer id) {
		usuarioService.deleteUsuario(id);
	}
	
	@PutMapping(value = "/update")
	public Usuario updateUsuario(@RequestBody Usuario entity) {
		return usuarioService.updateUsuario(entity);
	}
}
