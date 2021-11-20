package com.emrecan.yiginOdev;


import java.util.Stack;

/**
 * @author Emrecan Ay - 132030027
 * @created 10/11/2021 - 21:04
 */
public class YiginOdev {

    public static void main(String[] args) {

        Stack s = new Stack();
        String ifade = "2*(i+5*(7j/(4*k))";
        char[] ifadeDizi = ifade.toCharArray();

        for(int i = 0; i < ifadeDizi.length; i++ ){

            char deger = ifadeDizi[i];

            if(deger == '(' || deger == '[' || deger == '{'){
                s.push(deger);
            }

            if(deger == ')' || deger == ']' || deger == '}'){
                if(s.empty()){
                    System.out.println("Hata: Yığın boş!");
                    return;
                }else{
                    char cikarilanDeger = (char) s.pop();
                    if(cikarilanDeger != '(' && cikarilanDeger != '[' && cikarilanDeger != '{'){
                        System.out.println("Hata: Başlangıç değeriyle uyuşmuyor!");
                        return;
                    }
                }
            }
        }

        if(!s.empty()) System.out.println("Hata: Kapatma sembolü eksik!");
        else System.out.println("Başarıyla çalıştı!");

        /*
        *  Hata senaryosunda   => ifade = "2*(i+5*(7j/(4*k))"
        *  Çıktı: ("Hata: Kapatma sembolü eksik!")
        *
        *  Başarı senaryosunda => ifade = "2*(i+5*(7j/(4*k)))"
        *  Çıktı: ("Başarıyla çalıştı!")
        */
    }

}
