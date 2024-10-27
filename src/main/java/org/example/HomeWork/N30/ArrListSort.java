package org.example.HomeWork.N30;

import java.util.ArrayList;
import java.util.Collection;

public class ArrListSort {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        // Add an element at the end.
        for (int i = 10; i >= 0; i--) {
            arr.add(Integer.toString(i));
        }
        System.out.println("arr before sort : " + arr);

        arr.sort(String::compareTo);

        System.out.println("arr after sort : " + arr);

    }
}
