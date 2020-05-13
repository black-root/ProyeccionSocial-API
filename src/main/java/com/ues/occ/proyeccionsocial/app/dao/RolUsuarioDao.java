package com.ues.occ.proyeccionsocial.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ues.occ.proyeccionsocial.app.entities.RolUsuario;

@Repository
public interface RolUsuarioDao extends CrudRepository<RolUsuario, Integer> {

}
