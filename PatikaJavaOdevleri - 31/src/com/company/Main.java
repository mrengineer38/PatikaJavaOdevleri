package com.company;

import java.util.Scanner;

public class Main {
    static int UsAl(int a,int b){
        int sum = 1;
        for(int i=1;i<=b;i++){
            sum = sum*a;
        }
        System.out.println("Sonuç:"+sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int altTaban = klavye.nextInt();
        System.out.print("Üs değerini giriniz :");
        int usTaban = klavye.nextInt();
        UsAl(altTaban,usTaban);
    }
}



