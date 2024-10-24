package org.example.HomeWork.N29.generic;

public class PairDemo {
    public static void main(String[] args) {
        Pair<String,Integer> person = new Pair<>("Razmik",23);
        System.out.println("person name is : " + person.getKey() + " and age is : " + person.getValue());
        person.setKey("Albert");
        person.setValue(22);
        System.out.println("person name is : " + person.getKey() + " and age is : " + person.getValue());

        System.out.println();

        Pair<Integer,Integer> person1 = new Pair<>(1,25);
        System.out.println("person Id is : " + person1.getKey() + " and age is : " + person1.getValue());
        person1.setKey(2);
        person1.setValue(22);
        System.out.println("person Id is : " + person1.getKey() + " and age is : " + person1.getValue());
    }
}
