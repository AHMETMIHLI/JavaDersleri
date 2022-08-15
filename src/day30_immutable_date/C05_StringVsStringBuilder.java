package day30_immutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {
        /*
        String mi yoksa StringBuilder mi daha hizlidir?
        bunun için bir String olusturup 1000 kere sonuna . ekleyelim
        oncesinde ve sonrasinda zamani alip
        aradaki farki bulalim

        ayni islemi string builder icin de yapalim
         */

        LocalTime baslangic =LocalTime.now();

        String str ="Ahhhh Java";
        for (int i = 0; i < 1000; i++) {
            str+=".";

        }

        LocalTime bitis=LocalTime.now();

        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("String Zaman : " + (bitis.getNano()-baslangic.getNano()));



    }
}
