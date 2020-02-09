package com.atkhamov.selftraining;

/**
 * The first century spans from the year 1 up to and including the year 100,
 * The second - from the year 101 up to and including the year 200, etc.
 *
 * Task :
 * Given a year, return the century it is in.
 * */


public class CenturyFromYear {
    public static void main(String[] args){
        int year = 1900;
        System.out.println(century(year));
    }

    public static int century(int number){
        if(number%100 == 0){
            return number/100;
        }else{
            return number/100+1;
        }
    }
}
