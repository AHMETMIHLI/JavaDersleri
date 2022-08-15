package day26_constructor;

public class Araba {

    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Araba(String marka, String model, int yil, int fiyat) {

    }
    public Araba(){

    }
    /*
    biz herhangi bir constructor olusturdugumuzda
    Java default constructor'ı siler.
    ...............
     */


    public void benzinliArac(){
        System.out.println("bu arac benzinli motora sahiptir");
    }

    public void maxHiz(int hiz){
        System.out.println("............");
    }


}
