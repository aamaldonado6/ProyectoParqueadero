package ec.com.edu.utpl.arq.proyecto.appParqueadero.domain;

public class Solicitud {
    int idsolicitud;
    Espacio idEspacio;
    Usuario idUsuario;
    String horaEntrada;
    String horaSalida;
    Empleado idEmpleado;

    public Solicitud(int idsolicitud, Espacio idEspacio, Usuario idUsuario, String horaEntrada, String horaSalida, Empleado idEmpleado) {
        this.idsolicitud = idsolicitud;
        this.idEspacio = idEspacio;
        this.idUsuario = idUsuario;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.idEmpleado = idEmpleado;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Solicitud(int idsolicitud) {
        this.idsolicitud = idsolicitud;
    }

    public int getIdsolicitud() {
        return idsolicitud;
    }

    public void setIdsolicitud(int idsolicitud) {
        this.idsolicitud = idsolicitud;
    }

    public Espacio getIdEspacio() {
        return idEspacio;
    }

    public void setIdEspacio(Espacio idEspacio) {
        this.idEspacio = idEspacio;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }
}
