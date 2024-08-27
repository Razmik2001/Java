package org.example.HomeWork.N9;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, -1, 5, 7, 6, 9};
        int min = arr[0];
        for (int i : arr) {
            min = Math.min(i, min);
        }
        boolean isThere;
        do {
            isThere = false;
            for (int i : arr) {
                if (min == i) {
                    isThere = true;
                    min++;
                    break;
                }
            }
        } while (isThere);
        System.out.println("Missing Number = " + min);
    }
}
