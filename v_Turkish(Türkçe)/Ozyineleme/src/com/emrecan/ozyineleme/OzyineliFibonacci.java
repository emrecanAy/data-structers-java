package com.emrecan.ozyineleme;

/**
 * @author Emrecan
 * @created 12/12/2021 - 16:57
 */
public class OzyineliFibonacci {

    public int fibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fibonacci(n-1) + fibonacci(n-2);
    }

    //Fibonacci'yi bir de for döngüsüyle yazalım.
    public int fibonacciFor(int n){
        int sayi1 = 0;
        int sayi2 = 0;
        int toplam = 0;

        if(n == 0) return 0;
        if(n == 1) return 1;

        for (int i = 1; i < n; i++){
            toplam = sayi1 + sayi2;
            sayi1 = sayi2;
            sayi2 = toplam;
        }
        return toplam;
    }



}
