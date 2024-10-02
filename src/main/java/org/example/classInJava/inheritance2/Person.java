package org.example.classInJava.inheritance2;

public class Person {
    String name;
    int age;

    Person() {
        name = "";
        age = 0;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(Person ob) {
        this.name = ob.name;
        this.age = ob.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void display(){
        System.out.println("name : " + name);
        System.out.println("age : " + age);
    }
}
