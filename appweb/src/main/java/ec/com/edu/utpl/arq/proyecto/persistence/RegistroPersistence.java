package ec.com.edu.utpl.arq.proyecto.persistence;

import ec.com.edu.utpl.arq.proyecto.appLogin.domain.Empleado;
import ec.com.edu.utpl.arq.proyecto.appLogin.domain.Establecimiento;
import ec.com.edu.utpl.arq.proyecto.appLogin.domain.Usuario;
import ec.com.edu.utpl.arq.proyecto.appLogin.interfaces.inLogin.InRegistro;
import ec.com.edu.utpl.arq.proyecto.persistence.controllers.JpaController;
import ec.com.edu.utpl.arq.proyecto.persistence.controllers.UsuariodbJpaController;
import ec.com.edu.utpl.arq.proyecto.persistence.entities.UsuarioEntity;

public class RegistroPersistence implements InRegistro {
    @Override
    public String registarUsuario(Usuario usuario) throws Exception {
        UsuarioEntity entitiUsuario = new UsuarioEntity();
        entitiUsuario.setNombre(usuario.getNombre());
        entitiUsuario.setDireccion(usuario.getDireccion());
        entitiUsuario.setMail(usuario.getMail());
        entitiUsuario.setTelefono(usuario.getTelefono());
        entitiUsuario.setNick(usuario.getNick());
        entitiUsuario.setPassword(usuario.getPassword());
        entitiUsuario.setFechaCreacion(usuario.getFechaCreacion());
        UsuariodbJpaController objUsuarioContr = new UsuariodbJpaController(JpaController.getFactory());
        String nick=objUsuarioContr.createUsuario(entitiUsuario);
        return nick;
    }

    @Override
    public void registarEmpleado(Empleado rEmpleado) throws Exception {

    }

    @Override
    public void registarEstablecimiento(Establecimiento rEstablecimiento) throws Exception {

    }
}
