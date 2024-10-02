package org.example.classInJava.overload;

public class Recursion2 {
    public static void main(String[] args) {
        RecursionTest ob = new RecursionTest(10);

        for (int i = 0; i < 10; i++) {
            ob.val[i] = i;
        }
        ob.printArray(10);
    }
}
