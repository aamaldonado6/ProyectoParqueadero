package ec.com.edu.utpl.arq.proyecto.appParqueadero.persistence.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "establecimiento", schema = "estacionamiento", catalog = "")
public class EstablecimientoEntity {
    private int idestablecimiento;
    private String nombreEstablecimiento;
    private String direccion;
    private String telefono;
    private String longitud;
    private String latitud;
    private String mail;
    private String nick;
    private String password;
    private String nombreAdministrador;
    private String apellidoAdministrador;
    private String cedulaAdministrador;

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
    @Column(name = "nombreEstablecimiento")
    public String getNombreEstablecimiento() {
        return nombreEstablecimiento;
    }

    public void setNombreEstablecimiento(String nombreEstablecimiento) {
        this.nombreEstablecimiento = nombreEstablecimiento;
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
    @Column(name = "longitud")
    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
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
    @Column(name = "mail")
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Basic
    @Column(name = "nick")
    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "nombreAdministrador")
    public String getNombreAdministrador() {
        return nombreAdministrador;
    }

    public void setNombreAdministrador(String nombreAdministrador) {
        this.nombreAdministrador = nombreAdministrador;
    }

    @Basic
    @Column(name = "apellidoAdministrador")
    public String getApellidoAdministrador() {
        return apellidoAdministrador;
    }

    public void setApellidoAdministrador(String apellidoAdministrador) {
        this.apellidoAdministrador = apellidoAdministrador;
    }

    @Basic
    @Column(name = "cedulaAdministrador")
    public String getCedulaAdministrador() {
        return cedulaAdministrador;
    }

    public void setCedulaAdministrador(String cedulaAdministrador) {
        this.cedulaAdministrador = cedulaAdministrador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EstablecimientoEntity that = (EstablecimientoEntity) o;

        if (idestablecimiento != that.idestablecimiento) return false;
        if (nombreEstablecimiento != null ? !nombreEstablecimiento.equals(that.nombreEstablecimiento) : that.nombreEstablecimiento != null) return false;
        if (direccion != null ? !direccion.equals(that.direccion) : that.direccion != null) return false;
        if (telefono != null ? !telefono.equals(that.telefono) : that.telefono != null) return false;
        if (mail != null ? !mail.equals(that.mail) : that.mail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idestablecimiento;
        result = 31 * result + (nombreEstablecimiento != null ? nombreEstablecimiento.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        return result;
    }
}
