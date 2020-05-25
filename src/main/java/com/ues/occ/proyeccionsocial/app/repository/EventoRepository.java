package com.ues.occ.proyeccionsocial.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ues.occ.proyeccionsocial.app.entities.Evento;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Integer> {

}
