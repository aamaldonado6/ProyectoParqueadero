/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.edu.utpl.arq.proyecto.persistence.controllers;

import ec.com.edu.utpl.arq.proyecto.persistence.controllers.exceptions.PreexistingEntityException;
import ec.com.edu.utpl.arq.proyecto.persistence.entities.UsuarioEntity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

/**
 *
 * @author utpl
 */
public class UsuariodbJpaController implements Serializable {
    private EntityManagerFactory emf = null;
    public UsuariodbJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public String createUsuario(UsuarioEntity usuariodb) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        List<UsuarioEntity> listQr = new ArrayList<>();
        String nick;
        try {
        em = getEntityManager();
        em.getTransaction().begin();
        em.persist(usuariodb);
        em.getTransaction().commit();
        nick=em.merge(usuariodb).getNick();
        }
        catch (Exception ex) {
                throw new PreexistingEntityException("Usuario " + usuariodb + " ya existe", ex);
        } finally {
            if (em != null) {
                em.close();
            }
        }

        return nick;
    }
    public List findUsuario(String qr) {
        List<UsuarioEntity> listQr = new ArrayList<>();
        try {
            EntityManager em = getEntityManager();
            Query query=em.createQuery(qr);
            listQr = query.getResultList();
        }catch (Exception ex){
            ex.getCause();
        }
        return listQr;
    }

}
