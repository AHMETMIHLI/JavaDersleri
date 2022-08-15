package day14_methodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {
        /*
        eger bir class'in icerisinde herhangi bir hesaplama yapip
        bunu da kalici olarak saklamak istersek
        kodumuzu sade ve anlasilir tutmak icin
        islemi bir methodda yapip
        sonucunu main method'a ddndurebiliriz
        Return type'i void olmayan bir methodun sonucunu
        main method'da bir variable'a atama yaparsak
        programin geri kalaninda bu yeni degeri kullanma sansimiz olur
         */

        //kullanicidansehir ismini ve dogum tarihini alin
        //bunlari programda kullanacagimiz formatta bize donduren bir method olusturun
        //sehir ismini programimizda buyuk harf olarak,
        //tarihi ise 2022-06-30 seklinde kullanmak istiyoruz

        String sehir=sehiral();
        String tarih=tarihal();

        System.out.println("girdiginiz sehir : "+sehir);//ANKARA
        System.out.println("girdiginiz tarih : "+ tarih); // 2020-05-03

    }

    public static String tarihal() {
        String tarih="";
        Scanner scan=new Scanner(System.in);
        System.out.println("yil giriniz");
        int yil=scan.nextInt();
        if (yil>1900 && yil<2100){
            tarih=yil+"-";
        }else {
            System.out.println("yil icin gecerli bir sayi yazmalisiniz(1900-2100)");
        }
        System.out.println("kacinci ay oldugunu tamsayi olarak yaziniz");
        int ay=scan.nextInt();

        if (ay<=0 || ay>12){
            System.out.println("Ay no 1-12 arasinda olmalidir");
        } else if (ay<10) {
            tarih=tarih+"0"+ay+"-";
        }else {
            tarih=tarih+ay+"-";
        }
        System.out.println("lutfen ayin kacinci gunu oldugunu tamsayi olarak giriniz");
        int gun= scan.nextInt();
        if (gun<=0 || gun>31){
            System.out.println("gun no olarak 1-31 arasinda sayi girilmelidir");
        } else if (gun<10) {
            tarih=tarih+"0"+gun;
        }else {
            tarih=tarih+gun;
        }
        return tarih;
    }

    public static String sehiral() {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen sehir adi giriniz");
        String sehirAdi=scan.next().toUpperCase();

        return sehirAdi;
    }
}
