package ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.controllers.login;

import ec.com.edu.utpl.arq.proyecto.appParqueadero.domain.Usuario;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.controllers.exceptions.PreexistingEntityException;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.entities.EmpleadoEntity;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.entities.EstablecimientoEntity;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.entities.UsuarioEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class RegistroController {
    private EntityManagerFactory emf = null;
    public RegistroController(EntityManagerFactory emf) {
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
    public String createEmpleado(EmpleadoEntity empleadodb) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        List<EmpleadoEntity> listQr = new ArrayList<>();
        String nick;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(empleadodb);
            em.getTransaction().commit();
            nick=em.merge(empleadodb).getNick();
        }
        catch (Exception ex) {
            throw new PreexistingEntityException("empleado " + empleadodb + " ya existe", ex);
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return nick;
    }
    public String createEstablecimiento(EstablecimientoEntity establecimientodb) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        List<EstablecimientoEntity> listQr = new ArrayList<>();
        String nick;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(establecimientodb);
            em.getTransaction().commit();
            nick=em.merge(establecimientodb).getNick();
        }
        catch (Exception ex) {
            throw new PreexistingEntityException("establecimiento " + establecimientodb + " ya existe", ex);
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return nick;
    }


}
