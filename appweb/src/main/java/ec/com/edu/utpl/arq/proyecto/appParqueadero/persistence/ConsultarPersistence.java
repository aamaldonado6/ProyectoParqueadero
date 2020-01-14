package ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence;

import ec.com.edu.utpl.arq.proyecto.appParqueadero.interfaces.InConsultar;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.controllers.JpaController;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.controllers.login.BusquedaController;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.entities.EstablecimientoEntity;

import java.util.List;

public class ConsultarPersistence implements InConsultar {
    @Override
    public List iConsultar(String qr) {
        BusquedaController objInContr = new BusquedaController(JpaController.getFactory());
        List<EstablecimientoEntity> listaEst=objInContr.busqueda(qr);
        return listaEst;
    }

}
