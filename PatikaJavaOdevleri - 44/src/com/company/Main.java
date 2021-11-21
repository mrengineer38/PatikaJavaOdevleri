package com.company;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Dövüş Simulasyonuna Hoş geldiniz. ");
        System.out.println("Dövüşçünün Adını Giriniz:");
        String name = klavye.nextLine();
        System.out.println("Dövüşçünün Hasar Değerini Giriniz: ");
        int damage = klavye.nextInt();
        System.out.println("Dövüşçünün Can Değerini Giriniz:");
        int health = klavye.nextInt();
        System.out.println("Dövüşçünün Ağırlığını Giriniz:");
        int weight = klavye.nextInt();
        System.out.println("Dövüşçünün Savurma İhtimalini Giriniz:");
        int dodge = klavye.nextInt();
        Fighter f1 = new Fighter(name, damage, health, weight, dodge);
        Fighter f2 = new Fighter("B", 20, 100, 100, 30);
        Match match = new Match(f1, f2, 90, 120);
        match.Run();
        match.isWin();

        }
}
