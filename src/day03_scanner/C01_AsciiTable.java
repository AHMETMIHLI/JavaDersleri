package day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {

        // 6- bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.

        int sayi=10;
        char harf='a';
        String str="banan";

        System.out.println(sayi+harf); //10a degil 107 oldu
        System.out.println(sayi*harf); //
        System.out.println(str+harf); //banana
        System.out.println(harf+2);
        System.out.println(str+sayi+harf); //banan10

        //char yeniHarf=harf+2;

        /*
        1-char data turu isleme girdigi degiskenin turune gore farklı davranabilir
         eger matematiksel isleme girdigi variable sayisal bir degerse sayi gibi davranir
         sayi+harf sayi variable'i int oldugundan harf variable'i ascii tablosunda 97 degerini kullanir

         char yeniHarf = harf+2; java önce sagdaki islemi yapar, sagda int+char gorunce ascii degerini alır ve sonucu 99 bulur
                                 sonra atama islemi yapmaya calisir
                                 char yeniHarf=99;
                                 bu atama java acisindan kabul edilebilir degildir
         2- str+harf); //banana String variable cok gucludur, hangi data turu ile isleme
                        girerse girsin diger data turunu kendine benzetir

         */

        //peki... konsolda verilen variable'lari kullanarak 10a görmek istersek nasıl yazdırmaliyiz?

        System.out.println(""+sayi+harf); //10a-->başa konulan "" string etkisi yaptırır

        char deger='1';
        System.out.println(deger + harf); // '1' +'a' --> 146 karakterlerin ascii degerleri toplami

        char deg=1;
        System.out.println(deg);




    }
}
