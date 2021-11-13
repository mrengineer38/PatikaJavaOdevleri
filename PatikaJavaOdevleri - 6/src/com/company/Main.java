package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Armut Kaç Kilo?: ");
        int armut = klavye.nextInt();
        System.out.println("Elma Kaç Kilo?: ");
        int elma = klavye.nextInt();
        System.out.println("Domates Kaç Kilo?: ");
        int domates = klavye.nextInt();
        System.out.println("Patlıcan Kaç Kilo?: ");
        int patlican = klavye.nextInt();
        System.out.println("Muz Kaç Kilo?: ");
        int muz = klavye.nextInt();
        double sum = (armut)*(2.14)+ (elma)*(3.67)+(domates)*(1.11)+(muz)*(0.95)+(patlican)*(5.00);
        System.out.println("Toplam: "+ sum+" TL");
        }

    }