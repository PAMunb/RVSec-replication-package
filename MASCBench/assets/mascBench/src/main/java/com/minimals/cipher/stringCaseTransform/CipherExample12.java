package com.minimals.cipher.stringCaseTransform;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import java.security.Key;
import java.util.Locale;

public class CipherExample12 {
    public static void main(String[] args) throws Exception {
        Cipher c = Cipher.getInstance("des".toUpperCase(Locale.ENGLISH));
        runCipher(c);
    }

    public static void runCipher(Cipher c) throws Exception {
        Key key = KeyGenerator.getInstance("DES").generateKey();
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] cipherText = c.doFinal("password".getBytes());
    }
}
