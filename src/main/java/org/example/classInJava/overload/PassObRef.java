package org.example.classInJava.overload;

public class PassObRef {
    public static void main(String[] args) {
        Test test = new Test(10, 20);
        System.out.println(test.a + "  " + test.b);
        test.math(test);
        System.out.println(test.a + "  " + test.b);
    }
}
