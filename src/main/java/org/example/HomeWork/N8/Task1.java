package org.example.HomeWork.N8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("get an integer number:");
        int num = sc.nextInt();
        sc.close();
        int count = (int) Math.log10(num) + 1;
        int res = num;
        for (int i = 0; i < count; i++) {
            res -= (int) Math.pow(num%10,count);
            num/=10;
        }

        System.out.println("it is" + ((res == 0)?"":"n't")  + " an Armstrong");
    }
}
