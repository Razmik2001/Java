package org.example.classInJava.overload.Task;

public class Fibonacci {

    public  int fibonacci(int i)
    {
        if(i == 0){
            return 0;
        }
        if(i == 1) {
            return 1;
        }
        return fibonacci(i-1) + fibonacci(i-2);
    }

    int FibonacciNum(int target){
        int tmp = 0;
        int i = 0;
        while (tmp < target)
        {
            tmp = fibonacci(i);
            i++;
        }
        return --i;
    }
}
