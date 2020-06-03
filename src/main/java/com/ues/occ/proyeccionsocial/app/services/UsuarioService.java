package com.ues.occ.proyeccionsocial.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ues.occ.proyeccionsocial.app.entities.Usuario;
import com.ues.occ.proyeccionsocial.app.repository.UsuarioRepository;

@Service
public class UsuarioService implements UserDetailsService {

	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Autowired
	private UsuarioRepository usuarioDao;

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
		entity.setClave(encoder.encode(entity.getClave()));
		return usuarioDao.save(entity);
	}

	public Usuario updateUsuario(Usuario entity, Integer id) {
		Usuario u = usuarioDao.findById(id).get();
		if (u != null && entity.getRolUsuario().getRolID() != null) {
			
			entity.setUsuarioID(id);
			entity.setApellido(entity.getApellido().toUpperCase());
			entity.setNombre(entity.getNombre().toUpperCase());
			entity.setClave(encoder.encode(entity.getClave()));

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

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Usuario user = usuarioDao.findByNombre(username);
		
		//upgrade it using roles from the database
		List<GrantedAuthority> roles = new ArrayList<>();
		roles.add(new SimpleGrantedAuthority("ADMIN"));
		
		UserDetails userDet = new User(user.getNombre(), user.getClave(), roles);
		return userDet;
	}
}
