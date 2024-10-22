package org.example.HomeWork.N28;

public class BoxDemo {
    public static void main(String[] args) {
        Box<Integer> iBox = new Box<>(88);
        System.out.println("in iBox we have " + iBox.getOb());
        Integer ob = iBox.getOb();

        Box<String> sBox = new Box<>("six");
        System.out.println("in iBox we have " + sBox.getOb());
        String st = sBox.getOb();
    }
}
