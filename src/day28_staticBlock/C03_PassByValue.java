package day28_staticBlock;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        %25 indirimli fiyati hesaplayip bize donduren bir method olusturun.
         */

        double satisFiyati=100;
        double indirimOrani=25;

        double indirimliFiyat=indirimliFiyatHesapla(satisFiyati);
        System.out.println("indirimli fiyat : "+ indirimliFiyat);
        System.out.println("indirimli fiyat : "+ indirimliFiyat);
        System.out.println("indirimli fiyat : "+ indirimliFiyat);
        System.out.println("indirimli fiyat : "+ indirimliFiyat);

    }

    public static double indirimliFiyatHesapla(double satisFiyati) {
        double indirimliFiyat=satisFiyati*0.75;

        return indirimliFiyat;
    }
}
