import ec.com.edu.utpl.arq.proyecto.appParqueadero.domain.Empleado;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.domain.Establecimiento;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.domain.Estacionamiento;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.domain.Usuario;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.RegistroPersistence;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.ValidarCuentaPersistence;
import ec.com.edu.utpl.arq.proyecto.usecase.ucLogin.IngresarCuentaUC;
import ec.com.edu.utpl.arq.proyecto.usecase.ucLogin.RegistrarCuentaUC;
import ec.com.edu.utpl.arq.proyecto.usecase.ucLogin.ValidarCuentaUC;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Date;
import java.util.List;

public class CrearCuentaTest {
    @Test
    public void probarCrearCuentaUsuario() throws Exception {
        java.util.Date d = new java.util.Date();
        Date fecha = new java.sql.Date(d.getTime());
        ValidarCuentaUC objValCU = new ValidarCuentaUC();
        RegistrarCuentaUC objRegCU = new RegistrarCuentaUC();

        String nombre ="Pedro";
        String apellido="Rio";
        String direccion ="cuenca";
        String mail ="pedro@gmail.com";
        String cedula="11023141";
        String telefono = "091982873";
        String nick ="pepe";
        String password="pe123";
        String nickCuenta="Ya existe la cuenta";
        //verifica si existe la cuenta
        List listUs= objValCU.validarNick(new ValidarCuentaPersistence(),nick);
        if (listUs.isEmpty()){
            //si no existe, crea una cuenta nueva
            nickCuenta =objRegCU.registrarUsuario(new Usuario(nombre,apellido,direccion,mail,cedula,telefono,nick,password,fecha), new RegistroPersistence());
        }else {
            System.out.println(nickCuenta);
        }
        Assert.assertEquals(nick,nickCuenta);
    }
    @Test
    public void probarCrearCuentaEmpleado() throws Exception {
        java.util.Date d = new java.util.Date();
        Date fecha = new java.sql.Date(d.getTime());
        ValidarCuentaUC objValCU = new ValidarCuentaUC();
        RegistrarCuentaUC objRegCU = new RegistrarCuentaUC();

        String nombre ="Juan";
        String apellido="Pedro";
        String direccion ="Loja";
        String mail ="pedrojs@gmail.com";
        String cedula="11013241";
        String nick ="jupe";
        String password="jupe123";
        int idEstacionamiento=0;
        String nickCuenta="Ya existe la cuenta";

        //verifica si existe la cuenta
        List listUs= objValCU.validarNick(new ValidarCuentaPersistence(),nick);
        if (listUs.isEmpty()){
            //si no existe, crea una cuenta nueva
            nickCuenta =objRegCU.resgistrarEmpleado(new Empleado(nombre,apellido,direccion,mail,cedula,nick,password,fecha,new Estacionamiento(idEstacionamiento)),new RegistroPersistence());
        }else {
            System.out.println(nickCuenta);
        }
        Assert.assertEquals(nick,nickCuenta);
    }
    @Test
    public void probarCrearCuentaEstablecimiento() throws Exception {
        ValidarCuentaUC objValCU = new ValidarCuentaUC();
        RegistrarCuentaUC objRegCU = new RegistrarCuentaUC();

        String nombreEstablecimiento ="Estacionamientos Xpress";
        String direccion ="cuenca";
        String telefono = "091982873";
        String longitud="-79.202921";
        String latitud="-3.995292";
        String mail ="xpress@gmail.com";
        String nick ="xpress";
        String password="xpress123";
        String nombreAdministrador="Ivan";
        String apellidoAdministrador="Ocampo";
        String cedulaAdministrador="11087262";
        String nickCuenta="Ya existe la cuenta";

        //verifica si existe la cuenta
        List listUs= objValCU.validarNick(new ValidarCuentaPersistence(),nick);
        if (listUs.isEmpty()){
            //si no existe, crea una cuenta nueva
            nickCuenta =objRegCU.resgistrarEstablecimiento(new Establecimiento(nombreEstablecimiento,direccion,telefono,longitud,latitud,mail,nick,password,nombreAdministrador,apellidoAdministrador,cedulaAdministrador),new RegistroPersistence());
        }else {
            System.out.println(nickCuenta);
        }
        Assert.assertEquals(nick,nickCuenta);
    }
}
