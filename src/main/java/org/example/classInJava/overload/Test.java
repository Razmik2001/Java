package org.example.classInJava.overload;

public class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equals(Test o) {
        return o.a == a && o.b == b;
    }

    public void math(int i, int j) {
        i *= 2;
        j *= 2;
//        System.out.println(i + "  " + j);
    }

    public void math(Test ob) {
        ob.a *= 3;
        ob.b /= 2;
    }

    Test(int i) {
        a = i;
    }

    public Test incrementByTen() {
        return new Test(a+10);
    }
}
