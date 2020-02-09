package com.atkhamov.selftraining;

public class SumOfValuesOfArray {
    public static void main(String[] args) {
        int [] integerArray = {10, 6, 4, 23, 87, 1, 12, 1004};
        int sum = 0;

        for(int i = 0; i < integerArray.length; i++){
            sum += integerArray[i];
        }

        System.out.println(sum);
    }
}
