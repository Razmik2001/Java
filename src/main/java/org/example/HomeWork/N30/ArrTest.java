package org.example.HomeWork.N30;

import java.util.ArrayList;

public class ArrTest {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        // Add an element at the end.
        for (int i = 0; i < 10; i++) {
            arr.add(Integer.toString(i));
        }
        System.out.println("after add in end :" + arr);
        System.out.println();
        //Add an element at a specific index.
        arr.add(3, "2.5");
        System.out.println("after add at a specific index (3,'2.5'):" + arr);
        System.out.println();

        //Remove an element by its value.
        arr.remove("5");
        System.out.println("after a remove an element by its value '5':" + arr);
        System.out.println();

        //Remove an element by its index.
        arr.remove(4);
        System.out.println("after a remove an element by its index '4' :" + arr);
        System.out.println();

        //Retrieve an element from a specific index.
        String s = arr.get(2);
        System.out.println(arr);
        System.out.println("after a Retrieve an element from a specific index '2' :" + s);
        System.out.println();

        // Modify an element at a given index.
        arr.set(0, "0.5");
        System.out.println("after a Modify an element at a given index '0' :" + arr);
        System.out.println();

        //Check if an element exists
        System.out.println("is element '0' exists : " + arr.contains("0"));
    }
}
