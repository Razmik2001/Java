package org.example.classInJava.overload;

public class Factorial {

    int fact(int n) {
        int res;
        if (n == 1) {
            return 1;
        }
        res = fact(n - 1) * n;
        return res;
    }
}
