package tienditamusic;

import java.util.Calendar;

/**
 * Clase primitiva, extiende de Producto, es manejada por MapaDiscos
 * 
 * @author Carlos Cubillos
 * @author Tomás Rojas
 * @see Producto
 * @see MapaDiscos
 */

public class Disco extends Producto {
    private String autor;
    private int tracks;
    /**
     * Tiempo en minutos del Disco/Album
     */
    private int tiempo;
    private Calendar fechaLanzamiento;
    /**
     * Posee una listaTracks para manejar
     */
    private ListaTracks listaTracks;

    public Disco(String autor, int tracks, int tiempo, Calendar fechaLanzamiento, int id, String nombre, double precio, String descripcion) {
        super(id, nombre, precio, descripcion);
        this.autor = autor;
        this.tracks = tracks;
        this.tiempo = tiempo;
        this.fechaLanzamiento = fechaLanzamiento;
    }

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
