package com.ues.occ.proyeccionsocial.app.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.skyscreamer.jsonassert.JSONAssert;

import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RolUsuarioControllerTest {

	@LocalServerPort
	private int port;

	TestRestTemplate restTemplate = new TestRestTemplate();
	HttpHeaders headers = new HttpHeaders();

	private String createURLWithPort(String uri) {
		return "http://localhost:" + port + uri;
	}
/*
	@Test
	public void testGetRolUsuario() throws Exception {
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);
		ResponseEntity<String> response = restTemplate.exchange(
				createURLWithPort("/api/proyeccion-social/rol-usuario/1"), HttpMethod.GET, entity, String.class);
		String expected = "{\"rolID\": 1,\r\n" + "\"descripcion\": \"ADMINISTRADOR\"}";
		JSONAssert.assertEquals(expected, response.getBody(), false);
	}*/
}
