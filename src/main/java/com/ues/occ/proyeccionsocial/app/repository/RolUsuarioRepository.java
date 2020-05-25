package com.ues.occ.proyeccionsocial.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ues.occ.proyeccionsocial.app.entities.RolUsuario;

@Repository
public interface RolUsuarioRepository extends CrudRepository<RolUsuario, Integer> {

	public List<RolUsuario> findByDescripcion(String descripcion);
	
}
