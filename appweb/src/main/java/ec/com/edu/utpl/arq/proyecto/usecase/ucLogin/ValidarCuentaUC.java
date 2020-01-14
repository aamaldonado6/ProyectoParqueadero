package ec.com.edu.utpl.arq.proyecto.usecase.ucLogin;

import ec.com.edu.utpl.arq.proyecto.appParqueadero.interfaces.inLogin.InValidar;

import java.util.List;

public class ValidarCuentaUC {

    public List validarNick(InValidar iVal, String nick){
        String qr="select e.nick, a.nick, est.nick from EmpleadoEntity e , UsuarioEntity a, EstablecimientoEntity est where e.nick='"+nick+"' or a.nick='"+nick+"' or est.nick='"+nick+"' ";
        List listUs =iVal.validarCuenta(qr);
        return listUs;
    }
    public List validarCuenta(InValidar iVal, String qr){
        List listUs =iVal.validarCuenta(qr);
        return listUs;
    }
}
