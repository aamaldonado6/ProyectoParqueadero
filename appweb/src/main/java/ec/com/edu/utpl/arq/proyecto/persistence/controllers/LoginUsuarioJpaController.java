package ec.com.edu.utpl.arq.proyecto.persistence.controllers;

import ec.com.edu.utpl.arq.proyecto.appLogin.domain.Usuario;
import ec.com.edu.utpl.arq.proyecto.persistence.controllers.exceptions.PreexistingEntityException;
import ec.com.edu.utpl.arq.proyecto.persistence.entities.UsuarioEntity;
import ec.com.edu.utpl.arq.proyecto.persistence.entities.sssssss;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class LoginUsuarioJpaController {
    private EntityManagerFactory emf = null;
    public LoginUsuarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
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

    public void crearLoginUs(Usuario logUsuariodb) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(logUsuariodb);
            em.getTransaction().commit();
        }
        catch (Exception ex) {
            throw new PreexistingEntityException("!!!!!Usuario " + logUsuariodb.getIdUsuario() + " ya existe", ex);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
