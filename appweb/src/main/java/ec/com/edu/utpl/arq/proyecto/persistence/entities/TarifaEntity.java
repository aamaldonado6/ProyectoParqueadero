package ec.com.edu.utpl.arq.proyecto.persistence.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "tarifa", schema = "estacionamiento", catalog = "")
public class TarifaEntity {
    private int idtarifa;
    private String numero;
    private String descripcion;
    private String cantidadTiempo;
    private Double valor;
    private int idEstacionamiento;
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name = "incrementator", strategy = "increment")
    public int getIdtarifa() {
        return idtarifa;
    }

    public void setIdtarifa(int idtarifa) {
        this.idtarifa = idtarifa;
    }

    @Basic
    @Column(name = "numero")
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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
    @Column(name = "cantidadTiempo")
    public String getCantidadTiempo() {
        return cantidadTiempo;
    }

    public void setCantidadTiempo(String cantidadTiempo) {
        this.cantidadTiempo = cantidadTiempo;
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

        TarifaEntity that = (TarifaEntity) o;

        if (idtarifa != that.idtarifa) return false;
        if (numero != null ? !numero.equals(that.numero) : that.numero != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (cantidadTiempo != null ? !cantidadTiempo.equals(that.cantidadTiempo) : that.cantidadTiempo != null)
            return false;
        if (valor != null ? !valor.equals(that.valor) : that.valor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idtarifa;
        result = 31 * result + (numero != null ? numero.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (cantidadTiempo != null ? cantidadTiempo.hashCode() : 0);
        result = 31 * result + (valor != null ? valor.hashCode() : 0);
        return result;
    }
}
