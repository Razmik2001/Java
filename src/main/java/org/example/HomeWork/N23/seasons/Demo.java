package org.example.HomeWork.N23.seasons;

public class Demo {
    public static void main(String[] args) {
        for (Seasons s : Seasons.values()) {
            System.out.println("In " + s + " " + s.getText());
        }
    }
}
