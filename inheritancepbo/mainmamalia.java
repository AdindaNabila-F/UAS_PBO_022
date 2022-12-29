package com.mycompany.inheritancepbo;

public class mainmamalia {

    public static void main(String[] args) {
        
        System.out.println("=== Program Inheritance Hewan Mamalia ===");
        
        mamalia mama=new mamalia ();
        kucing  hewan= new kucing();
        lumbalumba binatang = new lumbalumba();
        
        System.out.println("Kucing berjenis tulang : "+hewan.tulang);
        mama.tulang();
        
        System.out.println("Lumba-lumba bernafas dengan : "+binatang.nafas);
        mama.bernafas();
        
        hewan.habitat();
        binatang.habitat();
    }
}