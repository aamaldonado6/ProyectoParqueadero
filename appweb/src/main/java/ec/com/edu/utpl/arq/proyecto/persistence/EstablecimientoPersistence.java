package ec.com.edu.utpl.arq.proyecto.persistence;

import ec.com.edu.utpl.arq.proyecto.appLogin.interfaces.inEstablecimiento.InEstablecimiento;
import ec.com.edu.utpl.arq.proyecto.persistence.controllers.JpaController;
import ec.com.edu.utpl.arq.proyecto.persistence.controllers.LoginUsuarioJpaController;
import ec.com.edu.utpl.arq.proyecto.persistence.entities.EstablecimientoEntity;

import java.util.List;

public class EstablecimientoPersistence implements InEstablecimiento {
    @Override
    public List iConsultarEstablecimiento(String qr) {
        LoginUsuarioJpaController objUsuContr = new LoginUsuarioJpaController(JpaController.getFactory());
        List<EstablecimientoEntity> listaEst=objUsuContr.findUsuario(qr);
        return listaEst;
    }
}
