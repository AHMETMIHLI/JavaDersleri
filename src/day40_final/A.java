package day40_final;

public class A {
    protected String isim="Cuneyt";
    final static String OKUL="Yildiz Koleji";
    /*
    Bir variable final olarak tanimlandiysa
    baska class'lardan veya icinde oldugumuz class'dan
    bu variable'a baska deger atanması mumkun degildir.

    madem ki deger degistrilemeyor
    genelde static de yaparak
    bu variable'a erisim kolayşatırılabilir.
    ve genelde static final olarak belirlenen variable isimleri
    BUYUK HARFLE yazilir.
     */

    final void finalMethod(){
        System.out.println("final methodlar override edilemez");
        /*
        bir method'u final olarak isaretlerseniz
        bu method degistirilemez demektir.
        (override edilemez)
         */
    }
}
