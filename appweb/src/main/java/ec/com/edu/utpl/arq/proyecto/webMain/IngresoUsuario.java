package ec.com.edu.utpl.arq.proyecto.webMain;

import ec.com.edu.utpl.arq.proyecto.appLogin.domain.Usuario;
import ec.com.edu.utpl.arq.proyecto.persistence.LoginUsuarioPersistence;
import ec.com.edu.utpl.arq.proyecto.usecase.ucLogin.IngresarCuenta;

public class IngresoUsuario {
    public static void main(String[] args) throws Exception {
        IngresarCuenta objIngCU= new IngresarCuenta();
        String nick="pepe";
        String password ="pe123";
        String qr ="SELECT u FROM LoginUsuarioEntity u WHERE nick='"+nick+"'";

        //ingreso de cuenta
        boolean estado =objIngCU.ingresar(new Usuario(nick,password),new LoginUsuarioPersistence(),qr);
        if (estado==true){
            System.out.println("ingreso");
        }else {
            System.out.println("error en las credenciales");
        }
    }
}
