package com.atkhamov.selftraining;

import java.util.Arrays;
import java.util.stream.IntStream;

public class greet {
    public static void main(String[] args){
        int[] numArr = {1, 2, 2};
        System.out.println(squareSum(numArr));
        System.out.println(squareSumTwo(numArr));
        System.out.println(squareSumThree(numArr));
    }

    //First Solution
    public static int squareSum(int[] numbers){
        int sum = 0;
        for(int n : numbers){
            sum += n * n;
        }
        return sum;
    }

    //Second Solution
    public static int squareSumTwo(int[] n){
        return IntStream.of(n).map(operand -> (int) Math.pow(operand, 2)).sum();
    }

    //Third Solution
    public static int squareSumThree(int[] n){
        return Arrays.stream(n).reduce(0, (a, b) -> a + b * b);
    }
}
