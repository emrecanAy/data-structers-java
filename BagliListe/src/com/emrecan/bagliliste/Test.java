package com.emrecan.bagliliste;

public class Test {

    public static void main(String[] args) {

        BagliListe bagliListe = new BagliListe();
        bagliListe.basaEkle(4);
        bagliListe.basaEkle(3);
        bagliListe.basaEkle(2);
        bagliListe.basaEkle(1);

        String listeElemanlari = bagliListe.elemanlariYazdir();

        System.out.println(listeElemanlari);

        bagliListe.pozisyonaEkle(2, 100);
        listeElemanlari = bagliListe.elemanlariYazdir();
        System.out.println(listeElemanlari);

        bagliListe.basiSil();
        listeElemanlari = bagliListe.elemanlariYazdir();
        System.out.println(listeElemanlari);

        //bagliListe.sonuSil();
        //listeElemanlari = bagliListe.elemanlariYazdir();
        //System.out.println(listeElemanlari);

        //bagliListe.pozisyonaEkle(2, 26);
        //listeElemanlari = bagliListe.elemanlariYazdir();
        //System.out.println(listeElemanlari);


        /* ÖDEV METODLARI */
        bagliListe.pozisyondanSil(1);
        listeElemanlari = bagliListe.elemanlariYazdir();
        System.out.println(listeElemanlari);

        bagliListe.pozisyondakiDugumuGetir(1);
        System.out.println(bagliListe.pozisyondakiDugumuGetir(1).veri);



    }

}
