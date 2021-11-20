package com.emrecan.bagliListeYiginVeriYapisi;

/**
 * @author Emrecan
 * @created 10/11/2021 - 16:33
 */
public class YiginBagliListe {

    private YiginDugum top;

    public YiginBagliListe(){
        top = null;
    }

    public void push(int yeniEleman){
        YiginDugum yeni = new YiginDugum(yeniEleman);
        yeni.birSonraki = top;
        top = yeni;

    }

    public boolean isEmpty(){
        if(top == null){
            return true;
        }else{
            return false;
        }
    }

    public int top(){
        if(isEmpty()){
            System.out.println("StackUnderFlow");
            return -1;
        }
        return top.veri;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("StackUnderFlow");
            return -1;
        }

        YiginDugum gecici = top;
        top = top.birSonraki;
        return gecici.veri;
    }


}
