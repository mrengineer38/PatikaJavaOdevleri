package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Sayi Giriniz:");
        int sayi = klavye.nextInt();
        int i=0;
        int sayac = 0;
        int toplam = 0;

        while(i<=sayi){
            if(i%3 ==0 && i%4==0){
                sayac++;
                toplam = toplam+i;
                System.out.println("3 ve 4'e bölünen Sayılar: "+i);
            }
            i++;
        }
        int ortalama = toplam/sayac;
        System.out.println("Bölünen Tam Sayı Adeti : "+(sayac-1));
        System.out.println("Toplam: "+toplam);
        System.out.println("Ortalama :"+ortalama);
    }
}
