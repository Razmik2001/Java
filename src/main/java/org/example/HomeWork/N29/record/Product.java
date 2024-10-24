package org.example.HomeWork.N29.record;

public record Product(String name, double price) {
    public Product {
        if (price < 0.0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
    }
}