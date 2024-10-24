package org.example.HomeWork.N29.record;

public class ProductDemo {
    public static void main(String[] args) {
        try {
            Product product1 = new Product("meat", 12.5);
            System.out.println(product1);
            Product product2 = new Product("milk", -0.5);
            System.out.println(product2);
        } catch (IllegalArgumentException e) {
            System.err.println("Error creating product: " + e.getMessage());
        }
        try {
            Product product3 = new Product("freezer", 120.0);
            System.out.println(product3);
        } catch (IllegalArgumentException e) {
            System.err.println("Error creating product: " + e.getMessage());
        }

        try {
            Product product4 = new Product("door", -25);
            System.out.println(product4);
        } catch (IllegalArgumentException e) {
            System.err.println("Error creating product: " + e.getMessage());
        }
    }
}
