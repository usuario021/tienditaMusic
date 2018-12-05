/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienditamusic;


/**
 *
 * @author Carlos
 */
public class Cliente extends Persona {
    private boolean premium;
    private int id;
    
    public Cliente (int id, String nombre,String rut, String telefono, String correo, boolean premium){
        super(nombre, rut, telefono, correo);
        this.id=id;
        this.premium=premium;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
        
}
