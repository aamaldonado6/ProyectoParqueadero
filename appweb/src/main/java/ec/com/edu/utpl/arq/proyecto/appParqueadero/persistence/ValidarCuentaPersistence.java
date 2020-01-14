package ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence;

import ec.com.edu.utpl.arq.proyecto.appParqueadero.interfaces.InValidar;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.controllers.JpaController;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.controllers.login.BusquedaController;

import java.util.List;

public class ValidarCuentaPersistence implements InValidar {
    @Override
    public List validarCuenta(String qr) {
        BusquedaController objInContr = new BusquedaController(JpaController.getFactory());
        List listaUs=objInContr.busqueda(qr);
        return listaUs;
    }
}
