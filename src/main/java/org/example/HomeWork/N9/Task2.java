package org.example.HomeWork.N9;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int roteCount = 3;
        roteCount = arr.length - roteCount;
        int[] roteArr = new int[arr.length];
        for (int i : roteArr) {
            if (roteCount == arr.length) {
                roteCount = 0;
            }
            i = arr[roteCount];
            roteCount++;
            System.out.print(i + " ");
        }

    }
}
