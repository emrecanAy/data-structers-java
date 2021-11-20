package com.emrecan.KuyrukDiziVeriYapisi;

/**
 * @author Emrecan
 * @created 17/11/2021 - 15:08
 */
public class Kuyruk {

    private int K[] = new int[10];
    private int on;
    private int arka;
    private int elemanSayisi;

    public Kuyruk(){
        on = arka = elemanSayisi = 0;
    }

    public boolean bosMu(){
        return elemanSayisi == 0;
    }

    public boolean doluMu(){
        return elemanSayisi == K.length;
    }

    public int ekle(int yeni){
        if(doluMu()){
            System.out.println("Kuyruk dolu!");
            return -1;
        }
        K[arka] = yeni;
        arka++;
        if(arka == K.length){
            arka = 0;
        }
        elemanSayisi++;
        return 0;
    }

    public int cikar(){
        if(bosMu()){
            System.out.println("Kuyruk boş, çıkarma başarısız!");
            return -1;
        }
        int idx = on;
        on++;
        if(on == K.length){
            on = 0;
        }
        elemanSayisi--;
        return K[idx];
    }




}
