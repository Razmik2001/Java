package org.example.HomeWork.N8;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (num <= 0) {
            System.out.print("get an positive integer number:");
            num = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                int res = 1;
                for (int k = 1; k <= i; k++) {
                    res *= k;
                }
                for (int k = 1; k <= j; k++) {
                    res /= k;
                }
                for (int k = 1; k <= (i - j); k++) {
                    res /= k;
                }
                System.out.print(res + " ");
            }
            System.out.println();
        }
    }
}
