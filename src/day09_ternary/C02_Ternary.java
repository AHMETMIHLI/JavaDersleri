package day09_ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        // Soru4 ) Kullanicidan bir sayi alin.
        // Sayi pozitifse “Sayi pozitif” yazdirin,
        // negatifse  sayinin karesini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi = scan.nextDouble();

        //eger ternary icindeki sonuclar farklı data türlerinde ise atama yapamayiz.
        //sadece yazdırabiliriz (sout ile)
        //double sonuc =sayi>0 ? "Sayi Pozitif" : (sayi*sayi);

        System.out.println(sayi>0 ? "Sayi Pozitif" : (sayi*sayi));
        }
    }
