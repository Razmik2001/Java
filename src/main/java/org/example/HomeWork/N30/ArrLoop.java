package org.example.HomeWork.N30;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrLoop {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr.add(Integer.toString(i));
        }


        System.out.println("A for loop");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        System.out.println("An enhanced for loop");
        for (String i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("The Iterator interface");
        Iterator<String> iterator = arr.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.println("The forEach method with a lambda expression");
        arr.forEach(num -> System.out.print(num + " "));
    }
}
