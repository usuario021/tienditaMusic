package tienditamusic;

import java.util.Calendar;

/**
 * Clase primitiva que extiende de producto y es manejada por instancia de clase MapaDiscos.
 * 
 * @author Carlos Cubillos.
 * @author Tomás Rojas.
 * @see Producto.
 * @see MapaDiscos.
 */

public class Disco extends Producto {
    private String autor;
    private int tracks;
    /**
     * Tiempo en unidad de minutos del Disco/Álbum.
     */
    private int tiempo;
    private Calendar fechaLanzamiento;

    public Disco(String autor, int tracks, int tiempo, Calendar fechaLanzamiento, int id, String nombre, double precio, String descripcion) {
        super(id, nombre, precio, descripcion);
        this.autor = autor;
        this.tracks = tracks;
        this.tiempo = tiempo;
        this.fechaLanzamiento = fechaLanzamiento;
    }
    /**
     * Métodos Setter y Getter.
     */
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTracks() {
        return tracks;
    }
    public void setTracks(int tracks) {
        this.tracks = tracks;
    }

    public int getTiempo() {
        return tiempo;
    }
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public Calendar getFechaLanzamiento() {
        return fechaLanzamiento;
    }
    public void setFechaLanzamiento(Calendar fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
}
