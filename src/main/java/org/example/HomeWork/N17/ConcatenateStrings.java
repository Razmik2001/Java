package org.example.HomeWork.N17;

public class ConcatenateStrings {
    static String concatenateStrings1(int repeat, String... strings) {
        String concat = "";
        for (String str : strings) {
            for (int i = 0; i < repeat; i++) {
                concat += str;
            }
        }
        return concat;
    }

    static String concatenateStrings2(int repeat, String... strings) {
        String concat = "";
        for (int i = 0; i < repeat; i++) {
            for (String str : strings) {
                concat += str;
            }
        }
        return concat;
    }

}
