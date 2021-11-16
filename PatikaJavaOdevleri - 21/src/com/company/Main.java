package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Harmonik Sayı İçin Değer Giriniz:");
        int sayi = klavye.nextInt();
        double toplam = 1;
        for(double i=2;i<=sayi;i++){
            toplam = toplam + 1/i;
        }
        System.out.println("Toplam:"+toplam);
    }
}
