package com.ues.occ.proyeccionsocial.app.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ues.occ.proyeccionsocial.app.entities.RolUsuario;
import com.ues.occ.proyeccionsocial.app.repository.RolUsuarioRepository;
import com.ues.occ.proyeccionsocial.app.services.RolUsuarioService;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RolUsuarioControllerMockTests {

	@Autowired
	private RolUsuarioService rolUsuarioService;
	
	@MockBean
	private RolUsuarioRepository rolUsuarioRepository;
	
	@Test
    public void testGetRolUsuarioByIdWithMockRepository() throws Exception {
        Optional<RolUsuario> optRolUsuario = Optional.of( new RolUsuario("Rajesh"));
        when(rolUsuarioRepository.findById(1)).thenReturn(optRolUsuario);
        assertTrue(rolUsuarioService.findById(1).get().getDescripcion().contains("RAJESH"));
    }

}
