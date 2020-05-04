/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.bibliotecalpwsd.util;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Gerim
 */
public class Criptografia {
    
     public static String criptografiaSenha(String senha) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest messageDigest =  MessageDigest.getInstance("MD-5");
        messageDigest.update(senha.getBytes("UTF-8"));
        
        return new BigInteger(1, messageDigest.digest()).toString(16);
    }
}
