package org.example.HomeWork.N23.seasons;

public enum Seasons {
    WINTER("time for winter adventures!"),
    SPRING("time for spring blossoms! "),
    SUMMER("time for summer sunshine!"),
    AUTUMN("time for autumn harvests!");
    private String text;

    Seasons(String text) {
        this.text = text;
    }

    String getText() {
        return text;
    }
}
