package org.example.HomeWork.N21;

public class Demo {
    public static void main(String[] args) {
        Animal animal;
        Cat cat = new Cat();
        Dog dog = new Dog();

        animal = cat;
        animal.eat();
        animal.sleep();
        System.out.println();

        animal = dog;
        animal.eat();
        animal.sleep();
    }
}
