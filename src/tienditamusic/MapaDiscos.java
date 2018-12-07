package tienditamusic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * La instancia MapaDiscos contiene una colección de clase HashMap que contiene instancias Disco. 
 * Se encuentra almacenada en ListaProductos.
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
     * Añade una referencia a clase Disco recibida por parámetro.
     * 
     * @param disco 
     */
    public void agregarDisco(Disco disco){
        mapDiscos.put(disco.getId(), disco);
    }
    
    /**
     * Elimina la referencia respectiva al Id en mapDiscos y lo retorna.
     * 
     * @param id
     * @return Retorna el Disco eliminado, de fallar la operacion retorna null.
     */
    public Disco eliminarDisco(int id) {
        if(mapDiscos.get(id)!=null){
            return mapDiscos.remove(id);
        }
        return null;
    }
    /**
     * Obtiene y reemplaza el Disco de mapDiscos, para ello no puede ni debe cambiar su atributo Id.
     * 
     * @param Una referencia a instancia de clase Disco. 
     * @return Retorna true si se edita con éxito.
     */
    public boolean editarDisco(Disco disco) {
        if (mapDiscos.get(disco.getId())!=null){
            agregarDisco(disco);
            return true;
        }
        return false;
    }
    
    /**
     * Busca un Disco por Id en mapDiscos y lo retorna en caso de encontrarlo.
     * 
     * @param id
     * @return Disco en caso de encontrarlo, de lo contrario retorna null.
     */
    public Disco buscarDisco(int id){
        if(mapDiscos.get(id)!=null){
            return mapDiscos.get(id);
        }
        return null;
    }
    
    /**
     * Busca y entrega todas las referencias a Disco cuyo valor del atributo "autor" coincidan con el valor del String "autor" entregado.
     * @param String autor: variable que representa el nombre del autor o artista cuyos discos se desea encontrar.
     * @return Retorna una colección ArrayList con referencias a clase Disco del Autor referido; retorna null en caso de no encontrar 
       ninguna referencia con la condición mencionada.
     */
    public ArrayList<Disco> buscarDiscoAutor(String autor) {
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
     * Busca y entrega referencias de todas las instancias Disco que posean como título el valor del String entregado por el parámetro "título".
     * @param String con el Título.
     * @return Un ArrayList de referencias a objetos clase Disco cuyo atributo título se corresponde al valor del String ingresado, null en caso de no encontrar alguno.
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
