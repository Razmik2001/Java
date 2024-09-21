package org.example.HomeWork.N20.N2;

public class Demo {
    public static void main(String[] args) {
        Lion ob1 = new Lion();
        Elephant ob2 = new Elephant();
        Monkey ob3 = new Monkey();

        Animal ref;

        ref = ob1;
        ref.feed();
        ref.move();
        ref.makeSound();
        System.out.println();

        ref = ob2;
        ref.feed();
        ref.move();
        ref.makeSound();
        System.out.println();

        ref = ob3;
        ref.feed();
        ref.move();
        ref.makeSound();
    }
}
