package org.example.HomeWork.N26;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("put your number : ");
        int i = sc.nextInt();
        int res = i&1;
        System.out.println("your number is " + ((i&1) == 1?"Odd":"even"));
    }
}
