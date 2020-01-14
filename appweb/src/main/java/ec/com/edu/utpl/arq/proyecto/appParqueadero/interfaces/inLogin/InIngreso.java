package ec.com.edu.utpl.arq.proyecto.appParqueadero.interfaces.inLogin;

import ec.com.edu.utpl.arq.proyecto.appParqueadero.domain.Empleado;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.domain.Establecimiento;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.domain.Usuario;

import java.util.List;

public interface InIngreso {
    public List ingresoUsuario(List iUsuario) throws Exception;
    public List ingresoEmpleado(List iEmpleado,Empleado empleado) throws Exception;
    public List ingresoEstablecimiento(List lisEstablecimiento,Establecimiento establecimiento) throws Exception;

}
