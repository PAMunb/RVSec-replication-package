package com.minimals.iv.baseCase;

import javax.crypto.spec.IvParameterSpec;

public class BaseStaticIV {
    public static void main(String[] args) {
        byte[] bytes = "Hello".getBytes();
        IvParameterSpec ivSpec = new IvParameterSpec(bytes);
        System.out.println(new String(ivSpec.getIV()));
        System.out.println(new String(bytes));
    }
}
