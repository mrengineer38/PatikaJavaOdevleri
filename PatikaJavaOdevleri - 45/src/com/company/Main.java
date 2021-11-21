package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Adı : ");
        String name = klavye.nextLine();
        System.out.print("Maaşı : ");
        double salary = klavye.nextDouble();
        System.out.print("Çalışma Saati : ");
        int workHours = klavye.nextInt();
        System.out.print("Başlangıç Yılı : ");
        int hireYear = klavye.nextInt();
        Employee calisan = new Employee(name,salary,workHours,hireYear);
        calisan._toString();
    }
}