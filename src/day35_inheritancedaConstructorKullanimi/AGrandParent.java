package day35_inheritancedaConstructorKullanimi;

public class AGrandParent {

    protected String isim="Grandpa ismi belirtilmedi";

    /*
    her class'da gorunmese bile bir constructor vardir
    bu class'dan obje oluşturmak istedigimizde
    default constructor devreye girecektir.

    Default constructor'i..................
     */

    protected String grandpaKlupAdi ="Grandpa Klubu";

    AGrandParent (){
        System.out.println("Grandpa constructor calisti");
    }

}
