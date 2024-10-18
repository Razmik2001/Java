package org.example.HomeWork.N27;

class PrintTask implements Runnable {
    PrintNumbers printNumbers;

    public PrintTask(PrintNumbers printNumbers) {
        this.printNumbers = printNumbers;
    }

    @Override
    public void run() {
        synchronized (printNumbers) {
            printNumbers.print();
        }
    }
}