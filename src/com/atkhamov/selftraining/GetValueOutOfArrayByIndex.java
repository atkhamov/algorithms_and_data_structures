package com.atkhamov.selftraining;

public class GetValueOutOfArrayByIndex {
    public static void main(String[] args) {
        int [] integerArray = {10, 6, 4, 23, 87, 1, 12, 1004};
        int indexOfRequiredElement = 5;

        if(indexOfRequiredElement < integerArray.length){
            int element = integerArray[indexOfRequiredElement];
            System.out.println(element);
        }
    }
}
