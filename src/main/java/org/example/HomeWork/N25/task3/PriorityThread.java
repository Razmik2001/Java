package org.example.HomeWork.N25.task3;

public class PriorityThread extends Thread {
    PriorityThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " priority is "
                + Thread.currentThread().getPriority());
    }
}
