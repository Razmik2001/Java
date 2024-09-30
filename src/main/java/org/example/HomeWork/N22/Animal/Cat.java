package org.example.HomeWork.N22.Animal;

public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("Cat eat");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleep");
    }

    public void breathe() {
        System.out.println("Cat breathe air");
    }
}
