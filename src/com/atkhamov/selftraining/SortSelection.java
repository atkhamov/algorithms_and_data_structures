package com.atkhamov.selftraining;

import java.util.Arrays;

public class SortSelection {
    public static void main(String[] args) {
        int [] integerArray = {10, 6, 4, 23, 87, 1, 12, 1004};
        System.out.println(Arrays.toString(selectionSort(integerArray)));
    }

    public static int[] selectionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for(int j = i+1; j < array.length; j++){
                if(array[j] < min){
                    min = array[j];
                    minId = j;
                }
            }
            //замена
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }

        return array;
    }
}
