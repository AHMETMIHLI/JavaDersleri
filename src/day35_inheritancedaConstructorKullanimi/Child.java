package day35_inheritancedaConstructorKullanimi;

public class Child extends BParent {

    String isim="Child isim belirtilmedi";
    protected String childKlupAdi ="Child Klubu";

    Child(){
        System.out.println("Child constructor calisti");
    }

    public static void main(String[] args) {
       // AGrandParent gp1 =new AGrandParent();
        //bu objeyi olusturmak icin Grandpa Cons. calisir,
        //Parent veya Child .........

        Child child1=new Child();
        child1.grandpaKlupAdi="Child1";
        child1.parentKlupAdi="Child2";

        //child1 objesi icin Child cons calisir
        /*
        javada bir class'i kullanabilmek icin
        o class'dan obje olusturur, dolayisiyle
        o class'in constructorunu kullanirdik.

        java inheritance'de parent class'lardaki
        ozellikleri kullanabilmek icin
        o class'larin constructorlarini
        otomatik calistiran bir yapi kurmustur.

        ornegin biz child class'inda
        Child class'indan bir obje olusturmak istedigimizde
        Child cons. ini kullaniriz.

        java Child(){} gordugunde
        once parentin constructorini
        calistirmam lazim der
        buradan Parent cons'a gider
        Parent class'inda Parent(){} gorunce
        once bunun parent'inin yani Grandparent cons.
        calismasi gerekir der
        Boylece extends keyword olmayan class'a kadar gider
        ve oradan
         */
    }
}
