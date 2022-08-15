package day31_timeFormatter_varargs;

public class C03_VarargsIleToplama {
    public static void main(String[] args) {
        //verilen kac 2 int olursa olsun
        //hepsini toplayip sonucu yazdiran bir method olusturun

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        int sayi5=50;


        toplaYazdir(sayi1,sayi2,sayi3,sayi4);
        toplaYazdir(sayi1,sayi2);
        toplaYazdir(sayi1,sayi2,sayi3);
        toplaYazdir(sayi1,sayi2,sayi3,sayi4,sayi5);

    }

    public static void toplaYazdir(int... sayi){ //int sonuna 3 nokta koyunca itiraz kalktı
        //Varargs degisken sayidaki argument demek
        /*
        int... sayi bu gosterim integer variable'lardan olusan bir varargs demektir
        varargs array alt yapisini kullanir
         */
        int toplam=0;
        int sayiAdedi=sayi.length;
        for (int each: sayi
             ) {
            toplam+=each;
        }
        System.out.println("girilen "+sayiAdedi+"adet sayinin toplami "+toplam);

        /*
        girilen 4adet sayinin toplami 100
        girilen 2adet sayinin toplami 30
        girilen 3adet sayinin toplami 60
        girilen 5adet sayinin toplami 150
         */
    }
}
