package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int heat = klavye.nextInt();
        if(heat<5) {
            System.out.println("Kayak Yapabilirsiniz.");
        }
        else if (heat>=5 && heat<=25){
           if (heat<=15){
               System.out.println("Sinemaya Gidebilirsiniz.");
           }
           if (heat>=10){
               System.out.println("Piknik Yapabilirsiniz.");
           }
           else {
               System.out.println("Yüzmeye Gidebilirsiniz.");
           }
        }
    }
}
