package com.mycompany.transportasi;

public class Kapal extends Transportasi{
    public Kapal(String Nama){
        super(Nama);
    }
    
    public void JenisTransportasi(){
        System.out.println(super.getNama()+" merupakan jenis alat transportasi di air");
    }
    
    public void YangMengemudikan(){
        System.out.println(super.getNama()+" yang mengemudikan yaitu seorang nakhoda");
    }
}