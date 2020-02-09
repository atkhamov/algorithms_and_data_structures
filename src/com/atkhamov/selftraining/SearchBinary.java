package com.atkhamov.selftraining;

public class SearchBinary {
    public static void main(String[] args) {
        int[] array = {-183, 12, 15, 40, 234, 345, 800, 977800, 345, 977};
        int elementToFind = 977800;
        System.out.println("Element " + elementToFind + " found at index: " +
                binarySearch(array, elementToFind, 0, array.length-1));
    }



    public static int binarySearch(int[] sortedArray, int elementToFind, int low, int high){
        if(low > high){
            return -1;
        }

        int mid = low + (high - low) / 2;

        if(elementToFind < sortedArray[mid]){
            return binarySearch(sortedArray, elementToFind, low, mid - 1);
        }else if(elementToFind > sortedArray[mid]){
            return binarySearch(sortedArray, elementToFind, mid + 1, high);
        }else {
            return mid;
        }
    }
}
