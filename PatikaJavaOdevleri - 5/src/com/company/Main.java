package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen Boyunuzu (metre cinsinden) giriniz:");
        float boy = klavye.nextFloat();
        System.out.println("Lütfen Kilonuzu Giriniz:");
        float kilo = klavye.nextFloat();
        float indeks = kilo / (boy*boy);
        System.out.println("Vücut Kitle indeksiniz: "+indeks);

    }
}