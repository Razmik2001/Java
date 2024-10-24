package org.example.HomeWork.N29.record;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car("BMW",2021);
        System.out.println("model -> " + car.model());
        System.out.println("year -> " + car.year());
        System.out.println(car.toString());
    }
}
