package org.example.HomeWork.N25.task3;


public class Demo {
    public static void main(String[] args) {
        PriorityThread first = new PriorityThread("first");
        PriorityThread second = new PriorityThread("second");
        PriorityThread third = new PriorityThread("third");

        first.setPriority(Thread.MIN_PRIORITY);
        second.setPriority(Thread.NORM_PRIORITY);
        third.setPriority(Thread.MAX_PRIORITY);

        first.start();
        second.start();
        third.start();
    }
}
