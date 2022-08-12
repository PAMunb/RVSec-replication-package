package com.minimals.cipher.aesGCMNoPadding;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import java.security.Key;

public class CipherExample01 {
    public static void main(String[] args) throws Exception {
        Cipher c = Cipher.getInstance("AES/GCM/NoPadding");
        runCipher(c);
    }

    public static void runCipher(Cipher c) throws Exception {
        Key key = KeyGenerator.getInstance("AES").generateKey();
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] cipherText = c.doFinal("password".getBytes());
    }
}
