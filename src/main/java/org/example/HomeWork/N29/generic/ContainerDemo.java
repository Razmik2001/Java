package org.example.HomeWork.N29.generic;

public class ContainerDemo {
    public static void main(String[] args) {
        ItemContainer<Integer> intContainer = new ItemContainer<>(42);
        System.out.println("Integer item: " + intContainer.getItem());

        ItemContainer<Double> doubleContainer = new ItemContainer<>(3.14);
        System.out.println("Double item: " + doubleContainer.getItem());

        ItemContainer<String> stringContainer = new ItemContainer<>("Hello, Generics!");
        System.out.println("String item: " + stringContainer.getItem());
    }
}