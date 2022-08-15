package day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        //verilen bir arraydeki tekrar eden elementleri silip
        //tekrarsiz halini arraye atayan bir kod yaziniz

        int [] arr ={4,5,3,6,8,5,1,9,0,4,2,5,7,9,1,2,5,7,6};

        Set<Integer> tekrarsizSet = new HashSet<>(); //tekrarsız hale getirmek icin kullandık

        for (int each:arr
             ) {
            tekrarsizSet.add(each);
        }
        System.out.println(tekrarsizSet);

        int[] tekrarsizArr=new int[tekrarsizSet.size()];

        System.out.println(Arrays.toString(tekrarsizArr));

        int i=0;
        for (Integer each:tekrarsizSet
             ) {
            tekrarsizArr[i]=each;
            i++;
        }

        arr=tekrarsizArr;
        System.out.println("Bizim arrayin son hali :" +Arrays.toString(tekrarsizArr));


    }
}
