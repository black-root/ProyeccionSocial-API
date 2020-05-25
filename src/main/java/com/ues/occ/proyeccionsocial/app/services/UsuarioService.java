package com.ues.occ.proyeccionsocial.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ues.occ.proyeccionsocial.app.entities.Usuario;
import com.ues.occ.proyeccionsocial.app.repository.RolUsuarioRepository;
import com.ues.occ.proyeccionsocial.app.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioDao;

	@Autowired
	private RolUsuarioRepository rolUsuarioDao;

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
		String descrRolUsuario = rolUsuarioDao.findById(entity.getRolUsuario().getRolID()).get().getDescripcion();

		if (u != null && entity.getRolUsuario().getRolID() != null) {
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

	public boolean deleteUsuario(Integer id) {

		Optional<Usuario> usuario = usuarioDao.findById(id);
		if (usuario.isPresent()) {
			usuarioDao.deleteUsuario(id);
			return true;
		} else {
			return false;
		}

	}
}
