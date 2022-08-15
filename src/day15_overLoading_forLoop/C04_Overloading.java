package day15_overLoading_forLoop;

public class C04_Overloading {
    public static void main(String[] args) {

        topla(5,7); // iki integer'in toplami : 12
        topla(5.2,3); // bir double ve bir integer'in toplami : 8.2
        topla(3.4,6.1); // iki double'nin toplami : 9.5
        topla(5,6.2); // iki double'nin toplami : 11.2
    }
    /*
        Java hangi method'un calisacagina karar verirken optimizasyon yapar
        - eger hic cast yapmadan kullanabilecegi bir method varsa onu kullanir
        - eger cast yapmadan kullanacagi bir method yoksa, en az cast yaparak kullanabilecegi
          method'u tercih eder
         */


    public static void topla(int sayi1, int sayi2){
        System.out.println("iki integer'in toplami : "+(sayi1+sayi2));
    }

    public static void topla(double sayi1, int sayi2){
        System.out.println("bir double ve bir integer'in toplami : "+(sayi1+sayi2));
    }

    public static void topla(double sayi1, double sayi2){
        System.out.println("iki double'nin toplami : "+(sayi1+sayi2));
    }
}
