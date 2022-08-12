package com.minimals.ssl.context.baseCase;

import javax.net.ssl.SSLContext;
import java.security.NoSuchAlgorithmException;

public class ContextOfSSL {
    public static void main(String[] args) {
        try {
            SSLContext context = SSLContext.getInstance("SSL");
            System.out.println(context.getProtocol());
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            System.out.println("Error");
        }
        
    }
}
