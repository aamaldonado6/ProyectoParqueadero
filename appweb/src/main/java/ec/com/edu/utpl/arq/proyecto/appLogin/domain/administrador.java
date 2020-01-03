package ec.com.edu.utpl.arq.proyecto.appLogin.domain;

public class administrador {
    int idadministrador;
    String nombre;
    String apellido;
    String mail;
    String telefono;

    public administrador(int idadministrador, String nombre, String apellido, String mail, String telefono) {
        this.idadministrador = idadministrador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.telefono = telefono;
    }

    public int getIdadministrador() {
        return idadministrador;
    }

    public void setIdadministrador(int idadministrador) {
        this.idadministrador = idadministrador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
}
