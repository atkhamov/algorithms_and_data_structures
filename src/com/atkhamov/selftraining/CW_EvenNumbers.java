package com.atkhamov.selftraining;

import java.util.Arrays;

public class CW_EvenNumbers {
    public static void main(String[] args) {
        int[] testArr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(divisibleBy(testArr, 2)));


    }

    /**The following is my solution*/
//    public static List<Integer> divisibleBy(int[] numbers, int divider) {
//        List<Integer> temp = new ArrayList<>();
//        for(int i = 0; i < numbers.length; i++){
//            if(numbers[i] % divider == 0){
//                temp.add(numbers[i]);
//            }
//        }
//        return temp;
//    }

    /**The following is the alternative solution*/
//    public static int[] divisibleBy(int[] numbers, int divider){
//        return Arrays.stream(numbers).filter(n -> n % divider == 0).toArray();
//    }

    /**Another solution*/
    public static int[] divisibleBy(int[] numbers, int divider){
        int divisibleCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % divider == 0){
                divisibleCount++;
            }
        }

        int[] resArr = new int[divisibleCount];
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % divider == 0){
                resArr[j++] = numbers[i];
            }
        }

        return resArr;
    }
}
