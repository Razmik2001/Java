package org.example.HomeWork.N22.Animal;

public interface Animal {
    void eat();
    void sleep();

    default void breathe(){
        System.out.println("All animals breathe air");
    }
}
