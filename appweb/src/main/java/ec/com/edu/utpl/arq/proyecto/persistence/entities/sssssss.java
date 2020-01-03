package ec.com.edu.utpl.arq.proyecto.persistence.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "loginusuario")
@XmlRootElement
public class sssssss implements Serializable {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name = "incrementator", strategy = "increment")
    private Integer idloginUsuario;
    @Column(name = "nick")
    private String nick;
    @Column(name = "password")
    private String password;
    @Column(name = "fechaCreacion")
    private Date fechaCreacion;
    @Column(name = "idUsuario")
    private int idUsuario;

    public sssssss() {
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
