package day37_overridding;

public class FSupra extends EToyota{

    void yakit(){
        System.out.println("Supra benzin kullanir");
        /*
        Private method'lar override edilemez
        Eger Child Class'da parent class'daki private method ile
        ayni signature'da bir method olusturursaniz
        bu overriding OLMAZ

         */

    }

    @Override //override notasyonu
    void motor() {
        /*
        @Override notasyonu Javaya bir gorev verir
        Java, bu notasyonla birbirine bağli olan iki method'u
        surekli kontrol eder
        Eger parent class'daki overridden method'u silerseniz
        CTE verir.

        @Override notasyonu kullanmak mecburi degildir
        Eger overridding method silinirse, kodun CTE vermesini istersek
        @Override notasyonu kullanmaliyiz
         */
    }
}
