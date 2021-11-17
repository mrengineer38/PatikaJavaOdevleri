package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz:");
        int sayi = klavye.nextInt();
        int sum = 0;
        for (int i=1;i<sayi;i++){
            if(sayi%i==0){
                sum=sum+i;
            }
        }
        if (sum==sayi){
            System.out.println(sayi+" Mükemmel Sayıdır.");
        }
        else {
            System.out.println(sayi+" Mükemmel Sayı Değildir.");
        }
    }
}
