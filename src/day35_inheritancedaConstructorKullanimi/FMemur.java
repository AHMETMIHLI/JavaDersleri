package day35_inheritancedaConstructorKullanimi;

public class FMemur extends EMuhasebe {
    /*
        Extends keyword kullanilan classlarda
        ister default constructor bulunsun
        istersek de biz yeni constructor(lar) olusturalim
        Java constructor'un ilk satirina
        super(); constructor call yazar

        super(); constructor call default constructor'a benzer
        gorunmese de orada vardir ve calisir
        ancak biz ilk satira farkli bir constructor call yazarsak
        Java super(); 'i siler

        Eger biz müdahale edip kendi constructor call'unu olusturmazsak
        Javanin default olarak olusturdugu constructor call
        herzaman parametresizdir.
        yani super();
         */
    FMemur(){
        System.out.println("Memur parametresiz constructor");
    }
    FMemur(String isim){
        System.out.println("Memur parametreli constructor");
    }
    public static void main(String[] args) {
        FMemur mmr1= new FMemur("ali");
    }


}
