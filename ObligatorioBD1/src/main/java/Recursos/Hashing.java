/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursos;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nmais
 */
public class Hashing {

    private Hashing() {
    }

    public static String DoHash(String pTexto) {
        StringBuilder stb = new StringBuilder();
        try {
            MessageDigest messageD = MessageDigest.getInstance("SHA");
            messageD.update(pTexto.getBytes());
            byte[] resultByteArray = messageD.digest();

            for (byte x : resultByteArray) {
                stb.append(String.format("%02x", x));
            }
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Hashing.class.getName()).log(Level.SEVERE, null, ex);
        }

        return stb.toString();
    }
}
