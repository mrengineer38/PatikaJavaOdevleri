package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
            Scanner klavye = new Scanner(System.in);
        int [] dizi = new int[]{10,20,20,10,20,5,20};
        int besli = 0;
        int onlu = 0;
        int yirmili = 0;
        System.out.println("Tekrar Sayıları");
        for(int i=0;i<dizi.length;i++){
            if(dizi[i] == 5){
            besli= besli+1;
            }
            else if(dizi[i] ==10){
                onlu=onlu+1;
            }
            else if(dizi[i] ==20){
                yirmili=yirmili+1;
            }

        }
        System.out.println("10 Sayısı "+onlu+ " kere Tekrar Edildi.");
        System.out.println("20 Sayısı "+yirmili+ " kere Tekrar Edildi.");
        System.out.println("5 Sayısı "+besli+ " kere Tekrar Edildi.");
    }
}