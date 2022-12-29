package com.mycompany.pbono5;

public class Cat  extends Animal implements Pet{
    private String catName;
    
    public Cat(){
        this("");
    }
    
    public Cat(String name){
        catName=name;
    }
   
    public void eat (){
        System.out.println("Kucing makan");
    }
    
    public String getName() {
        return catName;
    }
     
    public void setName(String name) {
        catName=name;
    }
    
    public void play() {       
        System.out.println("bermain");
    }
}