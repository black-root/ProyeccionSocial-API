package com.ues.occ.proyeccionsocial.app.services;

import java.util.List;
import java.util.Optional;

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

	public Optional<RolUsuario> findById(Integer id) {
		return rolUsuarioDao.findById(id);
	}

	public RolUsuario createRolUsuario(RolUsuario ru) {
		ru.setDescripcion(ru.getDescripcion().toUpperCase());
		return rolUsuarioDao.save(ru);
	}

	public void deleteRolUsuario(Integer id) {
		rolUsuarioDao.deleteById(id);
	}

	public RolUsuario updateRolUsuario(RolUsuario entity) throws IllegalArgumentException{
		if (rolUsuarioDao.findById(entity.getRolID()) != null) {
			return rolUsuarioDao.save(entity);
		} else {
			return null;
		}

	}

	public List<RolUsuario> getDescripcion(String descripcion) {
		return rolUsuarioDao.findByDescripcion(descripcion);
	}

}
