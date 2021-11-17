package com.emrecan.KuyrukBagliListeVeriYapisi;

/**
 * @author Emrecan
 * @created 17/11/2021 - 16:18
 */
public class Test {

    public static void main(String[] args) {

        Kuyruk k = new Kuyruk();

        if(k.bosMu()){
            System.out.println("Kuyruk boş!");
        }
        k.ekle(5);
        k.ekle(49);
        k.ekle(55);

        System.out.println("Kuyruktan çıkan eleman: " + k.cikar());

        k.ekle(44);
        k.ekle(11);
        k.ekle(77);
        k.ekle(87);
        k.ekle(52);
        k.ekle(35);
        k.ekle(57);
        k.ekle(20);
        k.ekle(23);


        System.out.println("Kuyruktan çıkan eleman: " + k.cikar());
        System.out.println("Kuyruktan çıkan eleman: " + k.cikar());
        System.out.println("Kuyruktan çıkan eleman: " + k.cikar());
        System.out.println("Kuyruktan çıkan eleman: " + k.cikar());
        System.out.println("Kuyruktan çıkan eleman: " + k.cikar());
        System.out.println("Kuyruktan çıkan eleman: " + k.cikar());
        System.out.println("Kuyruktan çıkan eleman: " + k.cikar());
        System.out.println("Kuyruktan çıkan eleman: " + k.cikar());
        System.out.println("Kuyruktan çıkan eleman: " + k.cikar());
        System.out.println("Kuyruktan çıkan eleman: " + k.cikar());
        System.out.println("Kuyruktan çıkan eleman: " + k.cikar());
        System.out.println("Kuyruktan çıkan eleman: " + k.cikar());

    }

}
