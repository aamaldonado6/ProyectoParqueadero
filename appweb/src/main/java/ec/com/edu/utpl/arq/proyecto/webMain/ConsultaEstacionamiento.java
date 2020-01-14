package ec.com.edu.utpl.arq.proyecto.webMain;

import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.ConsultarPersistence;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.entities.EspacioEntity;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.entities.EstablecimientoEntity;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.entities.EstacionamientoEntity;
import ec.com.edu.utpl.arq.proyecto.usecase.EstablecimientoUC;

import java.util.List;

public class ConsultaEstacionamiento {
    public static void main(String[] args) throws Exception {
        //obtiene el establecimiento
        String qr ="SELECT e FROM EstablecimientoEntity e ";
        EstablecimientoUC objEst = new EstablecimientoUC();
        List<EstablecimientoEntity> listEst= objEst.consultarEstablecimiento(new ConsultarPersistence(),qr);
        for (EstablecimientoEntity e: listEst){
            System.out.println("nombre:"+e.getNombreEstablecimiento()+"\nId:"+e.getIdestablecimiento());
        }


        //obtiene el estacionamiento segun el establecimiento
        String establecimiento="Garage";
        qr="SELECT e2 From EstablecimientoEntity e INNER JOIN EstacionamientoEntity e2 ON e.idestablecimiento=e2.idEstablecimiento WHERE e.nombre='"+establecimiento+"'";
        List<EstacionamientoEntity> listEstcio= objEst.consultarEstacionamiento(new ConsultarPersistence(),qr);
        for (EstacionamientoEntity e: listEstcio){
            System.out.println(e.getIdentificacion());
        }


        //obtiene los espacios segun el estacionamiento
        String estacionamiento="E1";
        qr="SELECT e2 From EstacionamientoEntity e INNER JOIN EspacioEntity e2 ON e.idestacionamiento=e2.idEstacionamiento WHERE e.identificacion='"+estacionamiento+"'";
        List<EspacioEntity> listEspacio= objEst.consultarEspacio(new ConsultarPersistence(),qr);
        System.out.println(listEspacio);
        for (EspacioEntity e: listEspacio){
            System.out.println("Estacio numero:"+e.getNumEspacio()+" Estado:"+e.getEstado());
        }


    }


}
//SELECT e2.identificacion,e3.numEspacio, e3.estado from establecimiento e INNER JOIN estacionamiento e2 INNER JOIN espacio e3 on 0=e2.idEstablecimiento and e2.idestacionamiento=e3.idEstacionamiento where e.idestablecimiento=0
//"SELECT c FROM Curso c INNER JOIN Profesor p ON c.id_profesor=p.idprofesor where p.nombre='"+nombreProfesor+"'"