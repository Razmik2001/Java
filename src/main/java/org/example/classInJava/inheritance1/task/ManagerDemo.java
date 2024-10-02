package org.example.classInJava.inheritance1.task;

public class ManagerDemo {
    public static void main(String[] args) {
        Manager m = new Manager("Razmik", 10000, "Gyux");
        m.display();
        m.ChangeSalary(50);
        m.display();
    }
}
