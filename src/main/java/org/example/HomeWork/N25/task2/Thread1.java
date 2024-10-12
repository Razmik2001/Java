package org.example.HomeWork.N25.task2;

public class Thread1 implements Runnable{
    Thread thread;
    Thread1() {
        thread = new Thread(this,"Thread 1");
        System.out.println("Thread 1 start");
        thread.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread 1 terminated");
        }
    }
}
