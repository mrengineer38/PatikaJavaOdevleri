package com.company;


import java.util.Scanner;

public class Main {
    static void AsalMı(int a) {
        boolean isSayi = true;
        if (a == 2) {
            System.out.println(a + " sayısı ASALDIR!");
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                isSayi = false;
            }
        }
        if (isSayi == false) {
            System.out.println(a + " sayısı ASAL değildir!");
        } else {
            System.out.println(a + " sayısı ASALDIR!");
        }

    }

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Sayı Giriniz:");
        int sayi = klavye.nextInt();
        AsalMı(sayi);
        //Yarınlar elimizden uçup gitti, zaman gibi...


    }
}



