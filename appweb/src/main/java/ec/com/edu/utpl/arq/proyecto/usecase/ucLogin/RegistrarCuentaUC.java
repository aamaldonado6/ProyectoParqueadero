/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.edu.utpl.arq.proyecto.usecase.ucLogin;


import ec.com.edu.utpl.arq.proyecto.appParqueadero.domain.Empleado;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.domain.Establecimiento;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.domain.Usuario;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.interfaces.inLogin.InIngreso;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.interfaces.inLogin.InRegistro;

/**
 *
 * @author utpl
 */
public class RegistrarCuentaUC {

    /*public boolean validar (LoginUsuario usuario, InLoginUsuario iUs){
        boolean estado = false;
        String qr ="SELECT u FROM LoginUsuariodb u WHERE nick='"+usuario.getNick()+"'";
        List<LoginUsuariodb> listUs =iUs.validarLogUsuario(usuario,qr);
        if (listUs.isEmpty()){
            estado=true;
        }
        return estado;
    }*/
    
    public String registrarUsuario(Usuario usuario, InRegistro iReg) throws Exception {
        String nick =iReg.registarUsuario(usuario);
        return nick;
    }
    public String resgistrarEmpleado(Empleado empleado, InRegistro iReg) throws Exception {
        String nick=iReg.registarEmpleado(empleado);
        return nick;
    }
    public String resgistrarEstablecimiento(Establecimiento establecimiento, InRegistro iReg) throws Exception {
        String nick =iReg.registarEstablecimiento(establecimiento);
        return nick;
    }



    
}
