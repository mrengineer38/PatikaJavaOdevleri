package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        String userName, password;
        System.out.println("Kullanıcı Adınızı Giriniz:");
        userName = klavye.nextLine();
        System.out.println("Şifrenizi Giriniz");
        password = klavye.nextLine();
        if (userName.equals("MrEngineer") && password.equals("Deneme123")){
            System.out.println("Giriş Başarılı...");
        }
        else {
            System.out.println("Kullanıcı adınız veya şifreniz yanlış. ");
        }
        System.out.printf("Kullanıcı adınızı veya şifrenizi değiştirmek ister misiniz? \n Evet için 1 Hayır için 2 ye basınız. \n");
        int control = klavye.nextInt();
        switch (control){
            case 1:
                System.out.println("Kullanıcı adınızı giriniz");
                userName = klavye.nextLine();
                System.out.println("Şifrenizi Giriniz");
                password = klavye.nextLine();
                if (userName.equals("MrEngineer") && password.equals("Deneme123")){
                System.out.println("Şifre Oluşturulamadı.. Lütfen tekrar deneyiniz.");
            }
            else {
                System.out.println("Şifre Oluşturuldu...");
            }
            break;
            case 2:
                System.out.println("Çıkış Yapılıyor...");
                break;
            default:
                System.out.println("Hatalı Parametre Girildi. Çıkış Yapılıyor...");
                break;
        }
    }

        }
