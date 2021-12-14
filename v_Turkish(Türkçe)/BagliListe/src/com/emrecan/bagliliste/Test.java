package com.emrecan.bagliliste;

public class Test {

    public static void main(String[] args) {

        BagliListe bagliListe = new BagliListe();

        bagliListe.sonaEkle(1);
        bagliListe.sonaEkle(2);
        bagliListe.sonaEkle(3);
        bagliListe.sonaEkle(4);
        bagliListe.sonaEkle(5);
        bagliListe.sonaEkle(6);
        String elemanlar = bagliListe.elemanlariYazdir();
        System.out.println(bagliListe.terstenSirala());



        /*
        bagliListe.basaEkle(4);
        bagliListe.basaEkle(3);
        bagliListe.basaEkle(2);
        bagliListe.basaEkle(1);

        String listeElemanlari = bagliListe.elemanlariYazdir();

        //System.out.println(listeElemanlari);

        bagliListe.pozisyonaEkle(2, 100);
        listeElemanlari = bagliListe.elemanlariYazdir();
       // System.out.println(listeElemanlari);

        bagliListe.basiSil();
        listeElemanlari = bagliListe.elemanlariYazdir();
        System.out.println(listeElemanlari);

        //bagliListe.sonuSil();
        //listeElemanlari = bagliListe.elemanlariYazdir();
        //System.out.println(listeElemanlari);

        //bagliListe.pozisyonaEkle(2, 26);
        //listeElemanlari = bagliListe.elemanlariYazdir();
        //System.out.println(listeElemanlari);

         */


        /* ÖDEV METODLARI */
        //bagliListe.pozisyondanSil(1);
        //listeElemanlari = bagliListe.elemanlariYazdir();
        //System.out.println(listeElemanlari);

        //bagliListe.pozisyondakiDugumuGetir(1);
        //System.out.println(bagliListe.pozisyondakiDugumuGetir(1).veri);

        /*
        bagliListe.sonaEkle(7);
        listeElemanlari = bagliListe.elemanlariYazdir();
        System.out.println(listeElemanlari);

        bagliListe.sonaEkle(16);
        listeElemanlari = bagliListe.elemanlariYazdir();
        System.out.println(listeElemanlari);

         */

    }

}
