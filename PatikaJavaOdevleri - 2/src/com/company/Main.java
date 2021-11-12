package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        Scanner klavye = new Scanner(System.in);
        int para = klavye.nextInt();
        int kdvOrani = 18;
        int kdvMiktar = (para/100*kdvOrani);
        int sum = kdvMiktar+para;

        if (para>1000){
            kdvOrani = 8;
            sum = ((para/100)*kdvOrani)+para;
            System.out.println("KDV'siz Fiyat ="+para);
            System.out.println("KDV'li Fiyat ="+sum);
            System.out.println("KDV Orani = "+kdvOrani);
            System.out.println("KDV Miktarı = "+kdvMiktar);
        }
        else{
            System.out.println("KDV'siz Fiyat ="+para);
            System.out.println("KDV'li Fiyat ="+sum);
            System.out.println("KDV Orani = "+kdvOrani);
            System.out.println("KDV Miktarı= "+kdvMiktar);
        }
    }
}
