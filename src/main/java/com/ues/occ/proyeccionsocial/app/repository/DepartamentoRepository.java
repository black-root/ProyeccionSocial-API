package com.ues.occ.proyeccionsocial.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ues.occ.proyeccionsocial.app.entities.Departamento;

@Repository
public interface DepartamentoRepository extends CrudRepository<Departamento, Integer> {

}
