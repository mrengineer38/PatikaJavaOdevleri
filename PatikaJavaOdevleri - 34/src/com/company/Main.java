package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Rock Me Amadeus!
        Scanner klavye = new Scanner(System.in);
        System.out.println("Dizinin Uzunluğunu Giriniz:");
        int sayi = klavye.nextInt();
        double sum = 0;
        double[] numbers = new double[sayi];
        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = 1.0/(i+1);
            sum = sum + numbers[i];
        }

        System.out.println("Toplam: "+sum);
    }

}


