package day36_inheretanceDataTypeKullanimi;

public class EYanHizmetliler extends BMuhasebe {
    protected int saatUcreti=9;
    protected int gunlukMesai=8;

    protected void maas(){
        System.out.println("Yan Hizmetliler : " + (30*saatUcreti*gunlukMesai) + "maas alir");
    }

    protected void issizlikSigorta(){
        System.out.println("Yan Hizmetliler %30 indirimli issizlik sigortasi yaptirabilir");
    }

    public static void main(String[] args) {
        /*
        overriding child class'daki bir method'un
        parent class'daki ayni isimdeki methodu
        etkisiz hale getirerek
        kendisinin spesifik ozelligini ortaya cikarmasidir.

        ******  overriding'i nerede dikkate aliyoruz?
        bir obje olusturulurken
        data turu ve constructor farkli ise

        eger bir obje olusturulurken
       data turu ve constructor farkli ise
       objenin ozelliklerini belirlerken
       3 konuya dikkat cekmeliyiz
       1- Obje constructor'in oldugu class'da olusur
       2- Objenin ozelliklerini aramaya data turunun oldugu class'dan aramaya baslariz
          bu class'da aranan ozellik bulunamazsa parent class'lara bakilir
          ordada bulamazsak CTE verir

        3-  eger aranan ozellik variable ise buldugumuz ilk degeri yazdiririz.
         aranan ozellik method ise
        degeri yazdirmadan once
        override edilmis mi diye kontrol etmemiz gerekir
        eger override edildiyse en guncel degeri yazdiririz.
         */

        BMuhasebe yh1=new EYanHizmetliler();
        System.out.println(yh1.gunlukMesai);
        System.out.println(yh1.saatUcreti);
        yh1.maas();
        yh1.ozelSigorta();
        yh1.sigorta();
        System.out.println(yh1.isim);
        System.out.println(yh1.soyisim);
        System.out.println(yh1.departmant);
        //System.out.println(yh1.issizlikSigorta);
        //Aramaya muhasebe................
    }

}
