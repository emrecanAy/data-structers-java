package com.emrecan.bagliliste;

/*

    author: Emrecan AY
    student id: 132030027

*/

public class BagliListe extends BagliListeADT{


    private static Dugum ilkDugum;

    @Override
    public void basaEkle(int deger) {
         Dugum eklenecekDugum = new Dugum(deger);
         if(ilkDugum == null){
             ilkDugum = eklenecekDugum;
         }else{
             eklenecekDugum.birSonrakiDugum = ilkDugum;
             ilkDugum = eklenecekDugum;
         }
         boyut++;

    }

    @Override
    public void sonaEkle(int deger) {

        Dugum eklenecekDugum = new Dugum(deger);
        if(ilkDugum == null){
            ilkDugum = eklenecekDugum;
        }else{
            Dugum geziciDugum = ilkDugum;
            while(geziciDugum != null){
                if(geziciDugum.birSonrakiDugum != null){
                    geziciDugum = geziciDugum.birSonrakiDugum;
                }else{
                    break;
                }
            }
            geziciDugum.birSonrakiDugum = eklenecekDugum;
            eklenecekDugum.birSonrakiDugum = null;
        }
        boyut++;

    }

    @Override
    public void pozisyonaEkle(int pozisyon, int deger) {

        Dugum eklenecekDugum = new Dugum(deger);
        if(ilkDugum == null){
            ilkDugum = eklenecekDugum;
        }else{
            Dugum geziciDugum = ilkDugum; //pozisyon=1
            for(int i = 0; i < pozisyon; i++){
                if(geziciDugum != null){
                    if(geziciDugum.birSonrakiDugum != null){               //tek tek değerleri gezip sonuncuya gidene kadar(son dediğim bizim verdiğimiz pozisyona gidene kadar), her bir değeri geziciDugume atıyoruz.
                        geziciDugum = geziciDugum.birSonrakiDugum;
                    }
                }
            }
            eklenecekDugum.birSonrakiDugum = geziciDugum.birSonrakiDugum;  // eklenecek sayi'nin referansini seçtiğimiz pozisyondan bir sonraki düğümün değerini gösterecek şekilde atıyoruz.
            geziciDugum.birSonrakiDugum = eklenecekDugum;                  // geziciDugum'ün refersansı da artık biizm ekleyeceğimiz sayi'yi gösteriyor.

            //bizim eklediğimiz sayinin referansı da bir sonrakini gösteriyor.
        }
        boyut++;

    }

    @Override
    public void basiSil() {

        if(ilkDugum != null){
            Dugum geciciDugum;
            geciciDugum = ilkDugum.birSonrakiDugum;
            ilkDugum = geciciDugum;
        }
        boyut--;

    }

    @Override
    public void sonuSil() {

        if(ilkDugum == null){
            System.out.println("Data yok!");
        }
        else if(ilkDugum.birSonrakiDugum == null){
            ilkDugum = null;
        }
        else{

            Dugum geciciDugum = ilkDugum;
            Dugum sondanBirOncekiDugum = ilkDugum;

            while (geciciDugum.birSonrakiDugum != null){
                sondanBirOncekiDugum = geciciDugum;
                geciciDugum = geciciDugum.birSonrakiDugum;
            }
            sondanBirOncekiDugum.birSonrakiDugum = null;
        }
        boyut--;

    }

    @Override
    public void pozisyondanSil(int pozisyon) {

        // 1- Silinecek düğümden öncekini bul ve sakla. (oncekiDugum)

        // 2- silinecek düğümden sonrakini bul ve sakla. (sonrakiDugum)
        // seçilen pozisyonun sonrasının sonrakisi (geciciDugum.birSonrakiDugum.birSonrakiDugum)

        // 3- son olarak; seçilen düğümden bir önceki düğümün referansı, seçilen düğümden bir sonraki düğümün değerini gösterecek.
        // dolayısıyla seçilen düğüm boşta kalacak.


            Dugum geziciDugum = ilkDugum;
            Dugum pozisyondanBirOncekiDugum = ilkDugum;
            for(int i = 0; i < pozisyon; i++){
                if(geziciDugum != null){
                    pozisyondanBirOncekiDugum = geziciDugum;
                    geziciDugum = geziciDugum.birSonrakiDugum;
                }
            }
            pozisyondanBirOncekiDugum.birSonrakiDugum= geziciDugum.birSonrakiDugum;
            geziciDugum.birSonrakiDugum = null;

            boyut--;


    }

    @Override
    public Dugum pozisyondakiDugumuGetir(int pozisyon) {

        Dugum geziciDugum = ilkDugum;
        Dugum pozisyondakiDugum = ilkDugum;
        for(int i = 0; i < pozisyon; i++) {
            if (geziciDugum != null) {
                pozisyondakiDugum = geziciDugum.birSonrakiDugum;
            }
        }

        //System.out.println(pozisyondakiDugum.veri);
        return pozisyondakiDugum;

    }



    /* TEST
    public Integer pozisyondakiDugumuGetirr(int pozisyon) {

        Dugum geziciDugum = ilkDugum;
        for(int i = 0; i < pozisyon; i++) {
            if (geziciDugum != null) {
                geziciDugum = geziciDugum.birSonrakiDugum;
            }
        }
        return geziciDugum.veri;

    }
    */

    @Override
    public String elemanlariYazdir() {

        String dugumElemanlari = "";
        Dugum geziciDugum = ilkDugum;
        while (geziciDugum != null){
            dugumElemanlari += " " + geziciDugum.veri + " ";
            if(geziciDugum.birSonrakiDugum != null){
                geziciDugum = geziciDugum.birSonrakiDugum;
            }else{
                break;
            }
        }
        return dugumElemanlari;


    }

    public Dugum terstenSirala(Dugum ilkDugum){

        if (ilkDugum == null){
            return ilkDugum;
        }

        Dugum geziciDugum = ilkDugum;
        Dugum birOnceki = null;
        Dugum birSonraki = null;

        while (geziciDugum != null){
            birSonraki = geziciDugum.birSonrakiDugum;
            geziciDugum.birSonrakiDugum = birOnceki;
            birOnceki = geziciDugum;
            geziciDugum = birSonraki;
        }
        return birOnceki;



    }







}
