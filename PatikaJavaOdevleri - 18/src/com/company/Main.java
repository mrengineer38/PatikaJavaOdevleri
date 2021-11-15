package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Tabanı Giriniz:");
        int taban = klavye.nextInt();
        System.out.println("Kuvveti Giriniz:");
        int kuvvet = klavye.nextInt();

            long sonuc = 1;

            while (kuvvet != 0)
            {
                sonuc *= taban;
                --kuvvet;
            }

            System.out.println("CEVAP = " + sonuc);
        }
    }

