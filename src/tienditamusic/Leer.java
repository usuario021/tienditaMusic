/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienditamusic;

import java.io.*;
import java.util.*;

/**
 *
 * @author Carlos
 */
public interface Leer {
 
   File archivo = new File("user.txt");
   BufferedReader br = null;
    
   
  public void leerTxt();
   
}
