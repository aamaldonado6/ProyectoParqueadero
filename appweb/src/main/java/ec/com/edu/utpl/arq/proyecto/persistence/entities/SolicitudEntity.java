package ec.com.edu.utpl.arq.proyecto.persistence.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "solicitud", schema = "estacionamiento", catalog = "")
public class SolicitudEntity {
    private int idsolicitudes;
    private String horaEntrada;
    private String horaSalida;
    private int idEspacio;
    private int idUsuario;

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name = "incrementator", strategy = "increment")
    public int getIdsolicitudes() {
        return idsolicitudes;
    }

    public void setIdsolicitudes(int idsolicitudes) {
        this.idsolicitudes = idsolicitudes;
    }

    @Basic
    @Column(name = "horaEntrada")
    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    @Basic
    @Column(name = "horaSalida")
    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    @Basic
    @Column(name = "idEspacio")
    public int getIdEspacio() {
        return idEspacio;
    }

    public void setIdEspacio(int idEspacio) {
        this.idEspacio = idEspacio;
    }

    @Basic
    @Column(name = "idUsuario")
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SolicitudEntity that = (SolicitudEntity) o;

        if (idsolicitudes != that.idsolicitudes) return false;
        if (horaEntrada != null ? !horaEntrada.equals(that.horaEntrada) : that.horaEntrada != null) return false;
        if (horaSalida != null ? !horaSalida.equals(that.horaSalida) : that.horaSalida != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idsolicitudes;
        result = 31 * result + (horaEntrada != null ? horaEntrada.hashCode() : 0);
        result = 31 * result + (horaSalida != null ? horaSalida.hashCode() : 0);
        return result;
    }
}
