package day42_abstractClass_interfaces;

public interface I03_Interfaces {

    int SAYI =20;
    /* int sayi;
    interfacelerde tum variableler public static ve finaldir
    dolayisiyla sonradan deger atama sansımız yoktur
    bunun icin variable olusturdugumuzda ...............

    Bir interface bir class'i parent edinemez
     */

    void yakit();
    /*
    Interface icerisindeki her method
    public ve abstract ozelliklerine sahiptir.

    public void aku(){

    }
    abstract bir methodun body'si olmasi mumkun degildir.
    Java sonradan developerların istegi üzerine kismi bir update
    yapmistir.

    Bir interface'e sonradan bir abstract method eklerseniz
    o interface'i daha önce implement etmis tum class'lara gidip
    hepsinde yeni eklenen methodu override etmeniz gerekir
    bu da buyuk ve eskiden gelen projeler icin cok zor bir islemdir.

    bunun icin java java8'den itibaren
    interface'lere sonradan body'si olan method eklenmesine izin vermistir

    bu methodlarin bodysi olsa da Interface'in yapisi geregi
    bu methodlara concrete ............
     */

    public void motor();
    public abstract void teker();




}
