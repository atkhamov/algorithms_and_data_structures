package com.atkhamov.selftraining;

public class PuppyObject {
    public static void main(String[] args) {

        //Creating an object
        PuppyConstructor myPuppy = new PuppyConstructor("Baget");

        //Calling the method #1 to set the age of the puppy
        myPuppy.setPuppyAge(2);

        //Calling the method #2 to get the age of the puppy
        myPuppy.getPuppyAge();

        //Getting the variable of the PuppyConstructor class
        System.out.println("Value of the variable: " + myPuppy.puppyAge);
    }
}
