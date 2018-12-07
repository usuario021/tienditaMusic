package tienditamusic;

import java.util.*;

/**
 * Posee una colección ArrayList de Usuarios
 * 
 * @author Carlos Cubillos
 * @author Tomás Rojas
 * @see Usuario
 * @see VentanaAdministrarUsuario
 */

public class ListaUsuarios{
    /**
     * Una colección que almacena y maneja los Usuarios
     */
    ArrayList <Usuario> listaUsuarios;
    
    public ListaUsuarios() {
            listaUsuarios = new ArrayList<>();		
	}
    
    /**
     * Agrega un Usuario al ArrayList listaUsuarios
     * 
     * @param u
     * @return Retorna true si el usuario se agrega con exito y false si falla
     */
    public boolean agregarUsuario(Usuario u) {
        return listaUsuarios.add(u);	
    }
    
    /**
     * Agrega el Usuario según los datos entregados
     * 
     * @param user
     * @param pass
     * @param id
     * @param tipo
     */
    public void agregarUsuario(String user,String pass,int id,int tipo){
        Usuario u = new Usuario(user,pass,id,tipo);
        listaUsuarios.add(u);
    }
    /**
     * Recibe un Usuario y lo elimina de listaUsuarios
     * 
     * @param u
     * @return Retorna el Producto eliminado, de falla retorna null
     */    
    public Usuario eliminarUsuario (Usuario u) {
            for(int i=0;i<listaUsuarios.size();i++) {
                     if(listaUsuarios.get(i).getIdUsuario()==u.getIdUsuario()) {
                             return listaUsuarios.remove(i);
                     }
            }
            return null;
    }
    
    /**
     * Busca y edita (Reemplaza) un Usuario de listaUsuarios
     * 
     * @param u
     * @return Retorna true si el Usuario se modificó, false en caso contrario
     */
    public boolean editarUsuario (Usuario u) {
        for(int i=0;i<listaUsuarios.size();i++) {
                if(listaUsuarios.get(i).getIdUsuario()== u.getIdUsuario()) {
                        listaUsuarios.remove(i);
                        listaUsuarios.add(u);
                        return true;
                }
        }
        return false;
    }
    
    /**
     * Busca por username un Usuario en listaUsuarios y lo retorna
     * 
     * @param user
     * @return Retorna el producto de encontrarlo, de no ser así retorna null
     */
    public Usuario buscarUsuario (String user){
        for (int i=0; i<listaUsuarios.size();i++){
            if(listaUsuarios.get(i).getNombreUsuario().equals(user)){
                return listaUsuarios.get(i);
            }               
        }
        return null;
    }
    
    /**
     * Busca un Usuario en listaUsuario e indica si existe en la colección
     * 
     * @param u
     * @return True si el Usuario se encuentra en listaUsuarios, false si no
     */
    public boolean buscarUsuario(Usuario u){
        for(int i=0; i<listaUsuarios.size();i++){
            if(listaUsuarios.get(i).equals(u)==true){
                return true;
            }
        }
        return false;
    }
}
