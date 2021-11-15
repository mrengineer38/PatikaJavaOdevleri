package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int sayi = 1;
        int toplam = 0;
        while (sayi > 0) {
            System.out.println("Sayi Giriniz:");
            sayi = klavye.nextInt();
            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam = toplam + sayi;
                System.out.println("Toplam: "+ toplam);
            }
            else if (sayi<0){
                System.out.println("Negatif Sayı Girildi. Toplam: "+ toplam);
                break;
            }



        }
    }
}