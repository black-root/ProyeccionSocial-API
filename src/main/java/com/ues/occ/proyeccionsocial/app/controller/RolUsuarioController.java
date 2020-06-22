package com.ues.occ.proyeccionsocial.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ues.occ.proyeccionsocial.app.entities.RolUsuario;
import com.ues.occ.proyeccionsocial.app.services.RolUsuarioService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api/proyeccion-social/rol-usuario")
public class RolUsuarioController {

	@Autowired
	private RolUsuarioService rolUsuarioService;
	
	@GetMapping(value = "/")
	public Iterable<RolUsuario> getAllRolUsuario(){
		return rolUsuarioService.findAllRolUsuario();
	}
	
	@GetMapping(value = "/{id}")
	public Optional<RolUsuario> getByIdRolUsuario(@PathVariable("id") Integer id) {
		return rolUsuarioService.findById(id);
	}
	
	@PostMapping(value = "/")
	public RolUsuario createRolUsuario(@RequestBody RolUsuario entity) {
		return rolUsuarioService.createRolUsuario(entity);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteRolUsuario(@PathVariable("id") Integer id) {
		rolUsuarioService.deleteRolUsuario(id);
	}
	
	@PutMapping(value = "/{id}")
	public RolUsuario updateRolUsuario(@RequestBody RolUsuario entity, @PathVariable("id") Integer id) {	
		return rolUsuarioService.updateRolUsuario(entity, id);
	}
	
	@GetMapping( value = "/descripcion/{descripcion:.+}")
	public List<RolUsuario> getDescripcion(@PathVariable("descripcion") String descripcion){
		return rolUsuarioService.getDescripcion(descripcion);
	}
	
}
