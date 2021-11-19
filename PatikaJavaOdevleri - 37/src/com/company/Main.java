package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int[] list = {3,7,3,3,2,9,10,21,1,33,9,1};
        int[] tekrar = new int[list.length];
        int startIndex = 0;
        for(int i=0;i<list.length;i++){
            for(int j=0;j<list.length;j++){
                if((i != j) && (list[i] == list[j])){
                    if (isFind(tekrar,list[i])){
                        tekrar[startIndex++] = list[i];
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(tekrar));
    }

}