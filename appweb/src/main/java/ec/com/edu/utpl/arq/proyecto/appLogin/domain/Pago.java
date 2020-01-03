package ec.com.edu.utpl.arq.proyecto.appLogin.domain;

import java.util.Date;

public class Pago {
    int idpago;
    Date fecha;
    double valor;
    String medioPago;
    int estado;
    int idSolicitud;
    int idEmpleado;

    public Pago(int idpago, Date fecha, double valor, String medioPago, int estado, int idSolicitud, int idEmpleado) {
        this.idpago = idpago;
        this.fecha = fecha;
        this.valor = valor;
        this.medioPago = medioPago;
        this.estado = estado;
        this.idSolicitud = idSolicitud;
        this.idEmpleado = idEmpleado;
    }


    public Pago(int idpago) {
        this.idpago = idpago;
    }

    public int getIdpago() {
        return idpago;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setIdpago(int idpago) {
        this.idpago = idpago;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }
}
