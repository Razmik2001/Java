package org.example.HomeWork.N30;

import java.util.ArrayList;
import java.util.Collection;

public class ArrListMaxMin {
    public static void main(String[] args) {
        ArrayList<Integer> aOb = new ArrayList<>();

        for (int i = 11; i < 20; i++) {
            aOb.add(i);
        }

        System.out.println("Max in aOb is " + aOb.stream().max(Integer::compareTo));
        System.out.println("Min in aOb is " + aOb.stream().min(Integer::compareTo));

    }
}
