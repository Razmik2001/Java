package org.example.HomeWork.N21;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleep");
    }
}