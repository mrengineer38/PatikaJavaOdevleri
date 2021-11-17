package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bir sayi giriniz");

            int sayac = 0;
            for(int sayi=2;sayi<=100;sayi++)
            {
                int kontrol = 0;
                for (int i = 2; i < sayi; i++)
                {
                    if (sayi % i == 0)
                    {
                        kontrol = 1;
                        break;
                    }
                }

                if(kontrol==0)
                {
                    System.out.print(sayi+"-");
                    sayac++;
                    //Dışarıda yağmur var aldırmıyorum, masamda resmin var kaldırmıyorum.
                    //Sevdiğin şarkıyı çaldırmıyorum. Duyacaksın diye ödüm kopuyor.
                }
            }
        }
    }
