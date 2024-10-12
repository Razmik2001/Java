package org.example.HomeWork.N25.task4;

public class Thread1 extends Thread {
    Thread1() {
        super("Thread 1");
        start();
    }

    public void run() {
        try {
            for (int i = 1; i < 11; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread 1 terminated");
        }
    }
}
