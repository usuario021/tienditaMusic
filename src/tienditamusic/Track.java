package tienditamusic;

/**
 * Clase que representa un track de disco, la maneja ListaTracks
 * 
 * @author Carlos Cubillos
 * @author Tomás Rojas
 * @see ListaTracks
 * @see MapaDiscos
 */
public class Track {
    private int id;
    private String titulo;
    private String genero;
    private int tiempo;

    public Track(int id, String titulo, String genero, int tiempo) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.tiempo = tiempo;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTiempo() {
        return tiempo;
    }
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
}
