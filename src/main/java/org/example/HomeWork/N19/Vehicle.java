package org.example.HomeWork.N19;

public class Vehicle {
    protected int countOfWheel;

    Vehicle() {
        countOfWheel = 0;
    }

    Vehicle(Vehicle ob) {
        countOfWheel = ob.countOfWheel;
    }

    Vehicle(int countOfWheel) {
        this.countOfWheel = countOfWheel;
    }

    public void setCountOfWheel(int countOfWheel) {
        this.countOfWheel = countOfWheel;
    }

    public int getCountOfWheel() {
        return countOfWheel;
    }

    public void start() {
        System.out.println("Vehicle start");
    }
}
