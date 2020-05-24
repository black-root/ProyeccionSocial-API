package com.ues.occ.proyeccionsocial.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ues.occ.proyeccionsocial.app.dao.RolUsuarioDao;
import com.ues.occ.proyeccionsocial.app.dao.UsuarioDao;
import com.ues.occ.proyeccionsocial.app.entities.Usuario;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioDao usuarioDao;
	
	@Autowired
	private RolUsuarioDao rolUsuarioDao;

	public Iterable<Usuario> findAllUsuarios() {
		return usuarioDao.findAll();
	}

	public List<Object> getCustomaized() {
		return usuarioDao.getUserCustomaized();
	}

	public Optional<Usuario> findById(Integer id) {
		// TODO Auto-generated method stub
		return usuarioDao.findById(id);
	}

	public Usuario createUsuario(Usuario entity) {
		entity.setNombre(entity.getNombre().toUpperCase());
		entity.setApellido(entity.getApellido().toUpperCase());
		return usuarioDao.save(entity);
	}

	public Usuario updateUsuario(Usuario entity, Integer id) {
		Optional<Usuario> u = usuarioDao.findById(id);
		String descrRolUsuario = rolUsuarioDao.findById(entity.getRolUsuario().getRolID())
				.get().getDescripcion();
		
		if (u != null && entity.getRolUsuario().getRolID() !=null) {
			entity.setUsuarioID(id);
			entity.setApellido(entity.getApellido().toUpperCase());
			entity.setNombre(entity.getNombre().toUpperCase());
			entity.getRolUsuario().setRolID(entity.getRolUsuario().getRolID());
			entity.getRolUsuario().setDescripcion(descrRolUsuario);
			
			return usuarioDao.save(entity);
		} else {
			return null;
		}
		
	}

	public void deleteUsuario(Integer id) {
		usuarioDao.deleteById(id);

	}
}
