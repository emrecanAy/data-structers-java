package com.emrecan.bagliliste;

public abstract class BagliListeADT {

    public Dugum ilkDugum;
    public int boyut = 0;
    public abstract void basaEkle(int deger);
    public abstract void sonaEkle(int deger);
    public abstract void pozisyonaEkle(int pozisyon, int deger);
    public abstract void basiSil();
    public abstract void sonuSil();
    public abstract void pozisyondanSil(int pozisyon);
    public abstract Dugum pozisyondakiDugumuGetir(int pozisyon);
    public abstract String elemanlariYazdir();

}


