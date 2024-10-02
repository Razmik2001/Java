package org.example.classInJava.overload;

public class RecursionTest {
    int[] val;

    RecursionTest(int i) {
        val = new int[i];
    }

    void printArray(int i) {
        if (i == 0) {
            return;
        }
        else{
            printArray(i - 1);
        }
        System.out.println("[" + (i - 1) + "] = " + val[i - 1]);
    }
}
