package ec.com.edu.utpl.arq.proyecto.appLogin.domain;

import java.util.Date;

public class Empleado {
    int idempleado;
    String nombre;
    String apellid;
    String direccion;
    String mail;
    String nick;
    String password;
    Date fechaCreacion;
    Estacionamiento idEstacionamiento;

    public Empleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public Empleado(int idempleado, String nombre, String apellid, String direccion, String mail, String nick, String password, Date fechaCreacion, Estacionamiento idEstacionamiento) {
        this.idempleado = idempleado;
        this.nombre = nombre;
        this.apellid = apellid;
        this.direccion = direccion;
        this.mail = mail;
        this.nick = nick;
        this.password = password;
        this.fechaCreacion = fechaCreacion;
        this.idEstacionamiento = idEstacionamiento;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellid() {
        return apellid;
    }

    public void setApellid(String apellid) {
        this.apellid = apellid;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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

    public Estacionamiento getIdEstacionamiento() {
        return idEstacionamiento;
    }

    public void setIdEstacionamiento(Estacionamiento idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }
}
