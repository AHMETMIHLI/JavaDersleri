package day26_constructor;

import day25_constructor.Car;

public class ArabaRunner {
    public static void main(String[] args) {

        //birgun onceki Car class'indan obje olusturalim.

        Car car1= new Car();
        System.out.println(car1.fiyat);



        Araba araba1=new Araba();
        araba1.fiyat=10000;
        araba1.marka="Mercedes";
        araba1.yil=2010;
        araba1.model="C180";

        System.out.println("marka :" +araba1.marka+
                "\nModel : " +araba1.model +"\nYil : "+ araba1.yil+ "\nFiyat : " + araba1.fiyat);

        Araba araba2=new Araba("BMW","5.20",2011,15000);

        System.out.println("marka :" +araba2.marka+
                "\nModel : " +araba2.model +"\nYil : "+ araba2.yil+ "\nFiyat : " + araba2.fiyat);



    }
}
