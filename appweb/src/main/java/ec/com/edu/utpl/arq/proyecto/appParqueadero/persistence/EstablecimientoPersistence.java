package ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence;

import ec.com.edu.utpl.arq.proyecto.appParqueadero.interfaces.inEstablecimiento.InEstablecimiento;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.controllers.JpaController;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.controllers.login.BusquedaController;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.entities.EstablecimientoEntity;

import java.util.List;

public class EstablecimientoPersistence implements InEstablecimiento {
    @Override
    public List iConsultarEstablecimiento(String qr) {
        BusquedaController objInContr = new BusquedaController(JpaController.getFactory());
        List<EstablecimientoEntity> listaEst=objInContr.busqueda(qr);
        return listaEst;
    }
}
