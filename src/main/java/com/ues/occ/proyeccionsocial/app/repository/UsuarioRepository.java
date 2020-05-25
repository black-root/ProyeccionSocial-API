package com.ues.occ.proyeccionsocial.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ues.occ.proyeccionsocial.app.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	// @Query(value = "SELECT c.usuario_id as 'ID', c.nombre, a.descripcion as
	// 'Rol'" +
//			"FROM usuario c INNER JOIN rol_usuario a ON a.rol_id = c.rol_usuario_rol_id;", nativeQuery = true)
	@Query("SELECT u.nombre FROM Usuario u WHERE u.usuarioID = '1'")
	public List<Object> getUserCustomaized();

	//Por Alguna razon no sirve el metodo  para eliminar usuario de JpaRepository o CrudRepository, asi tuve que ocupar @Query
	@Transactional
	@Modifying
	@Query("delete from Usuario u WHERE u.usuarioID = ?1")
	public void deleteUsuario(Integer usuarioID);
}
