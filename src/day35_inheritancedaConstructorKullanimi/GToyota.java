package day35_inheritancedaConstructorKullanimi;

public class GToyota {
    GToyota(){
        System.out.println("GToyota parametresiz constructor");
    }
    GToyota(String isim){
        //super(isim); extend olmadigi icin ..............
        System.out.println("GToyota parametreli constructor");
    }

}
