package com.boletos.boletosapiu.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Encriptacion {
        public String hashMD5(String password) throws NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("MD5");
        
        byte[] message = md.digest(password.getBytes());
        
        BigInteger bigInt = new BigInteger(1, message);
        
        return bigInt.toString(16);
    }
}
