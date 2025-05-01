/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppWEb.repository;

import AppWEb.model.entity.Usuario;
import AppWEb.repository.persistence.CrudRepository;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author diana-florian
 */
@Stateless
public class UsuarioRepository extends CrudRepository<Usuario>{

    @PersistenceContext(unitName = "CrudjsfPU")
    private EntityManager em;
    
    public UsuarioRepository() { //constructor vacio para instanciarlo, me lo recomendo chatgpt
        super(Usuario.class);
    }
    
@Override
protected EntityManager getEntityManager(){
return em;   
}


//public List <Usuario> findAllNickName(){
   // Query query = em.createQuery("SELECT u from Usuario u Where u.nickName like '%W%'");
   // return query.getResultList();
//}

}
