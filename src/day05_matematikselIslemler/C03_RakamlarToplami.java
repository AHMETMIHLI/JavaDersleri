package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplami {

    public static void main(String[] args) {
                //kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt(); // 5267

        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int ilkGirilenSayi=sayi;

        //su anda sayi 5267 bb=0 rt=0

        birlerBasamagi=sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /=10;

        //suanda sayi 526 bb=7 rt=7

        birlerBasamagi=sayi % 10;
        rakamlarToplami +=birlerBasamagi;
        sayi /=10;

        //su anda sayi 52 bb 6 rt 13

        birlerBasamagi= sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;

        //suanda sayi 5 bb 2 rt 15
        birlerBasamagi=sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;

        //su anda sayi 0 bb 5 rt 20

        System.out.println(ilkGirilenSayi +" sayisinin rakamlar toplami :"+ rakamlarToplami);





    }
}
