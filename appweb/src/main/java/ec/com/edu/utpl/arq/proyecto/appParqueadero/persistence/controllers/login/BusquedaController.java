package ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.controllers.login;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class BusquedaController {
    private EntityManagerFactory emf = null;
    public BusquedaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public List busqueda(String qr) {
        List listQr = new ArrayList<>();
        try {
            EntityManager em = getEntityManager();
            Query query=em.createQuery(qr);
            listQr = query.getResultList();
        }catch (Exception ex){
            System.out.println(ex.getCause());
        }
        return listQr;
    }

}
