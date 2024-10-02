package org.example.classInJava.overload.Task;

public class Address {
    String street;
    String city;
    String zipcode;

    Address() {
        street ="";
        city = "" ;
        zipcode = "";
    }

    Address(String street, String city, String zipcode) {
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
    }

    Address(Address ad) {
        city = ad.getCity();
        street = ad.getStreet();
        zipcode = ad.getZipcode();
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void printAddress() {
        System.out.println(getCity());
        System.out.println(getStreet());
        System.out.println(getZipcode());
    }
}
