package org.example.classInJava.encapsulation;

public class UseStatic {
    static int a = 3;
    static int b;

    static void print(int x){
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("static bloc init");
        b = a * 4;
    }

    public static void main(String[] args) {
        print(30);
    }
}
