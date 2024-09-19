package org.example.HomeWork.N19;

public class Car extends Vehicle{
    protected int countOfDoor;
    protected String model;

    Car(){
        super();
        model = "";
        countOfDoor = 0;
    }

    Car(Car ob){
        super(ob);
        model = ob.model;
        countOfDoor = ob.countOfDoor;
    }

    Car(int countOfWheel,String model,int countOfDoor){
        super(countOfWheel);
        this.model = model;
        this.countOfDoor = countOfDoor;
    }

    public void drive(){
        System.out.println("Car drive");
    }

    public void start() {
        System.out.println("Car start");
    }

    public void setCountOfDoor(int countOfDoor) {
        this.countOfDoor = countOfDoor;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCountOfDoor() {
        return countOfDoor;
    }

    public String getModel() {
        return model;
    }
}
