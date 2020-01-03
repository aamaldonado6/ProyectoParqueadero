/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.edu.utpl.arq.proyecto.usecase.ucLogin;


import ec.com.edu.utpl.arq.proyecto.appLogin.domain.Usuario;
import ec.com.edu.utpl.arq.proyecto.appLogin.interfaces.inLogin.InLogin;
import ec.com.edu.utpl.arq.proyecto.appLogin.interfaces.inLogin.InRegistro;

/**
 *
 * @author utpl
 */
public class RegistrarCuenta {

    /*public boolean validar (LoginUsuario usuario, InLoginUsuario iUs){
        boolean estado = false;
        String qr ="SELECT u FROM LoginUsuariodb u WHERE nick='"+usuario.getNick()+"'";
        List<LoginUsuariodb> listUs =iUs.validarLogUsuario(usuario,qr);
        if (listUs.isEmpty()){
            estado=true;
        }
        return estado;
    }*/
    public void resgistrarLogin(Usuario lgUsuario, InLogin iLogUs) throws Exception {
        iLogUs.registarLogUsuario(lgUsuario);
    }
    
    public int resgistrarCuenta(Usuario usuario, InRegistro iReg) throws Exception {
        iReg.registarUsuario(usuario);
        return 1;
    }



    
}
