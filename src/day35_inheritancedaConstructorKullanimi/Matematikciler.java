package day35_inheritancedaConstructorKullanimi;

public class Matematikciler extends LOgretmen{

    Matematikciler(){
        System.out.println("Matematikciler parametresiz construction");
    }

    Matematikciler(String isim){
        this();
        System.out.println("Matematikciler parametreli construction");
    }

    public static void main(String[] args) {
        Matematikciler obj1=new Matematikciler("Tugba");
    }

    /*
    this() constructor call, icinde bulunulan class'daki constructorlari
    super() ise parent class'da bulunan constructorlari cagirir

    this() veya super() parametre yapisina uygun bir constructor bulamazsa
    Java CTE verir

    constructor konusunda gordugumuz this.
    o classdaki instance variable'lari refere ediyordu

    inheritance'da da super. vardir
    super. parent class'daki instance'lari refere eder.
     */
}
