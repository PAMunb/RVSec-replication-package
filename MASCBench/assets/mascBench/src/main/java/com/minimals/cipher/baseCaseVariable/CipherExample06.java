package com.minimals.cipher.baseCaseVariable;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import java.security.Key;

public class CipherExample06 {
    public static void main(String[] args) throws Exception {
        String algorithmName = "AES";
        Cipher c = Cipher.getInstance(algorithmName);
        runCipher(c);
    }

    public static void runCipher(Cipher c) throws Exception {
        Key key = KeyGenerator.getInstance("AES").generateKey();
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] cipherText = c.doFinal("password".getBytes());
    }
}
