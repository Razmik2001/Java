package org.example.classInJava.encapsulation.utils;


import java.util.UUID;

public class CidUtilsDemo {
    public static void main(String[] args) {
        UUID uuid = CidUtils.randomUUID();
        System.out.println(uuid);

        System.out.println(CidUtils.cid(uuid));
    }
}
