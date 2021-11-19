package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
            Scanner klavye = new Scanner(System.in);
        System.out.print("Dizinin Boyutu n: ");
        int sayi;
        int boyut = klavye.nextInt();
        int[] dizi = new int[boyut];
        for(int i=0;i< dizi.length;i++){
            System.out.print((i+1)+". Elemanı Yazınız:");
            sayi = klavye.nextInt();
            dizi[i] = sayi;
        }
        Arrays.sort(dizi);
        System.out.println("Sıralama: "+Arrays.toString(dizi));

    }
}