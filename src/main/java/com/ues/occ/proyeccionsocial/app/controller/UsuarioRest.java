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
import org.springframework.web.bind.annotation.ResponseStatus;
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

	@PutMapping(value = "/update/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Usuario> updateUsuario(@RequestBody Usuario entity, @PathVariable("id") Integer usuarioID) {

		if (usuarioID > 0 && usuarioID != null 
				&& !entity.getNombre().isEmpty() 
				&& !entity.getApellido().isEmpty()
				&& !entity.getClave().isEmpty() 
				&& !entity.getEmail().isEmpty() 
				&& !entity.getRolUsuario().getDescripcion().isEmpty()
				&& entity.getRolUsuario().getRolID() != null) {
			
			return new ResponseEntity<>(usuarioService.updateUsuario(entity, usuarioID), HttpStatus.OK);

		} else {
			return null;
	    }
	}

}
