package com.ues.occ.proyeccionsocial.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ues.occ.proyeccionsocial.app.dao.UsuarioDao;
import com.ues.occ.proyeccionsocial.app.entities.Usuario;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioDao usuarioDao;
	
	public Iterable<Usuario> findAllUsuarios(){
		return usuarioDao.findAll();
	}
}
