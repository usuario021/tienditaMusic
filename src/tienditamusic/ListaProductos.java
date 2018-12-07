package tienditamusic;

import java.util.ArrayList;

/**
 * Tiene una colección ArrayList de Productos y una instancia de MapaDiscos
 * 
 * @author Carlos Cubillos
 * @author Tomás Rojas
 * @see Producto
 * @see MapaDiscos
 * @see VentanaAdministrarProductos
 */

public class ListaProductos {
    /**
     * El ArrayList listaProducto almacena y maneja los Productos
     */
    private final ArrayList <Producto> listaProductos;
    /**
     * Posee una instancia de MapaDiscos, para mantener la encapsulación
     */
    private final MapaDiscos mapaDiscos;

    public ListaProductos() {
        listaProductos=new ArrayList<>();
        mapaDiscos = new MapaDiscos();
    }

    /**
     * Agrega un Producto al ArrayList listaProductos
     * 
     * @param p
     * @return Retorna true si funciona y false de fallar
     */
    public boolean agregarProducto(Producto p) {
        return listaProductos.add(p);
    }
    
    /**
     * Busca por ID un Producto y lo elimina de listaProductos 
     * 
     * @param id
     * @return Retorna el Producto eliminado, de falla retorna null
     */
    public Producto eliminarProducto(int id) {
        for(int i=0;i<listaProductos.size();i++) {
            if(listaProductos.get(i).getId()==id) {
                    return listaProductos.remove(i);
            }
        }
        return null;
    }
    
    /**
     * Busca y edita (Reemplaza) un Producto de listaProductos
     * 
     * @param p
     * @return Retorna true si el Producto se modificó, false en caso contrario
     */
    public boolean editarProducto(Producto p) {
        for(int i=0;i<listaProductos.size();i++) {
            if(listaProductos.get(i).getId()==p.getId()){				 
                listaProductos.remove(i);
                listaProductos.add(i, p);
                return true;
            }
        }
        return false;
    }

    /**
     * Busca un Producto en listaProductos y lo retorna
     * 
     * @param nombre
     * @return Retorna el producto de encontrarlo, de no ser así retorna null
     */
    public Producto buscarProducto(String nombre){
        for(int i=0;i<listaProductos.size();i++){
            if(listaProductos.get(i).getNombre().equals(nombre)==true){
                return listaProductos.get(i);
            }
        }
        return null;
    }
    
    /**
     * Busca un Producto en listaProductos e indica si lo existe en la coleccion
     * 
     * @param p
     * @return True si el Producto se encuentra en listaProductos, false si no
     */
    public boolean buscarProducto(Producto p){
        for (int i=0;i<listaProductos.size();i++){
            if(listaProductos.get(i).equals(p)==true){
                return true;
            }
        }
        return false;
    }
}
