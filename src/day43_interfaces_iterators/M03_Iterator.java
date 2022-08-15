package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {

        List<Integer> liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste); //[10, 20, 30]


        //liste'deki tum elementleri INDEX KULLANMADAN 3 artirin
        for (Integer each: liste
             ) {
            System.out.println(each+3 +" ");
        }

        System.out.println(liste);

        /*
        Java index yapisi olmayan collection'lardaki
        elementlere ulasmak veya  degistirmek icin
        Iterator interface'ini olusturmustur.

        Iterator interface oldugundan ondan obje uretmemiz mumkun degildir
        bunun yerine bize iterator döndüren liste.iterator() methodunu kullanıyoruz
         */

        System.out.println(liste); //[10, 20, 30]

        Iterator it1= liste.iterator();
        System.out.println(it1.next());//üzerinden atladığı elementi bana döndüürür //10
        System.out.println(it1.next());//20
        System.out.println(it1.next());//30
        //System.out.println(it1.next());//.NoSuchElementException. 30'dan sonra element kalmadiğindan next() RTE verir.

        //Iterator'da geri donus yok, adim adim sona ulastıktan sonra
        //basa gelmek isterseniz yeniden bir iterator olusturmaniz gerekir

        // [10, 20, 30]
        Iterator it2= liste.iterator();
        //yeni it2'yi kulanarak listenin tum elementlerini silelim

        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();

        System.out.println(liste);//iterator ile elementleri gezip, remove yapinca
                                    //liste kalici olarak silindi

        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println(liste);

        Iterator it3= liste.iterator();
        while (it3.hasNext()){
            it3.next();
            it3.remove();

        }
        System.out.println("loop'tan sonra liste = " + liste);

        /*
        ..................
         */


    }
}
