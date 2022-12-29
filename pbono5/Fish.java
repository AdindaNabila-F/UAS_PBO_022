package com.mycompany.pbono5;

public class Fish extends Animal implements Pet {
    public Fish() {
        super(0);
    }
    
    private String fishName;
    
    public void eat() {
        System.out.println("Ikan makan");
    }
    
    public String getName() {
        return fishName;
    }
    
    public void setName(String name) {
        fishName = name;
    }
    
    public void play() {
        System.out.println("bermain");
    }
}