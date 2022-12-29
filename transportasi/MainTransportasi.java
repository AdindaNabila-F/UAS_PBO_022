package com.mycompany.transportasi;

public class MainTransportasi {
    private static Object ketiga;

    public static void main(String[] args) {
        Transportasi pertama = new Pesawat ("Pesawat");
        pertama.JenisTransportasi();
        pertama.YangMengemudikan();
        
        System.out.println("=====================================================");
        Transportasi kedua = new Kapal ("Kapal");
        kedua.JenisTransportasi();
        kedua.YangMengemudikan();
        
        System.out.println("=====================================================");
        Transportasi ketiga = new KeretaApi ("Kereta Api");
        ketiga.JenisTransportasi();
        ketiga.YangMengemudikan();
                
    }
}