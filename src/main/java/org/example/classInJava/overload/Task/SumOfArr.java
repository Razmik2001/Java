package org.example.classInJava.overload.Task;

public class SumOfArr {

    int sum(int[] arr, int i) {
        if (i == 0) {
            return 0;
        }
        return arr[i - 1] + sum(arr, i - 1);
    }
}
