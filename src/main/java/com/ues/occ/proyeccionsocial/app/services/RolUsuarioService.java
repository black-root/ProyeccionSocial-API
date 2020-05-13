package com.ues.occ.proyeccionsocial.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ues.occ.proyeccionsocial.app.dao.RolUsuarioDao;
import com.ues.occ.proyeccionsocial.app.entities.RolUsuario;

@Service
public class RolUsuarioService {

	@Autowired
	private RolUsuarioDao rolUsuarioDao;

	public Iterable<RolUsuario> findAllRolUsuario() {
		return rolUsuarioDao.findAll();
	}
	
}
