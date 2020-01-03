package ec.com.edu.utpl.arq.proyecto.persistence;

import ec.com.edu.utpl.arq.proyecto.appLogin.domain.Usuario;
import ec.com.edu.utpl.arq.proyecto.appLogin.interfaces.inLogin.InLogin;
import ec.com.edu.utpl.arq.proyecto.persistence.controllers.JpaController;
import ec.com.edu.utpl.arq.proyecto.persistence.controllers.LoginUsuarioJpaController;
import ec.com.edu.utpl.arq.proyecto.persistence.entities.sssssss;

import java.util.List;

public class LoginUsuarioPersistence implements InLogin {

    @Override
    public void registarLogUsuario(Usuario lUsuario) throws Exception {
        Usuario entitiLoginUs = new Usuario();

        entitiLoginUs.setNick(lUsuario.getNick());
        entitiLoginUs.setFechaCreacion(lUsuario.getFechaCreacion());
        entitiLoginUs.setIdUsuario(lUsuario.getIdUsuario());
        entitiLoginUs.setPassword(lUsuario.getPassword());
        LoginUsuarioJpaController objLogUsuarioContr = new LoginUsuarioJpaController(JpaController.getFactory());
        objLogUsuarioContr.crearLoginUs(entitiLoginUs);
    }

    @Override
    public List validarLogUsuario(Usuario lUsuario, String qr) {
        sssssss entitiUsuario = new sssssss();
        LoginUsuarioJpaController objUsuContr = new LoginUsuarioJpaController(JpaController.getFactory());
        entitiUsuario.setNick(lUsuario.getNick());
        List<sssssss> listaUs=objUsuContr.findUsuario(qr);
        return listaUs;
    }
}
