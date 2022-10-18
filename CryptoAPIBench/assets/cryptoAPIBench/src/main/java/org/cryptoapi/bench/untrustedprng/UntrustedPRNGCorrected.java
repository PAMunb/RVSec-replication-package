package org.cryptoapi.bench.untrustedprng;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class UntrustedPRNGCorrected {


    public static void main(String [] args)
    {
        SecureRandom random = new SecureRandom();
        PBEParameterSpec pbeParamSpec = null;
        byte[] salt = new byte[32];
        random.nextBytes(salt);
        int count = 10020;
        pbeParamSpec = new PBEParameterSpec(salt, count);
    }
}
