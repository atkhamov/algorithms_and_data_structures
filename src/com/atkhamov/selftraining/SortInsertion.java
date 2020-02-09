package com.atkhamov.selftraining;

import java.util.Arrays;

public class SortInsertion {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 8, 4, 2, 1, 9, 6};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    public static int[] insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }

        return array;
    }
}
