package day21_Arrays;

import java.util.Arrays;

public class C06_ArrayeElemanEkleme {
    public static void main(String[] args) {
        //Cos deki methodu kullanarak arraye eleman ekleyelim.

        String [] takimListesi={"Suleyman","Osman"};
        String eklenecekIsim="Talha";

        takimListesi= C05_ArrayeElemanEkleme.elemanEkle(takimListesi,eklenecekIsim);
        System.out.println(Arrays.toString(takimListesi));
    }
}
