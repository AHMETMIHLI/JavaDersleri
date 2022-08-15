package day11_stringManipulations;

public class C01_indexOf {
    public static void main(String[] args) {

        String str = "Java ogrenmek cok guzel";
        /*
        Verilen bir String'de herhangi bir String veya char'in
        ilk kullanıldıgı index'i bize dondurur
         */

        System.out.println(str.indexOf('g')); //6
        System.out.println(str.indexOf("r")); //7
        System.out.println(str.indexOf("j")); //-1

        System.out.println(str.indexOf("mek")); //10

        //eger istedigimiz indexten sonrasini kontrol etmek istersek
        // o zaman ayni method'u iki parametreli olarak kullanabiliriz


        System.out.println(str.indexOf("g", (6+1))); //yazilan indexten başlar. ikinci g indexi : 18


        //yukaridaki str da 2. ve 3. e'nin indexlerini bulun
        //2. e yi bulabilmek için 1. e nin index'ine ihtiyacim var

        int ilke = str.indexOf("e");
        int ikincie = str.indexOf("e", ilke+1);

        // eger 2. e varsa 3. e nin indexlerini bulun
        //ve varsa index'ini yazdiralim

        if (ikincie==-1){
            System.out.println("verilen str'da 2. e yok");
        }else {
            int ucuncue=str.indexOf("e", ikincie+1);
            if (ucuncue==-1){
                System.out.println("verilen str'deki 3. e yok");
            }else {
                System.out.println("verilen str'deki 3. e'nin index'i : "+ ucuncue);
            }
        }
    }
}
