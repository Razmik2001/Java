package org.example.HomeWork.N25.task4;

public class Thread2 extends Thread {
    Thread2() {
        super("Thread 2");
        start();
    }

    public void run() {
        try {
            for (int i = 10; i > 0; i--) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread 2 terminated");
        }
    }
}
