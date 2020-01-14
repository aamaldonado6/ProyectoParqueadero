package ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.domain.Empleado;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.domain.Establecimiento;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.domain.Usuario;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.interfaces.inLogin.InIngreso;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.controllers.JpaController;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.controllers.login.BusquedaController;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.entities.EmpleadoEntity;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.entities.EstablecimientoEntity;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.entities.SolicitudEntity;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.entities.UsuarioEntity;

import java.util.ArrayList;
import java.util.List;

public class IngresarPersistence implements InIngreso {

    @Override
    public List ingresoUsuario(List listUsuario) throws Exception {
        BusquedaController ingresoController = new BusquedaController(JpaController.getFactory());
        List<UsuarioEntity> listUs = listUsuario;
        String qr="SELECT s FROM SolicitudEntity s WHERE s.idUsuario="+listUs.get(0).getIdUsuario()+"";
        List listSolicitud = ingresoController.busqueda(qr);
        return listSolicitud;
    }

    @Override
    public List ingresoEmpleado(List listEmpleado, Empleado empleado) throws Exception {
        boolean estado=false;
        List<EmpleadoEntity> listEmp=listEmpleado;
        List ingreso = new ArrayList();
        if (listEmp.isEmpty()){
            ingreso.add(estado);
        }else if (listEmp.get(0).getPassword().equals(empleado.getPassword())){
            estado=true;
            ingreso.add(estado);
            ingreso.add(listEmp.get(0).getNombre());
            //registroRol(usuario,listUs.get(0).getId(),iRo);
        }
        return ingreso;
    }

    @Override
    public List ingresoEstablecimiento(List lisEstablecimiento,Establecimiento establecimiento) throws Exception {
        boolean estado=false;
        List<EstablecimientoEntity> listEst=lisEstablecimiento;
        List ingreso = new ArrayList();
        if (listEst.isEmpty()){
            ingreso.add(estado);
        }else if (listEst.get(0).getPassword().equals(establecimiento.getPassword())){
            estado=true;
            ingreso.add(estado);
            ingreso.add(listEst.get(0).getNick());
            //registroRol(usuario,listUs.get(0).getId(),iRo);
        }
        return ingreso;
    }

}
