package day25_constructor;

public class C01 {
    /*
    Java OOP konsept kullandigi icin
    olusturulan herbir class'in ihtiyac oldugunda
    obje uretebilmesine uygun dizayn edilmistir.
    Ama her class'dan obje uretilmeyebilir.

    bunun icin java ihtiyac halinde kullanilmasi icin
    her class'da default bir constructor koymustur.

    bu default constructor
    class'dan obje olusturuldugunda otomatik olarak calisir.

    ornegin bu class'da constructor gorunmemesine ragmen
    C02 class'inda icinde oldugumuz C01 class'indan bir obje uretebildik.

     */

    int sayi;

    public void deneme(){
        System.out.println("C01'den deneme method calisir");
    }

}
