package ec.com.edu.utpl.arq.proyecto.appParqueadero.domain;

public class Tarifa {
    int idtarifa;
    String numero;
    String descripcion;
    String cantidadTiempo;
    double valor;
    Estacionamiento idEstacionamiento;

    public Tarifa(int idtarifa, String numero, String descripcion, String cantidadTiempo, double valor, Estacionamiento idEstacionamiento) {
        this.idtarifa = idtarifa;
        this.numero = numero;
        this.descripcion = descripcion;
        this.cantidadTiempo = cantidadTiempo;
        this.valor = valor;
        this.idEstacionamiento = idEstacionamiento;
    }

    public Tarifa(int idtarifa) {
        this.idtarifa = idtarifa;
    }

    public int getIdtarifa() {
        return idtarifa;
    }

    public void setIdtarifa(int idtarifa) {
        this.idtarifa = idtarifa;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCantidadTiempo() {
        return cantidadTiempo;
    }

    public void setCantidadTiempo(String cantidadTiempo) {
        this.cantidadTiempo = cantidadTiempo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Estacionamiento getIdEstacionamiento() {
        return idEstacionamiento;
    }

    public void setIdEstacionamiento(Estacionamiento idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }
}
