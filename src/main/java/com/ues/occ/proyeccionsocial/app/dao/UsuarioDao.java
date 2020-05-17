package com.ues.occ.proyeccionsocial.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ues.occ.proyeccionsocial.app.entities.Usuario;

@Repository
public interface UsuarioDao extends CrudRepository<Usuario, Integer> {

	//@Query(value = "SELECT c.usuario_id as 'ID', c.nombre, a.descripcion as 'Rol'" + 
//			"FROM usuario c INNER JOIN rol_usuario a ON a.rol_id = c.rol_usuario_rol_id;", nativeQuery = true)
	@Query("SELECT u.nombre FROM Usuario u WHERE u.usuarioID = '1'")
	public List<Object> getUserCustomaized();
}
