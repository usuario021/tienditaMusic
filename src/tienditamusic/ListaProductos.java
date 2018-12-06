    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tienditamusic;


import java.util.ArrayList;
import tienditamusic.Producto;

/**
 *
 * @author Estudiantes
 */
public class ListaProductos {
    
	private ArrayList <Producto> listaProductos;
	
	public ListaProductos() {
	    listaProductos= new ArrayList <Producto>();		
	}
	
	public boolean agregarProducto(Producto p){
            if (!BuscarProducto(p)){
                listaProductos.add(p);
	     	return false;
	    }     
            return true;
	}
	 public Producto eliminarProducto(int id) {
		 for(int i=0;i<listaProductos.size();i++) {
			 if(listaProductos.get(i).getId()==id) {
				 return listaProductos.remove(i);
			 }
		 }
		 return null;
	 }
	 public boolean editarProducto(Producto p){
	     for(int i=0; i<listaProductos.size(); i++) {
                 if(listaProductos.get(i).getId()== p.getId()) 
	         {				 
	             listaProductos.remove(i);
                     listaProductos.add(i, p);
	             return true;
	         }
             }
             return false;
	 }
         public Producto buscarProducto(String nombre){
             for(int i=0; i<listaProductos.size(); i++){
                 if(listaProductos.get(i).getNombre().equals(nombre)){
                     return listaProductos.get(i);
                 }
             }
             return null;
         }
         public boolean buscarProducto(Producto p){
             for (int i=0; i<listaProductos.size(); i++){
                 if(listaProductos.get(i).equals(p)){
                     return true;
                 }
             }
             return false;
         }
    }

