package org.example.HomeWork.N12;

public class Sort {
    public  void selection(Integer[] arr) {
        int minIndex;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            swap(arr,minIndex, i);
        }
    }

    public  void swap(Integer[] arr, int index1, int index2) {
        if (index1 == index2) {
            return;
        }
        Integer tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

}
