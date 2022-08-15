package day25_constructor;

public class Car {
    /*
    bu class bizim kalıphanemiz.
    bir araba oluşturmak icin ihtiyacımız olan
    variable ve methodlari bu class da belirleriz.

    sonra farkli class'larda araba olusturmamiz gerekirse
    bu classEdan bir obje olusturup
    ................
     */

    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;
    public int fiyat;


    public void benzinliArac(){
        System.out.println("bu arac benzinli motora sahiptir");
    }

    public void maxHiz(int hiz){
        System.out.println("............");
    }
}
