package ec.com.edu.utpl.arq.proyecto.appParqueadero.domain;

import java.util.Date;

public class Pago {
    int idpago;
    Date fecha;
    double valor;
    String medioPago;
    int estado;
    Solicitud idSolicitud;
    Empleado idEmpleado;

    public Pago(int idpago, Date fecha, double valor, String medioPago, int estado, Solicitud idSolicitud, Empleado idEmpleado) {
        this.idpago = idpago;
        this.fecha = fecha;
        this.valor = valor;
        this.medioPago = medioPago;
        this.estado = estado;
        this.idSolicitud = idSolicitud;
        this.idEmpleado = idEmpleado;
    }

    public int getIdpago() {
        return idpago;
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

    public Solicitud getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(Solicitud idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
}
