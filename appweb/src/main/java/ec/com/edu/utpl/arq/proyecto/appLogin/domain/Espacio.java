package ec.com.edu.utpl.arq.proyecto.appLogin.domain;

public class Espacio {
    int idespacio;
    int estado;
    int numEspacio;
    Estacionamiento idEstacionamiento;

    public Espacio(int idespacio, int estado, int numEspacio, Estacionamiento idEstacionamiento) {
        this.idespacio = idespacio;
        this.estado = estado;
        this.numEspacio = numEspacio;
        this.idEstacionamiento = idEstacionamiento;
    }

    public Espacio(int idespacio) {
        this.idespacio = idespacio;
    }

    public int getIdespacio() {
        return idespacio;
    }

    public void setIdespacio(int idespacio) {
        this.idespacio = idespacio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getNumEspacio() {
        return numEspacio;
    }

    public void setNumEspacio(int numEspacio) {
        this.numEspacio = numEspacio;
    }

    public Estacionamiento getIdEstacionamiento() {
        return idEstacionamiento;
    }

    public void setIdEstacionamiento(Estacionamiento idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }
}
