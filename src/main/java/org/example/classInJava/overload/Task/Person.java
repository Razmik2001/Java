package org.example.classInJava.overload.Task;

public class Person {
    String name;
    Address address;

    Person() {
        name = "";
        address = new Address();
    }

    Person(String name, String street, String city, String zipcode) {
        this.name = name;
        address = new Address(street, city, zipcode);
    }

    Person(String name, Address ad) {
        this.name = name;
        address = new Address(ad);
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void PrintPersonWithAddress()
    {
        System.out.println(name);
        address.printAddress();
    }

}
