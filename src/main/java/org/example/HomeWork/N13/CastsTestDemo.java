package org.example.HomeWork.N13;

public class CastsTestDemo {
    public static void main(String[] args) {
        CastsTest ct = new CastsTest();

        int i = 2;
        System.out.println("Calling test1 with int: ");
        ct.test1(i);

        short s = 1;
        byte b = 1;
        System.out.println("Calling test2 with short: ");
        ct.test2(s);

        System.out.println("Calling test2 with byte: ");
        ct.test2(b);

        char c = 's';
        System.out.println("Calling test3 with char: ");
        ct.test3(c);
    }
}
