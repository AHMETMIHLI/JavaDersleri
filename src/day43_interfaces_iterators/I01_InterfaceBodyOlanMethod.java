package day43_interfaces_iterators;

public interface I01_InterfaceBodyOlanMethod {

    void motor();
    public void yakit();
    public abstract String aku();

    /*
    normal bir class da oldugumuzu düsünsek
    iki tane access modifier kullanma ihtimali OLAMAZ

     asagidaki methodda göreceginiz gibi
     interface'de istisnai olarak body'si olan methodlar olusturulabilir.
     bu özellik Java 8'den sonra bir interface'e yeni bir method eklememiz gerektiginde
     eskiden beri bu interface'i implement eden tum class'lara gidip
     yeni eklenen method'u override etmemiz gerekirdi

     bu özellik sayesinde basına default ve static keyword ekleyerek
     interface'de yeni ve body si olan bir method olusturursak
     bu method'un child class'lar tarafindan override edilme MECBURİYETİ OLMAZ
     ve eskiden implement etmis class'lari degistirmemiz gerekmez

     bu istisnai bir durumdur ve interface icin olusturulan
     genel kuralları bozmaz

     bu method'larin body'si olsa da bunlara concrete method denmez
     ama override edilme mecburiyetleri yoktur

     buradaki default kelimesi access mdodifier degil
     istisnai durumun belirtilmesi icindir.

      o zaman nicin 2 keyword (static ve default) tanımlanmıstır.
      bu iki farkli kelimenin amaci
      child class'lardan bu methoda nasil erisilebilecegini belirlemek icindir
      static keyword kullanilirsa, child class'dan bu methoda erismek icin
      InterfaceAdi.methodAdi yeterli olur.

      default keyword kullanilirsa, methoda erismek icin obje olusturulmalidir
     */

    public default void teker(){
        System.out.println("default...tum arabalarin tekeri vardır");

    }

    public static void direksiyon(){
        System.out.println("static.... tum arabalarin direksiyonu vardir");
    }
}
