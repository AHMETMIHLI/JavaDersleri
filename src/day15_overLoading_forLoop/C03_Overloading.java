package day15_overLoading_forLoop;

public class C03_Overloading {
    public static void main(String[] args) {

        topla(5,7); // iki integer'in toplami : 12
        topla(5.2,3); // bir double ve bir integer'in toplami : 8.2
        topla(3.4,6.1); // iki double'nin toplami : 9.5

    }

    public static void topla(int sayi1, int sayi2){
        System.out.println("iki integer'in toplami : " + (sayi1+sayi2));
    }
   /*
   Bir class'da parametre sayisi ve parametre data turleri ayni olan 2 method OLUSTURAMAYIZ
    public static void topla(int sayi1, int sayi2){
        System.out.println("iki integer'in toplami : " + (sayi1+sayi2));
    }
    */

    public static void topla(double sayi1, int sayi2){
        System.out.println("bir double ve bir integer'in toplami : "+(sayi1+sayi2));
    }

    public static void topla(int sayi1, double sayi2){
        System.out.println("bir integer ve bir double'ın toplami : "+(sayi1+sayi2));
    }
    public static void topla(double sayi1, double sayi2){
        System.out.println("iki double'nin toplami : "+(sayi1+sayi2));
    }
}
