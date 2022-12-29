package com.mycompany.transportasi;

public abstract class Transportasi implements DataTransportasi{
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public Transportasi(String Nama){
        nama = Nama;
    }
    
    @Override
    public void JenisTransportasi(){
        System.out.println("Belum Diketahui");
    }
    
    @Override
    public void YangMengemudikan(){
        System.out.println("Bekum Diketahui");
    }
}