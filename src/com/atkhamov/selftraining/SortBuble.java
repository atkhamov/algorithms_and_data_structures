package com.atkhamov.selftraining;

import java.util.Arrays;

public class SortBuble {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 2, 6};

        System.out.println(Arrays.toString(bubbleSort(arr)));

    }
    public static int[] bubbleSort(int[] array){
        boolean sorted = false;
        int temp;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < array.length -1; i++){
                if(array[i] > array[i+1]){
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }
}
