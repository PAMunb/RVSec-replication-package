package com.minimals.cipher.aesGCMNoPaddingReplaceDES;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import java.security.Key;

public class CipherExample02 {
    public static void main(String[] args)  throws Exception {
        Cipher c = Cipher.getInstance("AES/GCM/NoPadding".replace("AES/GCM/NoPadding", "DES"));
        runCipher(c);
    }

    public static void runCipher(Cipher c) throws Exception {
        Key key = KeyGenerator.getInstance("DES").generateKey();
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] cipherText = c.doFinal("password".getBytes());
    }
}
