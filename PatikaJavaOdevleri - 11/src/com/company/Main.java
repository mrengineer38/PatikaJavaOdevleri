package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Birinci Sayiyi Giriniz");
        int sayi1 = klavye.nextInt();
        System.out.println("İkinci Sayiyi Giriniz");
        int sayi2 = klavye.nextInt();
        System.out.println("Üçüncü Sayiyi Giriniz");
        int sayi3 = klavye.nextInt();
        if (sayi1 > sayi2 && sayi1 > sayi3){
            if(sayi2>sayi3){
                System.out.println("En büyük Sayı :"+sayi1+"İkinci Sayi: " +sayi2+" Üçüncü Sayi: "+sayi3);
            }
            else{
                System.out.println("En Büyük Sayı: "+sayi1+"İkinci Sayi: "+sayi3+"Üçüncü Sayi: "+sayi2);
            }
        }
        else if ((sayi2>sayi1 ) && (sayi2>sayi3)){
            if(sayi1>sayi3){
                System.out.println("En Büyük Sayı: "+sayi2+"İkinci Sayi:"+sayi1+"Üçüncü Sayi:"+sayi3);
            }
            else{
                System.out.println("En Büyük Sayı: "+sayi2+"İkinci Sayi:"+sayi3+"üçüncü Sayi:"+sayi1);
            }
        }
        else {
            if(sayi1>sayi2){
                System.out.println("En Büyük Sayı:"+sayi3+"İkinci Sayi"+sayi1+"Üçüncü Sayi:"+sayi2);
            }
            else {
                System.out.println("En Büyük Sayı:"+sayi3+"İkinci Sayi"+sayi2+"Üçüncü Sayi:"+sayi1);
            }
        }
    }
}
