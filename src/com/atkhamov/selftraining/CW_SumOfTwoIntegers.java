package com.atkhamov.selftraining;


public class CW_SumOfTwoIntegers {
    public static void main(String[] args) {
        System.out.println(add(23, -17));
    }

    public static int add(int x, int y){
        while (y != 0){
            int carry = x & y;

            x = x ^ y;

            y = carry << 1;
        }
        return x;
    }

//    public static int add(int x, int y) {
//        if(y>0){
//            while (y>0){
//                x++;
//                y--;
//            }
//        }else {
//
//        }
//
//        return x; // Do your magic!
//    }
}
