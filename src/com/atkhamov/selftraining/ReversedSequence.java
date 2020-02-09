package com.atkhamov.selftraining;

import java.util.Arrays;

public class ReversedSequence {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(Arrays.toString(reverse(a)));
    }

    public static int[] reverse(int n){
        int[] res = new int[n];
        for(int i=0; i<n; i++) {
            res[i] = n - i;
        }
        return res;
    }
}
