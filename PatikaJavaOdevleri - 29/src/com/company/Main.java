package com.company;

import java.util.Scanner;

public class Main {
    static boolean Palindrom ( int a){
        Scanner klavye = new Scanner(System.in);
        int b, toplam = 0, sayi;
        sayi = a;
        while (a > 0) {
            b = a % 10;
            toplam = (toplam * 10) + b;
            a = a / 10;
        }
        if (sayi == toplam) {
            return true;
        } else {
            return false;
        }


    }
    public static void main(String[] args) {
        System.out.println(Palindrom(4));
    }

    }



