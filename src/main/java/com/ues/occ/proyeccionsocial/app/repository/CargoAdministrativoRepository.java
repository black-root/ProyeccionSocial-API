package com.ues.occ.proyeccionsocial.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ues.occ.proyeccionsocial.app.entities.CargoAdministrativo;

@Repository
public interface CargoAdministrativoRepository extends CrudRepository<CargoAdministrativo, Integer>{

}
