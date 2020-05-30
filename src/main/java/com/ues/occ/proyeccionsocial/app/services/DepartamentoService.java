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

	public Departamento createDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		return departamentoRepository.save(departamento);
	}

	public Departamento updateDepartamento(Departamento departamento, Integer id) {
		// TODO Auto-generated method stub
		Departamento entity = departamentoRepository.findById(id).get();
		entity.setDescripcion(departamento.getDescripcion());

		return departamentoRepository.save(entity);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		departamentoRepository.deleteById(id);
	}

}
