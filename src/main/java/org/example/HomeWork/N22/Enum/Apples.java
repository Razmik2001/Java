package org.example.HomeWork.N22.Enum;

public enum Apples {
    JONATHAN(10.25, "USA"),
    GOLDEN_DEL(12.0, "Canada"),
    RED_DEL(15.25, "France"),
    WINESAP(8.5, "Australia"),
    CORTLAND(9.75, "UK");

    private double price;
    private String location;

    Apples(double price, String location) {
        this.price = price;
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public String getLocation() {
        return location;
    }

    public void displayInfo() {
        System.out.println(" Price: " + price + "$ | Location: " + location);
    }
}
