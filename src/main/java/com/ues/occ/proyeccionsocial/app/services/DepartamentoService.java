package com.ues.occ.proyeccionsocial.app.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ues.occ.proyeccionsocial.app.entities.Departamento;
import com.ues.occ.proyeccionsocial.app.repository.DepartamentoRepository;

@Service
public class DepartamentoService {

	@Autowired
	private DepartamentoRepository departamentoRepository;

	public Optional<Departamento> findById(Integer id) {
		// TODO Auto-generated method stub
		return departamentoRepository.findById(id);
	}

	public Iterable<Departamento> findAll() {
		// TODO Auto-generated method stub
		return departamentoRepository.findAll();
	}
	
}
