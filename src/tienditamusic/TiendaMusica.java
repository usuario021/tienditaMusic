/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tienditamusic;
import java.io.*;
import java.time.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Estudiantes
 */
public class TiendaMusica implements Escribir, Leer{
    
    private String nombreSucursal;
    private ListaProductos listaProductos;
    private ListaUsuarios listaUsuarios;
    private Calendar calendario = new GregorianCalendar();
    
    public TiendaMusica(){
        listaProductos=new ListaProductos();
        listaUsuarios=new ListaUsuarios();
        EscribirTxt();
        leerTxt();
    }
    public void EscribirTxt(){
        int año=calendario.get(Calendar.YEAR);
        int mes=calendario.get(Calendar.MONTH);
        int dia=calendario.get(Calendar.DAY_OF_MONTH);
        int hora=calendario.get(Calendar.HOUR_OF_DAY);
        int min = calendario.get(Calendar.MINUTE);
        int sec = calendario.get(Calendar.SECOND);
        
        try{
        File archivo = new File ("log.txt");
        FileWriter escritor = new FileWriter (archivo,true);
        BufferedWriter bw = new BufferedWriter (escritor);
        PrintWriter pEscritor = new PrintWriter(bw);
        pEscritor.write("El archivo se inicio correctamente || "+dia+"-"+mes+"-"+año+" "+hora+":"+min+":"+sec);
        bw.newLine();
        pEscritor.close();
        escritor.close();
        }catch(IOException e){
        };
        }   
    public void EscribirUsuario(String user, String pass,int id, int tipo){
        
    }
    public void leerTxt(){
        try {
            FileReader lector = new FileReader("user.txt");
            BufferedReader br= new BufferedReader(lector);
            String linea;
            linea = br.readLine();
            String user;
            String pass;
            int id;
            int tipo;
            String[] datos= linea.split("-");
            for(int i=0;i<datos.length;i++){
            user=datos[i];
            i++;
            pass=datos[i];
            i++;
            id=Integer.parseInt(datos[i]);
            i++;
            tipo=Integer.parseInt(datos[i]);
            listaUsuarios.agregarUsuario(user, pass, id, tipo);
            System.out.println(datos[0]);
            }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public ListaUsuarios getListaUsuarios(){
        return listaUsuarios;
    }

   
    

}

