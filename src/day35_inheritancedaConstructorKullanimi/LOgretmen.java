package day35_inheritancedaConstructorKullanimi;

public class LOgretmen {
    LOgretmen(){
        System.out.println("LOgretmen parametresiz construction");
    }

    LOgretmen(String isim){
        this();
        System.out.println("LOgretmen parametreli construction");
    }
}
