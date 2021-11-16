package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Sayi Giriniz.");
        int sayi = klavye.nextInt();
        int toplam = 0;
        while(sayi>0){
            toplam = toplam+sayi%10;
            sayi = sayi/10;
        }
        System.out.println("Girilen Sayının Basamak Değerleri Toplamı : "+toplam);
    }
}
