package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        Scanner klavye = new Scanner(System.in);
        System.out.println("Matematik");
        int mat = klavye.nextInt();
        System.out.println("Fizik");
        int fizik = klavye.nextInt();
        System.out.println("Kimya");
        int kimya = klavye.nextInt();
        System.out.println("Türkce");
        int turkce = klavye.nextInt();
        System.out.println("Tarih");
        int tarih = klavye.nextInt();
        System.out.println("Müzik");
        int muzik = klavye.nextInt();
        float ortalama = (mat+fizik+kimya+turkce+tarih+muzik) / 6;
        System.out.println("Ortalama: "+ ortalama);
    }
}
