package org.example.HomeWork.N7;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("write in what order from the Fibonacci numbers you wont:");
        byte tact = sc.nextByte();
        int prePre = 1;
        int pre = 1;
        int fibonachi = 1;
        while (tact > 2) {
            fibonachi = prePre + pre;
            prePre = pre;
            pre = fibonachi;
            --tact;
        }
        System.out.println(tact>=0?"your number is " + fibonachi:"wrong number");
    }
}
