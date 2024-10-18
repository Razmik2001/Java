package org.example.HomeWork.N27;

public class SyncExample {
    public static void main(String[] args) {
        PrintNumbers printNumbers = new PrintNumbers();
        Thread t1 = new Thread(new PrintTask(printNumbers), "Thread 1");
        Thread t2 = new Thread(new PrintTask(printNumbers), "Thread 2");
        Thread t3 = new Thread(new PrintTask(printNumbers), "Thread 3");
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
    }
}