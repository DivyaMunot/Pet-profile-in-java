package com.skyroute66.petprofilersolution;

public class Pet {
    
    protected String name = "";
    protected int age = 0;
    
    public Pet(String someName, int someAge) {
        
        name = someName;
        age = someAge;
    }
    
    public Pet(String someName, int someAge, int someMultiplier) {
        name = someName;
        age = someAge;
        ageMultiplier = someMultiplier;
    }

    
    public String selfDescribe() {
 
        return "Hello, my name is " + name + ". I am " + calculateRealAge() + " in human years.";
    }
    
    public int calculateRealAge() {
        return age * ageMultiplier;
    }
    
}
