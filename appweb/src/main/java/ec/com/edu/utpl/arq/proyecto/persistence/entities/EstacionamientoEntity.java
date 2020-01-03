package ec.com.edu.utpl.arq.proyecto.persistence.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "estacionamiento", schema = "estacionamiento", catalog = "")
public class EstacionamientoEntity {
    private int idestacionamiento;
    private String identificacion;
    private String descripcion;
    private String latitud;
    private String longitud;
    private int idEstablecimiento;

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name = "incrementator", strategy = "increment")
    public int getIdestacionamiento() {
        return idestacionamiento;
    }

    public void setIdestacionamiento(int idestacionamiento) {
        this.idestacionamiento = idestacionamiento;
    }

    @Basic
    @Column(name = "identificacion")
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Basic
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "latitud")
    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    @Basic
    @Column(name = "longitud")
    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    @Basic
    @Column(name = "idEstablecimiento")
    public int getIdEstablecimiento() {
        return idEstablecimiento;
    }

    public void setIdEstablecimiento(int idEstablecimiento) {
        this.idEstablecimiento = idEstablecimiento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EstacionamientoEntity that = (EstacionamientoEntity) o;

        if (idestacionamiento != that.idestacionamiento) return false;
        if (identificacion != null ? !identificacion.equals(that.identificacion) : that.identificacion != null)
            return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (latitud != null ? !latitud.equals(that.latitud) : that.latitud != null) return false;
        if (longitud != null ? !longitud.equals(that.longitud) : that.longitud != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idestacionamiento;
        result = 31 * result + (identificacion != null ? identificacion.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (latitud != null ? latitud.hashCode() : 0);
        result = 31 * result + (longitud != null ? longitud.hashCode() : 0);
        return result;
    }
}
