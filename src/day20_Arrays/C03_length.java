package day20_Arrays;

import java.util.Arrays;

public class C03_length {
    public static void main(String[] args) {

        // iki sekilde array olusturabiliriz
        int sayilar[]={1,2,3}; //direk array olusturuyosak

        String harfler[]=new String[4];

        System.out.println("sayilar array'in uzunlugu : "+sayilar.length); //sayilar array'in uzunlugu : 3


        /*
        String length() method'unda parantez var arrayde yok
        String isim ="java";
        isim.length();

         */

        System.out.println("harfler array'inin uzunlugu : "+ harfler.length); //harfler array'inin uzunlugu : 4
        System.out.println(Arrays.toString(harfler)); //[null, null, null, null]


        //harfler array'inin son elementini yazdiralim
        System.out.println(harfler[harfler.length-1]); //null

        System.out.println(harfler[5]); // ArrayIndexOutOfBoundsException




    }
}
