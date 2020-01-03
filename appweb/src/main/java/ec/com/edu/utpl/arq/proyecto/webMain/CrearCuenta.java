package ec.com.edu.utpl.arq.proyecto.webMain;

import ec.com.edu.utpl.arq.proyecto.appLogin.domain.Usuario;
import ec.com.edu.utpl.arq.proyecto.persistence.LoginUsuarioPersistence;
import ec.com.edu.utpl.arq.proyecto.persistence.RegistroPersistence;
import ec.com.edu.utpl.arq.proyecto.persistence.UsuarioPersistence;
import ec.com.edu.utpl.arq.proyecto.usecase.ucLogin.IngresarCuenta;
import ec.com.edu.utpl.arq.proyecto.usecase.ucLogin.RegistrarCuenta;

import java.sql.Date;
import java.text.SimpleDateFormat;

import java.util.List;

public class CrearCuenta {
    public static void main(String[] args) throws Exception {
        java.util.Date d = new java.util.Date();
        Date fecha = new java.sql.Date(d.getTime());

        IngresarCuenta objIngCU= new IngresarCuenta();
        RegistrarCuenta objRegCU = new RegistrarCuenta();

        String nombre ="pedro";
        String apellido="Rio";
        String direccion ="cuenca";
        String mail ="pedro@gmail.com";
        String telefono = "091982873";
        String nick ="pepe";
        String password="pe123";

        String qr ="SELECT u.nombre FROM UsuarioEntity u WHERE nick='"+nick+"'";

        //verifica si existe la cuenta
        List<Usuario> listUs= objIngCU.validar(new Usuario(nick), new LoginUsuarioPersistence(),qr);
        if (listUs.isEmpty()){
            //si no existe, crea una cuenta nueva
            int idCuenta =objRegCU.resgistrarCuenta(new Usuario(nombre,apellido,direccion,mail,telefono,nick,password,fecha), new RegistroPersistence());
            System.out.println("iddddd+++=="+idCuenta);
        }else {
            System.out.println("Ya esiste la cuenta");
        }

    }
}
