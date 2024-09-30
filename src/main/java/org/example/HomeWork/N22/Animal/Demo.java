package org.example.HomeWork.N22.Animal;

public class Demo {
    public static void main(String[] args) {
        Animal animal;
        Cat cat = new Cat();
        Dog dog = new Dog();


        animal = cat;
        animal.eat();
        animal.sleep();
        animal.breathe();
        System.out.println();

        animal = dog;
        animal.eat();
        animal.sleep();
        animal.breathe();
    }
}
