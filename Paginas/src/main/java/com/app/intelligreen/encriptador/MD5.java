/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.intelligreen.encriptador;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.binary.Base64;
/**
 *
 * @author Alumno
 */
public class MD5 {
    
    public String encriptar(String texto){
        byte[] encriptado = null;
        String hash = null;
        try {
            MessageDigest md =MessageDigest.getInstance("MD5");
            md.update(texto.getBytes());
            byte[] encoded = md.digest();
            BigInteger number = new BigInteger(1,encoded);
            hash = number.toString(16);
            while(hash.length() < 32){
                hash = "0" + hash;
            }
            encriptado = Base64.encodeBase64(encoded);
            
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("Error " + ex);
            ex.printStackTrace();
        }
        return hash;
    }
    
}
