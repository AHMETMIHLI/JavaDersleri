package day34_inheritence;

public class Personel {
    /*
    Eger parent class olacak ...............
     */

    protected int persNo;
    protected String isim= "Isım belirtilmedi";
    protected String departman="Departman belirtilmedi";

    protected void maas(){
        System.out.println("Tum personelin maasi vardir");
    }

    protected void mesai(){
        System.out.println("Tum personel statusune gore mesai yapar");
    }

    protected void fazlaMesaiUcreti(){
        System.out.println("Personel fazla mesaisini ..... gore alir");
    }
}
