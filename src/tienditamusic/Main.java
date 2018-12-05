/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienditamusic;
/**
 *
 * @author EDU
 */
import java.io.*;
import java.util.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TiendaMusica tiendita = new TiendaMusica();
        VentanaLogin login = new VentanaLogin (tiendita);
        login.setVisible(true);   
    }
}
