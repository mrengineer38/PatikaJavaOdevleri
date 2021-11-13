package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen Klavyeden 1 ile 4 arasinda bir sayi giriniz");
        System.out.printf("1- Toplama \n"+"2-Cikarma \n"+"3-Carpma \n"+"4-Bolme \n");
        int select = klavye.nextInt();
        System.out.println("Birinci Sayiyi giriniz");
        int birinciSayi = klavye.nextInt();
        System.out.println("İkinci Sayiyi giriniz");
        int ikinciSayi = klavye.nextInt();
        switch (select){
            case 1:
                System.out.println("Sayilarin Toplami = "+ birinciSayi+ikinciSayi);
                break;
            case 2:
                if (birinciSayi>ikinciSayi) {
                    System.out.println("Sayilarin Farki = " + (birinciSayi - ikinciSayi));
                    break;
                }
                else {
                    System.out.println("Sayilarin Farki = "+ (ikinciSayi-birinciSayi));
                    break;
                }
            case 3:
                System.out.printf("Sayilarin Carpimi = "+birinciSayi*ikinciSayi);
                break;
            case 4:
                if (birinciSayi>ikinciSayi) {
                    System.out.println("Sayilarin Bolumu = " + birinciSayi / ikinciSayi);
                    break;
                }
                else{
                    System.out.println("Sayilarin Bolumu = "+ ikinciSayi/birinciSayi);
                break;
                }
            default:
                System.out.println("Geçersiz İşlem...");
        }
    }

    }