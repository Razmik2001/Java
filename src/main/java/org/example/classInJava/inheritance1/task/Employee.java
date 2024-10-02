package org.example.classInJava.inheritance1.task;

public class Employee {
    private String name;
    protected double salary;
    String department;

    Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    Employee() {
        this.name = "";
        this.salary = 0.0;
        this.department = "";
    }

    Employee(Employee ob) {
        this.name = ob.name;
        this.salary = ob.salary;
        this.department = ob.department;
    }

    void display() {
        System.out.println("name : " + name);
        System.out.println("salary : " + salary);
        System.out.println("department : " + department);
    }

}
