package org.example.classInJava.encapsulation.utils;

import java.util.UUID;

public class CidUtils {
    public static String cid(UUID id) {
        return id.toString();
    }

    public static UUID cid(String id) {
        return UUID.fromString(id);
    }

    public static UUID randomUUID() {
        return UUID.randomUUID();
    }

    public static String randomUUIDString() {
        return UUID.randomUUID().toString();
    }
}
