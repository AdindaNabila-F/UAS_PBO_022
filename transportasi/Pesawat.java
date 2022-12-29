package com.mycompany.transportasi;

public class Pesawat extends Transportasi{
    public Pesawat(String Nama){
        super(Nama);
    }
    
    public void JenisTransportasi(){
        System.out.println(super.getNama()+" merupakan jenis alat transportasi di udara");
    }
    
    public void YangMengemudikan(){
        System.out.println(super.getNama()+" yang mengemudikan yaitu seorang pilot");
    }
}
