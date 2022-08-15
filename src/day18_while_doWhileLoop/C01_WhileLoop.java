package day18_while_doWhileLoop;

import java.util.Locale;

public class C01_WhileLoop {
    public static void main(String[] args) {

        /*
        Soru 4 ) Kullanicidan baslangic ve bitis haflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
        Kullanicinin hata yapmadigini farz edin.
         */


        char ilkHarf ='f';
        char sonHarf ='t';

        char temp = ilkHarf; //ilk harfi bozmamak için
        String buyult = "";

        while (temp<=sonHarf){

            buyult=(temp+"").toUpperCase(); //char'ı String'e çevirip harfi buyuttuk

            System.out.print(buyult + " ");
            temp+=1;

        }
    }
}
