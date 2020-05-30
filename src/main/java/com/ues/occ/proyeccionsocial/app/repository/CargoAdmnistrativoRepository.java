package com.ues.occ.proyeccionsocial.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ues.occ.proyeccionsocial.app.entities.CargoAdmnistrativo;

@Repository
public interface CargoAdmnistrativoRepository extends CrudRepository<CargoAdmnistrativo, Integer>{

}
