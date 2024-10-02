package org.example.classInJava.overload.Task;

public class Demo {
    public static void main(String[] args) {
//        PrintNum pn = new PrintNum();
//        pn.print(10);
//        int[] val = new int[10];
//
//        for (int i = 0; i < 10; i++) {
//            val[i] = i;
//        }
//
//        SumOfArr soa = new SumOfArr();
//        int res = soa.sum(val, val.length);
//        System.out.println(res);

        Fibonacci f = new Fibonacci();
        System.out.println(f.fibonacci(55));
        System.out.println("55 is the " + f.FibonacciNum(55) + " number of Fibonacci");
    }
}
