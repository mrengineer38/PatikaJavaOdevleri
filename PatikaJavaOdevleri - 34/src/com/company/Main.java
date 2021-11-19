package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Rock Me Amadeus!
        Scanner klavye = new Scanner(System.in);
        System.out.println("Sayıyı Giriniz:");
        int sayi = klavye.nextInt();
        double sum = 0;
        double[] numbers = new double[sayi];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println((i + 1) + " .Sayıyı Giriniz.");
            double insertSayi = klavye.nextInt();
            numbers[i] = insertSayi;
            sum = sum + insertSayi;
        }

        System.out.println(sum / numbers.length);
    }

}


