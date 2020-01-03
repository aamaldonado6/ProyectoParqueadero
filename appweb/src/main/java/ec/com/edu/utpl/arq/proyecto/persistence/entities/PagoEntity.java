package ec.com.edu.utpl.arq.proyecto.persistence.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "pago", schema = "estacionamiento", catalog = "")
public class PagoEntity {
    private int idpago;
    private String fecha;
    private Double valor;
    private String medioPago;
    private Integer estado;
    private int idSolicitud;
    private int idEmpleado;

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name = "incrementator", strategy = "increment")
    public int getIdpago() {
        return idpago;
    }

    public void setIdpago(int idpago) {
        this.idpago = idpago;
    }

    @Basic
    @Column(name = "fecha")
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Basic
    @Column(name = "valor")
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Basic
    @Column(name = "medioPago")
    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    @Basic
    @Column(name = "estado")
    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "idSolicitud")
    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    @Basic
    @Column(name = "idEmpleado")
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PagoEntity that = (PagoEntity) o;

        if (idpago != that.idpago) return false;
        if (fecha != null ? !fecha.equals(that.fecha) : that.fecha != null) return false;
        if (valor != null ? !valor.equals(that.valor) : that.valor != null) return false;
        if (medioPago != null ? !medioPago.equals(that.medioPago) : that.medioPago != null) return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idpago;
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + (valor != null ? valor.hashCode() : 0);
        result = 31 * result + (medioPago != null ? medioPago.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        return result;
    }
}
