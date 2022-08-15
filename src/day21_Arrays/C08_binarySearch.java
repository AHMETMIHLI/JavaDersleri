package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {
        /*
    Binary search java da eleman aramanın kisa yoludur.
    ancak binary search in calismasi icin önce
    array'in sirali hale getirilmesi gerekir
    Eger siralama yapmadan binarySearch yaparsaniz
    sonucu bulamayabilir veya yanlis bulabilir
     */

        String[] harfler = {"Y","B","D","G","O"};

        String arananHarf = "Y";

        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03_Contains.contains(harfler,arananHarf));

        //binarySearch bize aradigimiz elemanin indexini dondurur.
        //array sirali olmadigi icin arama sonucunu dogru bulamayabilir
        //emin olmak icin once sort yapmaliyiz

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03_Contains.contains(harfler,arananHarf));

    }

}
