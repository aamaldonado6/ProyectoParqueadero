package ec.com.edu.utpl.arq.proyecto.appParqueadero.domain;

public class Establecimiento {
    int ideEstablecimiento;
    String nombre;
    String direccion;
    String telefono;
    String longi;
    String lat;
    String mail;
    String nick;
    String password;
    String nombreAdm;
    String apellidoAdm;
    String cedulaAdm;

    public Establecimiento( String nombre, String direccion, String telefono, String longi, String lat, String mail, String nick, String password, String nombreAdm, String apellidoAdm, String cedulaAdm) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.longi = longi;
        this.lat = lat;
        this.mail = mail;
        this.nick = nick;
        this.password = password;
        this.nombreAdm = nombreAdm;
        this.apellidoAdm = apellidoAdm;
        this.cedulaAdm = cedulaAdm;
    }

    public Establecimiento(String nick, String password) {
        this.nick = nick;
        this.password = password;
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

    public String getNombreAdm() {
        return nombreAdm;
    }

    public void setNombreAdm(String nombreAdm) {
        this.nombreAdm = nombreAdm;
    }

    public String getApellidoAdm() {
        return apellidoAdm;
    }

    public void setApellidoAdm(String apellidoAdm) {
        this.apellidoAdm = apellidoAdm;
    }

    public String getCedulaAdm() {
        return cedulaAdm;
    }

    public void setCedulaAdm(String cedulaAdm) {
        this.cedulaAdm = cedulaAdm;
    }
}
