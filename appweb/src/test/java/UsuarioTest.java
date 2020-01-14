import ec.com.edu.utpl.arq.proyecto.appParqueadero.domain.Establecimiento;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.IngresarPersistence;
import ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.ValidarCuentaPersistence;
import ec.com.edu.utpl.arq.proyecto.usecase.ucLogin.IngresarCuentaUC;
import ec.com.edu.utpl.arq.proyecto.usecase.ucLogin.RegistrarCuentaUC;
import ec.com.edu.utpl.arq.proyecto.usecase.ucUsuario.RegistrarEspacioUC;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class UsuarioTest {
    @Test
    public void probarRegistroEspacio() throws Exception {
        RegistrarEspacioUC objRegistroE = new RegistrarEspacioUC();
        /////////////////
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
