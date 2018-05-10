/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.intelligreen.correo;


import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Ger
 */
public class Correo {
    public Correo()
    {

    }
    public boolean mandaMAil(String Para, String nombreUsuario, String clave)
    {
        boolean envio = false;
        try
        {

            // Configuracion de la cuenta de envio de mail
            Properties confMail = new Properties();
            confMail.setProperty("mail.smtp.host", "smtp.gmail.com");
            confMail.setProperty("mail.smtp.starttls.enable", "true");
            confMail.setProperty("mail.smtp.port", "587");
            confMail.setProperty("mail.smtp.user", "correospruebamomentum@gmail.com");
            confMail.setProperty("mail.smtp.auth", "true");
            // Sesion
            Session session = Session.getDefaultInstance(confMail);
            // Creamos el MAil
            MimeMessage correo = new MimeMessage(session);
            correo.setFrom(new InternetAddress("correospruebamomentum@gmail.com"));
            correo.addRecipient(Message.RecipientType.TO, new InternetAddress(Para));
            correo.setSubject("NO REPLY, Cambio de Contraseña");
            String message = "";
            
            String template =
                    "<div style='background-color:#2e7d32'>"
                    + "Mandar el correo"
                    + "</div>";
            correo.setContent(template,"text/html");


            // Enviamos MAil .
            Transport t = session.getTransport("smtp");
            t.connect("correospruebamomentum@gmail.com", "mailMomentum");
            t.sendMessage(correo, correo.getAllRecipients());

            // Cerramos conexion.
            t.close();
            envio = true;
        }
        catch (Exception e)
        {
            System.out.println("Error " + e);
            e.printStackTrace();
        }
        return envio;
    }
}