package com.zipcodewilmington;

public class Dog {

    private String name;
    private String breed;


    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    public Dog(String name){
        this.name = name;
        this.breed = "unknown";
    }


}
