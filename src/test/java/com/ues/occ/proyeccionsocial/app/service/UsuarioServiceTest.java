package com.ues.occ.proyeccionsocial.app.service;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.ues.occ.proyeccionsocial.app.entities.RolUsuario;
import com.ues.occ.proyeccionsocial.app.entities.Usuario;
import com.ues.occ.proyeccionsocial.app.repository.UsuarioRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsuarioServiceTest {
/*
	@Autowired
	private UsuarioRepository repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Test
	public void createUsuarioTest() {
	//String nombre, String apellido, String email, String clave, RolUsuario rolUsuario
		RolUsuario rol = new RolUsuario("ADMINISTRADOR");
		Usuario us = new Usuario("pepe", "perez", "pepe.perez@gmail.com", encoder.encode("1234"), rol);
		Usuario esperado = repo.save(us);
		
		assertTrue(esperado.getClave().equalsIgnoreCase(us.getClave()));
		
	}*/
}
