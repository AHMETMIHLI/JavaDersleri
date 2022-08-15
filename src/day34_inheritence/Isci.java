package day34_inheritence;

public class Isci extends Personel {
    /*
    Normal hayatimizda parent cocuk sahibi olmaya karar verebilir
    *****Java'da ise child class'lar ozelliklerini inherit etmek istedikleri
    class'i kendilerine parent edinirler.

    mesela isci class'ini olusturunca nelere ihtiyaci var diye dusunsek
    Personel class'indaki tum variable ve method'lara ihtiyaci
    oldugunu gorebiliriz.
    Bu durumda yeniden o variable ve method'lari olusturmak yerine
    Personel class'ini kendimize parent ediniriz

    Bir class'i parent edinmek icin extends keyword kullanmaliyiz

    Bir class baska bir class'i parent edindiginde
    1-parent class'daki tum ozelliklere(variable + method) otomatik olarak ...
    2-Parent class'daki ozelliklerden bazilarini kendine uydurabilir
    3_Parent class'da olmayan bazi yeni ozellikleri olusturabilir.
    Not: parent class'daki ozelliklerden hicbirin reddemez ama degistirebilir.
     */

    int persNo = 1001;
    public static void main(String[] args) {
        Isci isci1 =new Isci();
        System.out.println(isci1.isim);//Isim belirtilmedi
        //kendi class'imizda isim variable yok, onun icin parent'e gideriz.
        isci1.isim="Selim";
        System.out.println(isci1.persNo);//1001 kendi class'imizda varsa onu kullaniriz

        isci1.maas(); //Isciler minimum 15 euro saat ucreti alir


    }

    public void maas(){
        System.out.println("Isciler minimum 15 euro saat ucreti alir");
    }

    public void ozelSigorta(){
        System.out.println("iscilerden ..................");
    }
}
