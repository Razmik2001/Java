package org.example.HomeWork.N12;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, -5, 4, 54, 65, -8, -1};
        Sort s = new Sort();
        s.bubble(arr);
        for (var i : arr) {
            System.out.print(i + " ");
        }
    }
}
