import ec.com.edu.utpl.arq.proyecto.appParqueadero.domain.Empleado;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.domain.Establecimiento;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.domain.Usuario;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.IngresarPersistence;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.ValidarCuentaPersistence;
import ec.com.edu.utpl.arq.proyecto.usecase.ucLogin.IngresarCuentaUC;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class IngresoCuentaTest {
    @Test
    public void probarIngresoUsuario() throws Exception {
        IngresarCuentaUC objIngUC= new IngresarCuentaUC();
        String nick="pepe";
        String password ="pe123";
        String qr ="SELECT u FROM UsuarioEntity u WHERE nick='"+nick+"'";
        //ingreso de cuenta
        //agrupar en una lista el bollean??????????????
        boolean estado =objIngUC.ingresarUsuario(new Usuario(nick,password),new IngresarPersistence(),new ValidarCuentaPersistence(),qr);
        if (estado==true){
            System.out.println("ingreso");
        }else {
            System.out.println("error en las credenciales");
        }
        Assert.assertEquals(true,estado);
    }
    @Test
    public void probarIngresoEmpleado() throws Exception {
        IngresarCuentaUC objIngUC= new IngresarCuentaUC();
        String nick="jjara";
        String password ="jjara123";
        String qr ="SELECT e FROM EmpleadoEntity e WHERE nick='"+nick+"'";
        //ingreso de cuenta
        List estado =objIngUC.ingresarEmpleado(new Empleado(nick,password),new IngresarPersistence(),new ValidarCuentaPersistence(),qr);

        if (estado.get(0).equals(true)){
            System.out.println("ingreso");
        }else {
            System.out.println("error en las credenciales");
        }
        Assert.assertEquals(true,estado.get(0));
    }
    @Test
    public void probarEstablecimiento() throws Exception {
        IngresarCuentaUC objIngUC= new IngresarCuentaUC();
        String nick="xpress";
        String password ="xpress123";
        String qr ="SELECT e FROM EstablecimientoEntity e WHERE nick='"+nick+"'";
        //ingreso de cuenta
        List estado =objIngUC.ingresarEstablecimiento(new Establecimiento(nick,password),new IngresarPersistence(),new ValidarCuentaPersistence(),qr);

        if (estado.get(0).equals(true)){
            System.out.println("ingreso");
        }else {
            System.out.println("error en las credenciales");
        }
        Assert.assertEquals(true,estado.get(0));
    }
}
