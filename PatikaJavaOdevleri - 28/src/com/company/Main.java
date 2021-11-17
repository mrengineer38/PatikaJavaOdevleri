package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = klavye.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1+" "+n2);
        int toplam = 0;
        for (int i = 2; i <= sayi; ++i)//Neden Acı? Neden İhanet?
        {
            toplam = n1 + n2;
            System.out.print(" " + toplam);
            n1 = n2;
            n2 = toplam;
        }


    }
}
