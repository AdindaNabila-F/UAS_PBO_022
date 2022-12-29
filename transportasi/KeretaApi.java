package com.mycompany.transportasi;

public class KeretaApi extends Transportasi{
    public KeretaApi(String Nama){
        super(Nama);
    }
    
    public void JenisTransportasi(){
        System.out.println(super.getNama()+" merupakan jenis alat transportasi di darat");
    }
    
    public void YangMengemudikan(){
        System.out.println(super.getNama()+" yang mengemudikan yaitu seorang masinis");
    }
}