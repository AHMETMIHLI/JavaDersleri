package day39_exceptions;

import java.util.Scanner;

public class C05_IllegalArgumentException {
    public static void main(String[] args) {
        //Soru: Kullanicidan yasini girmesini isteyin.
        // Kodunuzu kullanici sifirdan kucuk bir sayi girerse
        // Exception verecek sekilde yazin.

        Scanner scan = new Scanner(System.in);
        System.out.println("yasini giriniz");
        int yas = scan.nextInt(); //kullanicinin girdigi yasi integer olarak alıyor


        try {
            if (yas<0){
                throw new IllegalArgumentException();
            } else{
                System.out.println("Yasiniz : " + yas);
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.err.println("Yas negatif olamaz");//err string ifadeyi kırmızı yapiyor
        }
    }
}