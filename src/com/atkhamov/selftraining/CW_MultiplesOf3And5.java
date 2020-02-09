package com.atkhamov.selftraining;

public class CW_MultiplesOf3And5 {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    /**This is the first solution*/
//    public static int solution(int number) {
//        int sum = IntStream.range(0, number)
//                .filter(x -> x % 3 ==0 || x % 5 == 0)
//                .sum();
//        return sum;
//    }

    /**This is the second solution*/
    public static int solution(int number){
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        return sum;
    }
}
