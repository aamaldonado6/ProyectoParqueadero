package ec.com.edu.utpl.arq.proyecto.appLogin.interfaces.inLogin;

import ec.com.edu.utpl.arq.proyecto.appLogin.domain.Usuario;

import java.util.List;

public interface InLogin {
    public void registarLogUsuario(Usuario lUsuario) throws Exception;
    public List validarLogUsuario(Usuario lUsuario, String qr);
}
