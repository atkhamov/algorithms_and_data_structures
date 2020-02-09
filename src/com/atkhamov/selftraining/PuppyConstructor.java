package com.atkhamov.selftraining;

public class PuppyConstructor {

    int puppyAge;

    public PuppyConstructor(String name){
        //This is a constructor and it has one parameter - 'name'
        System.out.println("Assigning name: " + name);
    }

    //method #1 of this class
    public void setPuppyAge(int age){
        puppyAge = age;
    }

    //method #2 of this class
    public int getPuppyAge(){
        System.out.println("Age of the puppy: " + puppyAge);
        return puppyAge;
    }
}
