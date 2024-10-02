package org.example.classInJava.encapsulation;

public class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();
        ob.a = 10;
        ob.b = 20;
//        ob.c=100;
        ob.setC(100);

        System.out.println("a: " + ob.a + "\nb: " + ob.b + "\nc: " + ob.getC());
    }
}
