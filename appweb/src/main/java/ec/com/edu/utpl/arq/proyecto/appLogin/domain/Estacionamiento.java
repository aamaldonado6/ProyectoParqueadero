package ec.com.edu.utpl.arq.proyecto.appLogin.domain;

public class Estacionamiento {
    String identificacion;
    String descripcion;
    Establecimiento establecimiento;
    int idEstacionamiento;
    String latitud;
    String longitud;

    public Estacionamiento(int idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }

    public Estacionamiento(String identificacion, String descripcion, Establecimiento establecimiento, int idEstacionamiento, String latitud, String longitud) {
        this.identificacion = identificacion;
        this.descripcion = descripcion;
        this.establecimiento = establecimiento;
        this.idEstacionamiento = idEstacionamiento;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public int getIdEstacionamiento() {
        return idEstacionamiento;
    }

    public void setIdEstacionamiento(int idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Establecimiento getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(Establecimiento establecimiento) {
        this.establecimiento = establecimiento;
    }
}
