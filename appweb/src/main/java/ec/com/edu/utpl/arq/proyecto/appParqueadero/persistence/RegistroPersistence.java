package ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence;

import ec.com.edu.utpl.arq.proyecto.appParqueadero.domain.Empleado;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.domain.Establecimiento;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.domain.Usuario;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.interfaces.inLogin.InRegistro;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.controllers.JpaController;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.controllers.login.RegistroController;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.entities.EmpleadoEntity;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.entities.EstablecimientoEntity;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.entities.UsuarioEntity;

public class RegistroPersistence implements InRegistro {
    @Override
    public String registarUsuario(Usuario usuario) throws Exception {
        UsuarioEntity entitiUsuario = new UsuarioEntity();
        entitiUsuario.setNombre(usuario.getNombre());
        entitiUsuario.setApellido(usuario.getApellido());
        entitiUsuario.setDireccion(usuario.getDireccion());
        entitiUsuario.setMail(usuario.getMail());
        entitiUsuario.setCedulaUsuario(usuario.getCedula());
        entitiUsuario.setTelefono(usuario.getTelefono());
        entitiUsuario.setNick(usuario.getNick());
        entitiUsuario.setPassword(usuario.getPassword());
        entitiUsuario.setFechaCreacion(usuario.getFechaCreacion());

        RegistroController loginJpaController = new RegistroController(JpaController.getFactory());
        String nick=loginJpaController.createUsuario(entitiUsuario);
        return nick;
    }

    @Override
    public String registarEmpleado(Empleado rEmpleado) throws Exception {
        EmpleadoEntity empleadoEntity = new EmpleadoEntity();
        empleadoEntity.setNombre(rEmpleado.getNombre());
        empleadoEntity.setApellido(rEmpleado.getApellid());
        empleadoEntity.setDireccion(rEmpleado.getDireccion());
        empleadoEntity.setMail(rEmpleado.getMail());
        empleadoEntity.setCedulaEmpleado(rEmpleado.getCedulaEmpleado());
        empleadoEntity.setNick(rEmpleado.getNick());
        empleadoEntity.setPassword(rEmpleado.getPassword());
        empleadoEntity.setFechaCreacion(rEmpleado.getFechaCreacion());
        empleadoEntity.setIdEstacionamiento(rEmpleado.getIdEstacionamiento().getIdEstacionamiento());

        RegistroController loginJpaController = new RegistroController(JpaController.getFactory());
        String nick=loginJpaController.createEmpleado(empleadoEntity);
        return nick;
    }

    @Override
    public String registarEstablecimiento(Establecimiento rEstablecimiento) throws Exception {
        EstablecimientoEntity establecimientoEntity = new EstablecimientoEntity();
        establecimientoEntity.setNombreEstablecimiento(rEstablecimiento.getNombre());
        establecimientoEntity.setDireccion(rEstablecimiento.getDireccion());
        establecimientoEntity.setTelefono(rEstablecimiento.getTelefono());
        establecimientoEntity.setLongitud(rEstablecimiento.getLongi());
        establecimientoEntity.setLatitud(rEstablecimiento.getLat());
        establecimientoEntity.setMail(rEstablecimiento.getMail());
        establecimientoEntity.setNick(rEstablecimiento.getNick());
        establecimientoEntity.setPassword(rEstablecimiento.getPassword());
        establecimientoEntity.setNombreAdministrador(rEstablecimiento.getNombreAdm());
        establecimientoEntity.setApellidoAdministrador(rEstablecimiento.getApellidoAdm());
        establecimientoEntity.setCedulaAdministrador(rEstablecimiento.getCedulaAdm());

        RegistroController loginJpaController = new RegistroController(JpaController.getFactory());
        String nick=loginJpaController.createEstablecimiento(establecimientoEntity);
        return nick;
    }
}
