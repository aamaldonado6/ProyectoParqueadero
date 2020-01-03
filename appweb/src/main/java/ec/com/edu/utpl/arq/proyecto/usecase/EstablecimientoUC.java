package ec.com.edu.utpl.arq.proyecto.usecase;

import ec.com.edu.utpl.arq.proyecto.appLogin.interfaces.inEstablecimiento.InEstablecimiento;
import ec.com.edu.utpl.arq.proyecto.persistence.entities.EspacioEntity;
import ec.com.edu.utpl.arq.proyecto.persistence.entities.EstablecimientoEntity;
import ec.com.edu.utpl.arq.proyecto.persistence.entities.EstacionamientoEntity;

import java.util.List;

public class EstablecimientoUC {
    public List<EstablecimientoEntity> consultarEstablecimiento (InEstablecimiento inEst, String qr){
        List<EstablecimientoEntity> listUs =inEst.iConsultarEstablecimiento(qr);
        return listUs;
    }
    public List<EstacionamientoEntity> consultarEstacionamiento (InEstablecimiento inEst, String qr){
        List<EstacionamientoEntity> listUs =inEst.iConsultarEstablecimiento(qr);
        return listUs;
    }
    public List<EspacioEntity> consultarEspacio (InEstablecimiento inEst, String qr){
        List<EspacioEntity> listUs =inEst.iConsultarEstablecimiento(qr);
        return listUs;
    }
}
