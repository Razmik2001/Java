package org.example.HomeWork.N26;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("put your number : ");
        int i = sc.nextInt();
        int count = 0;
        while(i != 0)
        {
            count += ((i&1) == 1)?1:0;
            i >>= 1;
        }
        System.out.println("your number have " + count + " '1' in bit type");
    }
}
