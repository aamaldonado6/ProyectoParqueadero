package ec.com.edu.utpl.arq.proyecto.usecase.ucLogin;

import ec.com.edu.utpl.arq.proyecto.appParqueadero.domain.Empleado;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.domain.Establecimiento;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.domain.Usuario;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.interfaces.inLogin.InIngreso;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.interfaces.inLogin.InValidar;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.entities.EmpleadoEntity;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.entities.SolicitudEntity;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.entities.UsuarioEntity;

import java.util.ArrayList;
import java.util.List;

public class IngresarCuentaUC {
    public boolean ingresarUsuario (Usuario usuario, InIngreso iUs, InValidar iVal, String qr) throws Exception {
        boolean estado=false;
        ValidarCuentaUC objValCU = new ValidarCuentaUC();
        List<UsuarioEntity> listUs = objValCU.validarCuenta(iVal,qr);
        if (listUs.isEmpty()){
            estado=false;
        }else if (listUs.get(0).getPassword().equals(usuario.getPassword())){
            List<SolicitudEntity> listSolicitud =iUs.ingresoUsuario(listUs);
            //extraer todas las solicitudes que ha hecho el usuario
            System.out.println(listSolicitud.get(0).getHoraEntrada());
            estado=true;
            //registroRol(usuario,listUs.get(0).getId(),iRo);
        }
        return estado;
    }
    public List ingresarEmpleado (Empleado empleado, InIngreso iUs, InValidar iVal, String qr) throws Exception {
        ValidarCuentaUC objValCU = new ValidarCuentaUC();
        List listEmp = objValCU.validarCuenta(iVal,qr);
        return iUs.ingresoEmpleado(listEmp,empleado);
    }
    public List ingresarEstablecimiento (Establecimiento establecimiento, InIngreso iUs, InValidar iVal, String qr) throws Exception {

        ValidarCuentaUC objValCU = new ValidarCuentaUC();
        List listEst = objValCU.validarCuenta(iVal,qr);
        return iUs.ingresoEstablecimiento(listEst,establecimiento);
    }


}
