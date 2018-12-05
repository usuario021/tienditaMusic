package tienditamusic;

public class Persona {
    //Atributos
    private String nombre;
    private String rut;
    private String telefono;
    private String correo;

    //Constructores
    public Persona() {
        nombre = null;
        rut = null;
        telefono = null;
        correo = null;
    }

    public Persona(String nombre,String rut, String telefono, String correo) {
            this.nombre = nombre;
            this.rut = rut;
            this.telefono = telefono;
            this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}