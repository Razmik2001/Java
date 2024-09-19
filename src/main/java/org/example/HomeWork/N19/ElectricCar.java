package org.example.HomeWork.N19;

public class ElectricCar extends Car {
    protected Double batteryVol;

    ElectricCar() {
        super();
        batteryVol = 0.0;
    }

    ElectricCar(int countOfWheel,String model,int countOfDoor,double batteryVol) {
        super(countOfWheel,model,countOfDoor);
        this.batteryVol = batteryVol;
    }

    ElectricCar(ElectricCar ob) {
        super(ob);
        batteryVol = ob.batteryVol;
    }

    public void drive(){
        System.out.println("ElectricCar drive");
    }

    public void start() {
        System.out.println("ElectricCar start");
    }

    public void charge() {
        System.out.println("ElectricCar charge");
    }

    public void setBatteryVol(Double batteryVol) {
        this.batteryVol = batteryVol;
    }

    public Double getBatteryVol() {
        return batteryVol;
    }
}
