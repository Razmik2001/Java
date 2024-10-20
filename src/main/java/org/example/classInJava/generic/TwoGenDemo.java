package org.example.classInJava.generic;

public class TwoGenDemo {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "Generic");

        tgObj.showType();

        int v = tgObj.getOb1();
        System.out.println("Values: " + v);
        String str = tgObj.getOb2();
        System.out.println("Values: " + str);

        TwoGen<String, String> x = new TwoGen<>("A", "B");

        x.showType();

        String str1 = x.getOb1();
        String str2 = x.getOb2();

        System.out.println(str1);
        System.out.println(str2);
    }
}
