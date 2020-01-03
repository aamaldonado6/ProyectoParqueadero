package ec.com.edu.utpl.arq.proyecto.usecase.ucLogin;

import ec.com.edu.utpl.arq.proyecto.appLogin.domain.Usuario;
import ec.com.edu.utpl.arq.proyecto.appLogin.interfaces.inLogin.InLogin;

import java.util.List;

public class IngresarCuenta {
    public boolean ingresar (Usuario usuario, InLogin iUs, String qr) throws Exception {
        boolean estado=false;
        List<Usuario> listUs =validar(usuario, iUs,qr);
        if (listUs.isEmpty()){
            estado=false;
        }else if (listUs.get(0).getPassword().equals(usuario.getPassword())){
            estado=true;
            //registroRol(usuario,listUs.get(0).getId(),iRo);
        }
        return estado;
    }

    public List<Usuario> validar (Usuario usuario, InLogin iUs, String qr){
        List<Usuario> listUs =iUs.validarLogUsuario(usuario,qr);
        return listUs;
    }
}
