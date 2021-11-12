package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Üçgenin Birinci kenarını giriniz");
        int input = klavye.nextInt();
        System.out.println("Üçgenin İkinci kenarını giriniz");
        int input2 = klavye.nextInt();
        System.out.println("Üçgenin Üçüncü kenarını giriniz");
        int input3 = klavye.nextInt();
        Islemler islem = new Islemler();
        islem.UcgenCevresi(input,input2,input3);
        islem.UcgenAlani(input,input2,input3);
        islem.DikUcgen(input,input2,input3);
    }
}
    class Islemler {
    public void UcgenCevresi(int a , int b, int c){
        float u = (a+b+c) /2;
        System.out.println("Üçgenin çevresi: "+ u*2);
    }
    public void UcgenAlani(int a, int b, int c){
        float u = (a+b+c) /2;
        float alan = u*(u-a)*(u-b)*(u-c);
        System.out.println("Üçgenin Alanı: "+Math.sqrt(alan));
    }
    public void DikUcgen(int a, int b, int c){
        if (a*a+b*b == c*c){
            System.out.println("Bu üçgen dik üçgendir.");
        }
        else if (b*b == a*a+c+c){
            System.out.println("Bu üçgen dik üçgendir.");
        }
        else if (a*a == b*b+c*c){
            System.out.println("Bu üçgen dik üçgendir");
        }
        else {
            System.out.println("Üçgen Dik Üçgen Değildir!");
        }
    }
}
