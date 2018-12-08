package tienditamusic;

/**La clase Persona permite generar una instancia que alude al concepto de información de identificación y contacto de una persona,
   valga la redundancia.
 */

public class Persona {
    /** Atributos.
     *  Esta clase posee 4 atributos de tipo String. La primera variable almacena el nombre de una persona. La segunda, la cédula de 
        identidad, y las restantes almacenan el número telefónico y el correo electrónico respectivamente.
     */
    private String nombre;
    private String rut;
    private String telefono;
    private String correo;

    /** Constructores.
     *  El primer constructor constituye una opción de inicialización de los atributos con valores neutrales, para este caso, en que
        todos los atributos son String, se inicializan con null.
     *  El segundo constructor recibe 4 parámetros con los que inicializa los 4 atributos de la instancia.
        @param Recibe nombre, rut, número telefónico y correo electrónico de la persona que se desea registrar.
     */ 
    public Persona() {
        nombre = null;
        rut = null;
        telefono = null;
        correo = null;
    }
    public Persona(String nombre, String rut, String telefono, String correo) {
            this.nombre = nombre;
            this.rut = rut;
            this.telefono = telefono;
            this.correo = correo;
    }
    
    /** Métodos Getter y Setter.
     */
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
