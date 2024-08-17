package org.example.HomeWork.N5;

public class Task1 {
    public static void main(String[] args) {
        int a = 10;
        //b = a--
        int b;
        int tmp = a;
        a-=1;
        b = tmp;
        System.out.println(b);
        //b = --a
        a-=1;
        b = a;
        System.out.println(b);
    }
}
