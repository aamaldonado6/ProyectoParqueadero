package ec.com.edu.utpl.arq.proyecto.appParqueadero.interfaces;

import ec.com.edu.utpl.arq.proyecto.appParqueadero.domain.Empleado;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.domain.Establecimiento;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.domain.Usuario;

public interface InRegistro {
    public String registarUsuario(Usuario rUsuario) throws Exception;
    public String registarEmpleado(Empleado rEmpleado) throws Exception;
    public String registarEstablecimiento(Establecimiento rEstablecimiento) throws Exception;
}
