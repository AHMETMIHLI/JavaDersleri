package day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {


        String str="Java ile hayat ne guzel";

        System.out.println(str.toUpperCase());

        boolean guzelMi = true;
        //guzelMi. boolean primitive oldugundan hazir method'u bulunmuyor

        Boolean buGuzelMi= true;
        buGuzelMi.toString();


        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);





        String ogrNo="123456";

        //kullanicidan bir sifre isteyin
        //eger sifre sadece rakamlardan olusuyorsa kabul etmeyelim


        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sifre giriniz");

        String sifre =scan.nextLine();

        Integer sifreSayi=Integer.parseInt(sifre);


        System.out.println("girilen sifrenin 3 fazlasi : " +(sifre+3));
        System.out.println("Integer sifrenin 3 fazlasi : " +(sifreSayi+3));

        /*
        Wrapper class'lar ilerde kullanabilecegimiz pekcok faydali hazir method icerir
         */



    }
}
