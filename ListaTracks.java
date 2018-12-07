package tienditamusic;

import java.util.*;

/**
 * Posee una colección ArrayList de Tracks, se encuentra contenida en Disco
 * 
 * @author Carlos Cubillos
 * @author Tomás Rojas
 * @see Track
 * @see Disco
 */

public class ListaTracks{
    /**
     * Una colección que almacena y maneja los Tracks de un Disco
     */
    ArrayList <Track> listaTracks;
    
    public ListaTracks() {
        listaTracks = new ArrayList<>();		
    }
    
    /**
     * Agrega un Track al ArrayList listaTracks
     * 
     * @param t
     * @return Retorna true si el track se agrega con exito y false si falla
     */
    public boolean agregarTrack(Track t) {
        return listaTracks.add(t);
    }
    
    /**
     * Recibe un Track y lo elimina de listaTracks
     * 
     * @param t
     * @return Retorna el Track eliminado, de falla retorna null
     */
    public Track eliminarTrack (Track t) {
        for(int i=0;i<listaTracks.size();i++) {
            if(listaTracks.get(i).getId()==t.getId()) {
                return listaTracks.remove(i);
            }
        }
        return null;
    }
    
    /**
     * Busca y edita (Reemplaza) un Track de listaTracks
     * 
     * @param t
     * @return Retorna true si el Track se modificó, false en caso contrario
     */
    public boolean editarTrack (Track t) {
        for(int i=0;i<listaTracks.size();i++) {
            if(listaTracks.get(i).getId()== t.getId()) {
                listaTracks.remove(i);
                listaTracks.add(t);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Busca por id un Track en listaTracks y lo retorna
     * 
     * @param id
     * @return Retorna el producto de encontrarlo, de no ser así retorna null
     */
    public Track buscarTrack(int id){
        for (int i=0; i<listaTracks.size();i++){
            if(listaTracks.get(i).getId()==id){
                return listaTracks.get(i);
            }               
        }
        return null;
    }
    
    /**
     * Busca un Usuario en listaUsuario e indica si existe en la colección
     * 
     * @param t
     * @return True si el Track se encuentra en listaTracks, false si no
     */
    public boolean buscarTrack(Track t){
        for(int i=0; i<listaTracks.size();i++){
            if(listaTracks.get(i).equals(t)==true){
                return true;
            }
        }
        return false;
    }
}
