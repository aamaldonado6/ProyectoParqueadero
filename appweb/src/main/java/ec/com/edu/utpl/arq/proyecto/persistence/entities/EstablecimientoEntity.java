package ec.com.edu.utpl.arq.proyecto.persistence.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "establecimiento", schema = "estacionamiento", catalog = "")
public class EstablecimientoEntity {
    private int idestablecimiento;
    private String nombre;
    private String direccion;
    private String telefono;
    private String mail;
    private int idAdministrador;

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name = "incrementator", strategy = "increment")
    public int getIdestablecimiento() {
        return idestablecimiento;
    }

    public void setIdestablecimiento(int idestablecimiento) {
        this.idestablecimiento = idestablecimiento;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "direccion")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Basic
    @Column(name = "telefono")
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Basic
    @Column(name = "mail")
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Basic
    @Column(name = "idAdministrador")
    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EstablecimientoEntity that = (EstablecimientoEntity) o;

        if (idestablecimiento != that.idestablecimiento) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (direccion != null ? !direccion.equals(that.direccion) : that.direccion != null) return false;
        if (telefono != null ? !telefono.equals(that.telefono) : that.telefono != null) return false;
        if (mail != null ? !mail.equals(that.mail) : that.mail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idestablecimiento;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        return result;
    }
}
