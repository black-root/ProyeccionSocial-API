package com.ues.occ.proyeccionsocial.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ues.occ.proyeccionsocial.app.entities.Usuario;

@Repository
public interface UsuarioDao extends CrudRepository<Usuario, Integer> {

}
