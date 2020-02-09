package com.atkhamov.selftraining;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CW_MyHeadIsAtTheWrongEnd {
    public static void main(String[] args) {
        String[] testArr = { "tail", "body", "head" };
        System.out.println(Arrays.toString(fixTheMeerkat(testArr)));
    }

    /**This is the first solution*/
//    public static String[] fixTheMeerkat(String[] arr) {
//        List<String> tempList = Arrays.asList(arr);
//        Collections.reverse(tempList);
//        return (String[]) tempList.toArray();
//    }

    /**This is the second solution*/
    public static String[] fixTheMeerkat(String[] arr){

        String[] resArr = new String[arr.length];
        int index = 0;
        for(int i = arr.length-1; i >= 0; i--){
            resArr[index] = arr[i];
            index++;
        }
        return resArr;
    }
}
