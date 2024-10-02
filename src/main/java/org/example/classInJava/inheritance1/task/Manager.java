package org.example.classInJava.inheritance1.task;

public class Manager extends Employee{

    void ChangeSalary(double percent){
        salary = salary * (1 + percent/100);
    }

    Manager(String name, double salary, String department){
        super(name,salary,department);
    }
}
