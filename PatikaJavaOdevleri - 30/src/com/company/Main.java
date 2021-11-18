package com.company;

import java.util.Scanner;

public class Main {

    static int Toplam(int a, int b) {
        int result = a + b;
        System.out.println("Toplam: " + result);
        return result;
    }
    static int Cikar(int a, int b){
        int result;
        if (a>b){
           result = a-b;
            System.out.println("Sonuc: "+result);
        }
        else {
            result = b-a;
            System.out.println(result);
        }
        return result;
    }
    static double Carpma(int a,int b){
        double result;
        result = a*b;
        System.out.println("Sonuc:"+result);
        return result;
    }
    static double Bolme(int a, int b){
        double result;
        if (a>b){
            result = a/b;
            System.out.println("Sonuc: "+result);
        }
        else {
            result = b/a;
            System.out.println("Sonuc:" +result);
        }
    return result;
    }
    static double UsluSayi(int a,int b){
       double result = Math.pow(a,b);
        System.out.println("Sonuc:"+result);
        return result;
    }
    static int ModAl(int a,int b){
        int result;
        if (a>b){
            result = a%b;
            System.out.println("Sayıların Birbirine Bölümünden Kalan: "+result);
        }
        else{
            result = b%a;
            System.out.println("Sayıların Birbirine Bölümünden Kalan: "+result);
        }
        return result;
    }
    static int DikdortgenAlanBulma(int a, int b){
        int s = a*b;
        System.out.println("Dikdörgenin Alanı = "+s);
        return s;
    }
    static int Faktoriyel(int a){
        int result =1;
        for(int i=1;i<=a;i++){
            result *=i;
        }
        System.out.println("Sonuc:"+result);
        return result;
    }

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n" +
                "2- Cıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme İŞlemi\n" +
                "5- Üslü Sayı İşlemleri\n" +
                "6- Mod Alma İşlemleri\n" +
                "7- Dikdörtgen Alan Hesaplama İşlemleri\n" +
                "8- Faktoriyel Hesaplama\n"+
                "9- Çıkış Yap...\n";
        while (true) {
            System.out.println(menu);
            System.out.println("Bir İşlem Seçiniz.");
            select = klavye.nextInt();
            if (select == 9 || select > 9) {
                break;
            }
            System.out.println("Birinci Sayıyı Giriniz");
            int a = klavye.nextInt();
            System.out.println("İkinci Sayıyı Giriniz");
            int b = klavye.nextInt();
            switch (select) {
                case 1:
                    Toplam(a, b);
                    break;
                case 2:
                    Cikar(a,b);
                    break;
                case 3:
                    Carpma(a,b);
                    break;
                case 4:
                    Bolme(a,b);
                    break;
                case 5:
                    UsluSayi(a,b);
                    break;
                case 6:
                    ModAl(a,b);
                    break;
                case 7:
                    DikdortgenAlanBulma(a,b);
                    break;
                case 8:
                    Faktoriyel(a);
                    break;
            }



        }

    }
}



