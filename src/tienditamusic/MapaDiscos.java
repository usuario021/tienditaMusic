package tienditamusic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Se almacena en ListaProductos, posee una coleccion HashMap de Discos
 *
 * @author Carlos Cubillos
 * @author Tomás Rojas
 * @see ListaProductos
 * @see Disco
 */

public class MapaDiscos{
    private final HashMap <Integer,Disco> mapDiscos;
    
    public MapaDiscos(){
        mapDiscos = new HashMap<>();
    }
 
    /**
     * Añade un Disco otorgado al mapa
     * 
     * @param disco 
     */
    public void agregarDisco(Disco disco){
        mapDiscos.put(disco.getId(), disco);
    }
    
    /**
     * Elimina el Disco respectivo al ID en mapDiscos y lo retorna
     * 
     * @param id
     * @return Retorna el Disco eliminado, de fallar la operacion retorna null
     */
    public Disco eliminarDisco(int id) {
        if(mapDiscos.get(id)!=null){
            return mapDiscos.remove(id);
        }
        return null;
    }
 
    /**
     * Obtiene y reemplaza el Disco de mapDiscos, no puede modificar su ID
     * 
     * @param disco
     * @return Retorna true si se edita con exito
     */
    public boolean editarDisco(Disco disco) {
        if(mapDiscos.get(disco.getId())!=null){
            agregarDisco(disco);
            return true;
        }
        return false;
    }
    
    /**
     * Busca un Disco por ID en mapDiscos y lo retorna de encontrarlo
     * 
     * @param id
     * @return Retorna el Disco de encontrarlo, si no retorna null
     */
    public Disco buscarDisco(int id){
        if(mapDiscos.get(id)!=null){
            return mapDiscos.get(id);
        }
        return null;
    }
    
    /**
     * Busca y entrega todos los discos que posea un autor
     * 
     * @param autor
     * @return Retorna un ArrayList de Discos del Autor y null de no tener
     */
    public ArrayList<Disco> buscarDiscoAutor(String autor){
        Iterator it = mapDiscos.entrySet().iterator();
        ArrayList<Disco> discosAutor;
        discosAutor = new ArrayList<>();
        while(it.hasNext()){
            HashMap.Entry i = (HashMap.Entry)it.next();
            if(mapDiscos.get((int)i.getKey()).getAutor().equals(autor)){
                discosAutor.add(mapDiscos.get((int)i.getKey()));
            }
        }
        if(discosAutor.isEmpty()) return null;
        return discosAutor;
    }
    
    /**
     * Busca y entrega todos los discos que posean el titulo entregado
     * 
     * @param titulo
     * @return Retorna un ArrayList de Discos con el mismo titulo, null si falla
     */
    public ArrayList<Disco> buscarDiscoTitle(String titulo){
        Iterator it = mapDiscos.entrySet().iterator();
        ArrayList<Disco> discosAutor;
        discosAutor = new ArrayList<>();
        while(it.hasNext()){
            HashMap.Entry i = (HashMap.Entry)it.next();
            if(mapDiscos.get((int)i.getKey()).getAutor().equals(titulo)){
                discosAutor.add(mapDiscos.get((int)i.getKey()));
            }
        }
        if(discosAutor.isEmpty()) return null;
        return discosAutor;
    }
}
