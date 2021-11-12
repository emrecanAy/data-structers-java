package com.emrecan.bagliListeYiginVeriYapisi;

/**
 * @author Emrecan
 * @created 10/11/2021 - 16:32
 */
public class Test {

    public static void main(String[] args) {

        YiginBagliListe y = new YiginBagliListe();

        if(y.isEmpty()) System.out.println("Yığın boş!");
        y.push(50);
        System.out.println("50 push oldu!");
        y.push(30);
        System.out.println("30 push oldu!");

        System.out.println("Yığının tepesinden çıkartılan eleman : " + y.pop());
        y.push(25);
        System.out.println("25 push oldu!");
        y.push(54);
        System.out.println("54 push oldu!");

        System.out.println("Yığının tepesinden çıkartılan eleman : " + y.pop());
        System.out.println("Yığının tepesinden çıkartılan eleman : " + y.pop());
        System.out.println("Yığının tepesindeki eleman : " + y.top());
        System.out.println("Yığının tepesinden çıkartılan eleman : " + y.pop());

        if(!y.isEmpty()){
            System.out.println("Yığının tepesinden çıkartılan eleman : " + y.pop());
        }

        if(y.isEmpty()){
            System.out.println("Yığın boş!");
        }
    }

}
