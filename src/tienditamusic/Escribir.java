package tienditamusic;

import java.io.*;

public interface Escribir {
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    //void LeerTxt();
    public void EscribirTxt();
    public void EscribirUsuario(String user, String pass,int id, int tipo);
    //METODO PARA ABRIR UN TXT
    /* try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("C:\\archivo.txt"); // ACA SE CAMBIA LA UBICACION DEL ARCHIVO
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea;
         while((linea=br.readLine())!=null)
            System.out.println(linea);
            }
             catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
      }*/
}