package org.example.HomeWork.N25.task1;

public class Thread2 extends  Thread{
    Thread2() {
        super("Thread 2");
        start();
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread 2 terminated");
        }
    }
}
