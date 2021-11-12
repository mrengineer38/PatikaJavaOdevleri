package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Dairenin Yarıçapını Giriniz:");
        int radius = klavye.nextInt();
        Islemler islem = new Islemler();
        islem.AlanHesaplama(radius);
        islem.CevreHesaplama(radius);
    }
}
class Islemler {

    public void AlanHesaplama(int r){
        float pi = (float) 3.14;
        float alan = pi*r*r;
        System.out.println("Dairenin Alanı = "+alan);
    }
    public void CevreHesaplama(int r){
        float pi = (float) 3.14;
        float cevre = 2*pi*r;
        System.out.println("Dairenin Cevresi= "+cevre);
    }
}