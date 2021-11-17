package com.emrecan.KuyrukBagliListeVeriYapisi;

/**
 * @author Emrecan
 * @created 17/11/2021 - 16:07
 */
public class Kuyruk {

    KuyrukDugumu on;
    KuyrukDugumu arka;

    public void ekle(int yeni){
        KuyrukDugumu eklenecekDugum = new KuyrukDugumu(yeni);
        if(bosMu()){
            on = arka = eklenecekDugum;
        }else{
            arka.birSonraki = eklenecekDugum;
            arka = eklenecekDugum;
        }
    }

    public int cikar(){
        if(bosMu()){
            System.out.println("Kuyruk boş!");
            return -1;
        }
        KuyrukDugumu cikarilacakDugum = on;
        on = on.birSonraki;
        return cikarilacakDugum.veri;
    }

    public boolean bosMu(){
        return on == null;
    }


}
