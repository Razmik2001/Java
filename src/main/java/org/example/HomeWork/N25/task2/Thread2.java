package org.example.HomeWork.N25.task2;

public class Thread2 implements Runnable{
    Thread thread;
    Thread2() {
        thread = new Thread(this,"Thread 2");
        System.out.println("Thread 2 start");
        thread.start();
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
