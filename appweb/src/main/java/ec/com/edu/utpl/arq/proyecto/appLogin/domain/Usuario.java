/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.edu.utpl.arq.proyecto.appLogin.domain;

import java.sql.Date;

/**
 *
 * @author utpl
 */
public class Usuario {
    String nombre;
    String apellido;
    String direccion;
    String mail;
    String telefono;
    int idUsuario;
    String nick;
    String password;
    Date fechaCreacion;

    public Usuario(String nombre, String apellido, String direccion, String mail, String telefono, String nick, String password, Date fechaCreacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.mail = mail;
        this.telefono = telefono;
        this.nick = nick;
        this.password = password;
        this.fechaCreacion = fechaCreacion;
    }

    public Usuario() {
    }

    public Usuario(String nick, String password) {
        this.nick = nick;
        this.password = password;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Usuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(String nick) {
        this.nick = nick;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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
}
