package com.ues.occ.proyeccionsocial.app.dao;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.ues.occ.proyeccionsocial.app.dao.RolUsuarioDao;
import com.ues.occ.proyeccionsocial.app.entities.RolUsuario;

@RunWith(SpringRunner.class)
@DataJpaTest
public class RolUsuarioDaoIntegrationtTest {

    @Autowired
    private TestEntityManager entityManager;
 
    @Autowired
    private RolUsuarioDao rolUsuarioDao;
 
    @Test
    public void whenFindByDescripcion() {
    	
    	RolUsuario admin = new RolUsuario("ADMIN");
    	entityManager.persist(admin);
    	entityManager.flush();
    	
    	//when
    	RolUsuario found =  (RolUsuario) rolUsuarioDao.findByDescripcion(admin.getDescripcion());
    	
    	//then
    	assertThat(found.getDescripcion()).isEqualTo(admin.getDescripcion());
    }
}
