package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1 = new Araba();
        //arb1 objesi uzerinden marka variable'ine
        // ulasabildim, degistirebildim(set) ve yazdirabildim(get)
        arb1.marka = "Toyota";
        System.out.println(arb1.marka);

        //access modifier kullanarak marka variable'ine ulasimi
        // tamamen serbest yapabilir veya tamamen engelleyebilirim.
        //private yaptigimiz model'e hiç ulasamıyoruz
        //yani access modifier ya hep ya hic diyor

        //model'i degistirelim ama goremeyelim
        //yakiti da görelim ama degistiremeyelim

        //set ve get yetkilerini özel olarak tanimlamak isterseniz
        //1. adim - özel yetki tanimlayacaginiz variable'lari private yapin
        //          private bir dataya baska class'lardan ulasmak mumkun olmadigindan
        // 2. adim- set yetkisi icin setter, get yetkisi icin getter methodlari olusturalim

        arb1.setModel("Supra"); //model olarak Supra'yi atadik
        //modeli yazdirma imkanimiz yok, cunku getter method'u yok
        System.out.println(arb1.getYakit()); //elektrikli bilgisini yazdirabildik
        //yakiti degistiremeyiz cunku setter method'u yok
    }
}
