package org.example.classInJava.overload;

public class CallByValue {
    public static void main(String[] args) {
        Test test = new Test(12, 23);
        int i = 10, j = 20;
        test.math(i, j);
        System.out.println(i + " " + j);
    }
}
