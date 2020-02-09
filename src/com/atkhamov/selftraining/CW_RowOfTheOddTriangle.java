package com.atkhamov.selftraining;

import java.util.Arrays;

public class CW_RowOfTheOddTriangle {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(oddRow(29)));
    }

    public static long[] oddRow(int n){
        long[] arr = new long[n];
        for(int i=0, j=0; i<2*n; i+=2, j++){
            arr[j] = (long) n*(n-1)+1+i;
        }
        return arr;
    }
}
