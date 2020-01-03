package ec.com.edu.utpl.arq.proyecto.persistence.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "espacio", schema = "estacionamiento", catalog = "")
public class EspacioEntity {
    private int idespacio;
    private Byte estado;
    private Integer numEspacio;
    private int idEstacionamiento;

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name = "incrementator", strategy = "increment")
    public int getIdespacio() {
        return idespacio;
    }

    public void setIdespacio(int idespacio) {
        this.idespacio = idespacio;
    }

    @Basic
    @Column(name = "estado")
    public Byte getEstado() {
        return estado;
    }

    public void setEstado(Byte estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "numEspacio")
    public Integer getNumEspacio() {
        return numEspacio;
    }

    public void setNumEspacio(Integer numEspacio) {
        this.numEspacio = numEspacio;
    }

    @Basic
    @Column(name = "idEstacionamiento")
    public int getIdEstacionamiento() {
        return idEstacionamiento;
    }

    public void setIdEstacionamiento(int idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EspacioEntity that = (EspacioEntity) o;

        if (idespacio != that.idespacio) return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;
        if (numEspacio != null ? !numEspacio.equals(that.numEspacio) : that.numEspacio != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idespacio;
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (numEspacio != null ? numEspacio.hashCode() : 0);
        return result;
    }
}
