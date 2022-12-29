package com.mycompany.pbono5;

public abstract class Animal {
   protected int legs;
   protected Animal(int legs){
       this.legs=legs;   
}
   
   public void walk(){
       System.out.println("Hewan ini berjalan dengan menggunakan "+legs+" legs.");
   }
   
    public abstract void eat();
}   