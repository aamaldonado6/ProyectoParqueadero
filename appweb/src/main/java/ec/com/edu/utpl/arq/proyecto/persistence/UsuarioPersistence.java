/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.edu.utpl.arq.proyecto.persistence;

import ec.com.edu.utpl.arq.proyecto.appLogin.domain.Empleado;
import ec.com.edu.utpl.arq.proyecto.appLogin.domain.Establecimiento;
import ec.com.edu.utpl.arq.proyecto.appLogin.domain.Usuario;
import ec.com.edu.utpl.arq.proyecto.appLogin.interfaces.inLogin.InRegistro;
import ec.com.edu.utpl.arq.proyecto.persistence.controllers.JpaController;
import ec.com.edu.utpl.arq.proyecto.persistence.controllers.UsuariodbJpaController;
import ec.com.edu.utpl.arq.proyecto.persistence.entities.UsuarioEntity;

/**
 *
 * @author utpl
 */
public class UsuarioPersistence implements InRegistro {

    @Override
    public String registarUsuario(Usuario usuario)throws Exception {
        UsuarioEntity entitiUsuario = new UsuarioEntity();
        entitiUsuario.setNombre(usuario.getNombre());
        entitiUsuario.setDireccion(usuario.getDireccion());
        entitiUsuario.setMail(usuario.getMail());
        entitiUsuario.setTelefono(usuario.getTelefono());
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
