package ec.com.edu.utpl.arq.proyecto.appLogin.interfaces.inLogin;

import ec.com.edu.utpl.arq.proyecto.appLogin.domain.Empleado;
import ec.com.edu.utpl.arq.proyecto.appLogin.domain.Establecimiento;
import ec.com.edu.utpl.arq.proyecto.appLogin.domain.Usuario;

public interface InRegistro {
    public String registarUsuario(Usuario rUsuario) throws Exception;
    public void registarEmpleado(Empleado rEmpleado) throws Exception;
    public void registarEstablecimiento(Establecimiento rEstablecimiento) throws Exception;
}
