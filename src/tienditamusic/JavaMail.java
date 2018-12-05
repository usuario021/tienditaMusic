/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienditamusic;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class JavaMail {
    
public static void sendMessage(String mensaje,String subject, String correo){
//        boolean rpta=false;
//        Properties props = new Properties();
//        // Nombre del host de correo, es smtp.gmail.com
//        props.setProperty("mail.smtp.host", "smtp.gmail.com");
//        // TLS si está disponible
//        props.setProperty("mail.smtp.starttls.enable", "true");
//        // Puerto de gmail para envio de correos
//        props.setProperty("mail.smtp.port","587");
//        // Cuenta de correo en gmail
//        props.setProperty("mail.smtp.user", "correo@gmail.com");
//        // Si requiere o no usuario y password para conectarse.
//        props.setProperty("mail.smtp.auth", "true");
//        Session session = Session.getDefaultInstance(props);
//        //Verficiar el envio
//        session.setDebug(true);
//        try {
//            MimeMessage  message = new MimeMessage(session);
//            message.setSubject(subject);
//            message.setText(mensaje);
////            Address address = new InternetAddress(dt,"NombrePersona");
//            message.setFrom(new InternetAddress(from));
//            //La direccion de la persona a enviar
//            Address address2 = new InternetAddress(correo,false);
//            message.addRecipient(Message.RecipientType.TO,address2);
//            Transport t = session.getTransport("smtp");
//            t.connect("correo@gmail.com","clave");
//            t.sendMessage(message,message.getAllRecipients());
//            t.close();
//            rpta=true;
//        } catch (MessagingException ex) {
//            ex.printStackTrace();
//            return rpta;
//        } catch (UnsupportedEncodingException ex) {
//            ex.printStackTrace();
//            return rpta;
//        }
//        return rpta;
      // Recipient's email ID needs to be mentioned.
      String to = "abcd@gmail.com";

      // Sender's email ID needs to be mentioned
      String from = "web@gmail.com";

      // Assuming you are sending email from localhost
      String host = "localhost";

      
      // Get system properties
      Properties properties = new Properties();

      // Setup mail server
      properties.setProperty("mail.smtp.port","587");
      
      properties.setProperty("mail.smtp.host", host);
      
//      properties.setProperty("mail.smtp.user", "correo@gmail.com");
      
      properties.setProperty("mail.smtp.auth", "true");

      // Get the default Session object.
      Session session = Session.getDefaultInstance(properties);

      session.setDebug(true);

      try {
         // Create a default MimeMessage object.
         MimeMessage message = new MimeMessage(session);

          try {
              // Set From: header field of the header.
              message.setFrom(new InternetAddress(from));
          } catch (AddressException ex) {
              Logger.getLogger(JavaMail.class.getName()).log(Level.SEVERE, null, ex);
          }

         // Set To: header field of the header.
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(correo));

          try {
              // Set Subject: header field
              message.setSubject("This is the Subject Line!");
          } catch (MessagingException ex) {
              Logger.getLogger(JavaMail.class.getName()).log(Level.SEVERE, null, ex);
          }

          try {
              // Now set the actual message
              message.setText("This is actual message");
          } catch (MessagingException ex) {
              Logger.getLogger(JavaMail.class.getName()).log(Level.SEVERE, null, ex);
          }

         // Send message
         Transport.send(message);
         System.out.println("Sent message successfully....");
      }catch (MessagingException ex) { 
        Logger.getLogger(JavaMail.class.getName()).log(Level.SEVERE, null, ex);
    }
    // Nombre del host de correo, es smtp.gmail.com
    //setProperty("mail.smtp.host", "smtp.gmail.com");
     
      
      
    // Nombre del host de correo, es smtp.gmail.com
    
        //setProperty("mail.smtp.host", "smtp.gmail.com");

}
}