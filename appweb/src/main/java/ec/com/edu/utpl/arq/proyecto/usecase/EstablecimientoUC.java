package ec.com.edu.utpl.arq.proyecto.usecase;

import ec.com.edu.utpl.arq.proyecto.appParqueadero.interfaces.InConsultar;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.entities.EspacioEntity;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.entities.EstablecimientoEntity;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.entities.EstacionamientoEntity;

import java.util.List;

public class EstablecimientoUC {
    public List<EstablecimientoEntity> consultarEstablecimiento (InConsultar inEst, String qr) throws Exception {
        List<EstablecimientoEntity> listUs =inEst.iConsultar(qr);
        return listUs;
    }
    public List<EstacionamientoEntity> consultarEstacionamiento (InConsultar inEst, String qr) throws Exception {
        List<EstacionamientoEntity> listUs =inEst.iConsultar(qr);
        return listUs;
    }
    public List<EspacioEntity> consultarEspacio (InConsultar inEst, String qr) throws Exception {
        List<EspacioEntity> listUs =inEst.iConsultar(qr);
        return listUs;
    }
}
