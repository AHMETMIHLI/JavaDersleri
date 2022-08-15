package day21_Arrays;

import java.util.Arrays;

public class C09_binarySearch {
    public static void main(String[] args) {
        /*
        binarySearch method'u siralanmis .................
         */

        int[] sayilar ={3,7,15,4,27,10};

        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar));
        //varsa index, yoksa -sira

        System.out.println(Arrays.binarySearch(sayilar,4));

        System.out.println(Arrays.binarySearch(sayilar,15));

        System.out.println(Arrays.binarySearch(sayilar,11));

        System.out.println(Arrays.binarySearch(sayilar,6));

        System.out.println(Arrays.binarySearch(sayilar,-100));

    }
}
