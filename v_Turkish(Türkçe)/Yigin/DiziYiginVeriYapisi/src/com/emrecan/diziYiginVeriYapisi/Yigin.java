package com.emrecan.diziYiginVeriYapisi;

/**
 * @author Emrecan
 * @created 10/11/2021 - 15:23
 */
public class Yigin {

    private int MAX_SIZE = 100; // Maksimum eleman sayısı
    private int[] yigin; // Yığın elemanlarını tutan dizi
    private int count; // Anlık eleman sayısı

    public Yigin(){
        yigin = new int[MAX_SIZE];// Maksimum eleman sayısı ile yigin dizisi oluştur.
        count = 0;// Başlangıçta yığın içerisinde hiç eleman olmadığından sayacı 0'dan başlattık.
    }


    /**
     * Yığın boş mu kontrol eder.
     * @return boşsa boolean true dondürür.
     */
    public boolean isEmpty(){
        return (count < 1);
    }


    /**
     * Yığın dolu mu kontrol eder.
     * @return dolu ise true döndürür.
     */
    public boolean isFull(){
        return count == MAX_SIZE - 1;
    }


    /**
     * Yığına yeni eleman eklemeye yarar, yığın doluysa -1 döndürür. Yığında yer varsa eleman eklenir ve 0 döndürür.
     * @param yeniEleman
     * @return
     */
    public int push(int yeniEleman){
        if(isFull()){ //Yığın doluysa
            System.out.println("StackOverFlow"); //hoop yığın dolu karşim
            return -1;
        }
        yigin[count] = yeniEleman;
        count++;
        return 0;
    }


    /**
     * Yığından eleman çıkartmaya yarar. Yığın boşsa -1 döner.
     * Değilse eleman çıkartılır ve değeri döndürülür.
     * @return
     */
    public int pop(){
        if(isEmpty()){
            System.out.println("StackUnderFlow");
            return -1;
        }

        int idx = count - 1;
        count--;

        return yigin[idx];
    }

    public int top(){
        if(isEmpty()){
            System.out.println("StackUnderFlow");
            return -1;
        }

        return yigin[count - 1];
    }





}
