package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Mesafeyi kilometre cinsinden giriniz: ");
        int mesafe = klavye.nextInt();
        double netTutar;
        double tutar = mesafe*(0.10);
        double indirim;
        double indirimlinet;

        System.out.println("Yaşınızı Giriniz: ");
        int yas = klavye.nextInt();
        if (yas<12) {
            indirim = tutar * (0.5);
            netTutar = mesafe * (0.10) - indirim;
            System.out.println("Yolculuk Tipini Giriniz (1=> Tek Yön 2=> Çift Yön) ");
            int type = klavye.nextInt();

            if (type ==2){
                indirimlinet = netTutar* 0.2;
                netTutar = (netTutar-indirimlinet)*2;
                System.out.println("Toplam Tutar: "+netTutar);
            }
            else if (type ==1){
                System.out.println("Toplam Tutar: "+netTutar);
            }
            else {
                System.out.println("Geçersiz Sayı Girildi...");
            }
        }
        else if(yas>=12 && yas<=24){
            indirim = tutar * (0.1);
            netTutar = mesafe * (0.10) - indirim;

            System.out.println("Yolculuk Tipini Giriniz (1=> Tek Yön 2=> Çift Yön) ");
            int type = klavye.nextInt();

            if (type ==2){
                indirimlinet = netTutar* 0.2;
                netTutar = (netTutar-indirimlinet)*2;
                System.out.println("Toplam Tutar: "+netTutar);
            }
            else if (type ==1){
                System.out.println("Toplam Tutar: "+netTutar);
            }
            else {
                System.out.println("Geçersiz Sayı Girildi..");
            }

        }
        else if (yas>=65){
            indirim = tutar * (0.3);
            netTutar = mesafe * (0.30) - indirim;
            System.out.println("Yolculuk Tipini Giriniz (1=> Tek Yön 2=> Çift Yön) ");
            int type = klavye.nextInt();
            if (type ==2){
                indirimlinet = netTutar* 0.2;
                netTutar = (netTutar-indirimlinet)*2;
                System.out.println("Toplam Tutar: "+netTutar);
            }
            else if (type ==1){
                System.out.println("Toplam Tutar: "+netTutar);
            }
            else {
                System.out.println("Geçersiz Sayı Girildi..");
            }
        }
        else {
           netTutar = mesafe * (0.1);
            System.out.println("Yolculuk Tipini Giriniz (1=> Tek Yön 2=> Çift Yön) ");
            int type = klavye.nextInt();
            if (type ==2){
                indirimlinet = netTutar* 0.2;
                netTutar = (netTutar-indirimlinet)*2;
                System.out.println("Toplam Tutar: "+netTutar);
            }
            else if (type ==1){
                System.out.println("Toplam Tutar: "+netTutar);
            }
            else {
                System.out.println("Geçersiz Sayı Girildi..");
            }

        }
        }
    }
