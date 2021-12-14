package com.emrecan.ozyineleme;

/**
 * @author Emrecan
 * @created 12/12/2021 - 16:49
 */
public class Test {

    public static void main(String[] args) {

        OzyineliToplam ozyineliToplam = new OzyineliToplam();
        OzyineliUstel ozyineliUstel = new OzyineliUstel();
        OzyineliFibonacci ozyineliFibonacci = new OzyineliFibonacci();
        OzyineliCarpim ozyineliCarpim = new OzyineliCarpim();

        System.out.println(ozyineliToplam.topla(5));
        //Beklenen Çıktı: 15

        System.out.println(ozyineliUstel.ust(2, 3));
        //Beklenen Çıktı: 8

        System.out.println(ozyineliFibonacci.fibonacci(8));
        //Beklenen Çıktı: 21
        System.out.println(ozyineliFibonacci.fibonacciFor(8));
        //Beklenen Çıktı: 21

        System.out.println(ozyineliCarpim.carp(9));
        //Beklenen Çıktı: 362880


    }
}
