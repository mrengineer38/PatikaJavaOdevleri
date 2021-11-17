package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Kaç Tane Sayı Gireceksiniz?: ");
        int sayiAdet = klavye.nextInt();
        int sayi;
        double enBuyuk = 1;
        double enKucuk = 1;
        for(int i=1;i<=sayiAdet;i++){
            System.out.print(i+".Sayiyi Giriniz.");
            sayi = klavye.nextInt();

            if(sayi>enBuyuk){
                enBuyuk = sayi;
            }
            if (sayi<enKucuk){
                enKucuk = sayi;
            }

        }
        System.out.println("En Buyuk Sayi:"+enBuyuk);
        System.out.println("En Küçük Sayı: "+enKucuk);
    }
}
