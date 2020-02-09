package com.atkhamov.selftraining;

public class SearchLinear {
    public static void main(String[] args) {
        int[] array = {800, 345, 977, 40, 12, -183, 234, 15};
        int elementToFind = 234;
        System.out.println("Element " + elementToFind + " found at index: " +
                linearSearch(array, elementToFind));
    }

    public static int linearSearch(int[] array, int key){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key){
                return i;
            }
        }

        return -1;
    }
}
