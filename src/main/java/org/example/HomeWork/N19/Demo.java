package org.example.HomeWork.N19;

public class Demo {
    public static void main(String[] args) {
        // Testing Vehicle class
        Vehicle vehicle = new Vehicle();
        vehicle.setCountOfWheel(4);
        System.out.println("Vehicle Count of Wheels: " + vehicle.getCountOfWheel());
        vehicle.start();

        // Testing Car class
        Car car = new Car(4, "Sedan", 4);
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Count of Wheels: " + car.getCountOfWheel());
        System.out.println("Car Count of Doors: " + car.getCountOfDoor());
        car.start();
        car.drive();

        // Testing ElectricCar class
        ElectricCar electricCar = new ElectricCar(4, "Tesla", 4, 75.0);
        System.out.println("Electric Car Model: " + electricCar.getModel());
        System.out.println("Electric Car Count of Wheels: " + electricCar.getCountOfWheel());
        System.out.println("Electric Car Count of Doors: " + electricCar.getCountOfDoor());
        System.out.println("Electric Car Battery Volume: " + electricCar.getBatteryVol());
        electricCar.start();
        electricCar.drive();
        electricCar.charge();
    }
}
