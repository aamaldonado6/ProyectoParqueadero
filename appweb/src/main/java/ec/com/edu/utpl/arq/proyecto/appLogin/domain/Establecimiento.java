package ec.com.edu.utpl.arq.proyecto.appLogin.domain;

public class Establecimiento {
    String nombre;
    String direccion;
    String telefono;
    String longi;
    String lat;
    String mail;
    int ideEstablecimiento;

    public Establecimiento(String nombre, String direccion, String telefono, String longi, String lat, String mail) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.longi = longi;
        this.lat = lat;
        this.mail = mail;
    }

    public Establecimiento(int ideEstablecimiento) {
        this.ideEstablecimiento = ideEstablecimiento;
    }

    public int getIdeEstablecimiento() {
        return ideEstablecimiento;
    }

    public void setIdeEstablecimiento(int ideEstablecimiento) {
        this.ideEstablecimiento = ideEstablecimiento;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLongi() {
        return longi;
    }

    public void setLongi(String longi) {
        this.longi = longi;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
