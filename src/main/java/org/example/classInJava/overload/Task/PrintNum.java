package org.example.classInJava.overload.Task;

public class PrintNum {

    void print(int n) {
        System.out.println(n);
        if (n == 1) {
            return;
        }
        print(n - 1);
    }
}
