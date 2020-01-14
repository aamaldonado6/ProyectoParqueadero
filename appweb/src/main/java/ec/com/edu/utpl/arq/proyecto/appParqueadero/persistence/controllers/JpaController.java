package ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.controllers;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaController {
    private static final String nombreJPA="com.mycompany_appweb_jar_1.0-SNAPSHOTPU";
    private static EntityManagerFactory factory;

    public static EntityManagerFactory getFactory() {
        if (factory==null){
            factory= Persistence.createEntityManagerFactory(nombreJPA);
        }
        return factory;
    }
}
