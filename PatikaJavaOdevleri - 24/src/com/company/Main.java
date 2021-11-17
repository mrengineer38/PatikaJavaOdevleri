package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n1,n2;
        Scanner klavye = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz.");
        n1 = klavye.nextInt();
        System.out.println("İkinci Sayıyı Giriniz.");
        n2 = klavye.nextInt();
        int ebob = 1;
        int ekok;
        int i= 1;
        while(i<=n1&& i<=n2){
            if(n1 % i == 0 && n2 % i == 0)
                ebob = i;
            ++i;
        }

        ekok = (n1 * n2) / ebob;
        System.out.printf(" %d ve  %d sayılarının EBOB'u %d \n", n1, n2, ebob);
        System.out.printf(" %d ve  %d sayılarının EKOK'u %d \n", n1, n2, ekok);
    }
}
