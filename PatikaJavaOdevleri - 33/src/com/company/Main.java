package com.company;


import java.util.Scanner;

public class Main {
    static int Pattern(int a) {
        int son;
        int c;
        son = a;
        for (int i = 0; i <= a; a = a - 5) {
            System.out.print(a + " ");
        }
        System.out.print(a+ " ");
        a =a+5;
        while (son >= a) {
            System.out.print(a + " ");
            a = a+5;
        }
        //oldugu kadar ne yapalım.
        return a;
    }

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("N Sayısı:");
        int sayi = klavye.nextInt();
        Pattern(sayi);

    }
}



