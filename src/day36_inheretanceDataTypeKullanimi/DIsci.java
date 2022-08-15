package day36_inheretanceDataTypeKullanimi;

import java.util.*;

public class DIsci extends BMuhasebe {
    protected int saatUcreti=11;
    protected int gunlukMesai=7;

    protected void maasIsci(){
        System.out.println("Isciler : " + (30*saatUcreti*gunlukMesai) + "maas alir");
    }

    protected void ozelSigortaIsci(){
        System.out.println("Isciler %70 indirimli özel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        BMuhasebe isci1 =new DIsci();
        /*
        Bir obje olusturulurken
        Data turu ve constructor ayni class'dan ise
        direk o class'a gidiyorduk

        Eger data turu ve cons. farkli ise
        obje constructor'in oldugu class'in objesidir
        ancak, bizden istenen
        Isci class'indaki spesifik ozellikler degil
        Bir iscinin muhasebe class'indaki
        tum calisanlarla beraber sahip oldugu
        genel ozellikleri yazdirir

         */
        System.out.println(isci1.gunlukMesai);
        System.out.println(isci1.saatUcreti);
        isci1.maas();
        isci1.ozelSigorta();
        isci1.sigorta();
        System.out.println(isci1.isim);
        System.out.println(isci1.soyisim);
        System.out.println(isci1.departmant);

        APersonel isci2= new DIsci();
        //System.out.println(isci2.gunlukMesai);
        //System.out.println(isci2.saatUcreti);
        //isci2.ozelSigorta();
        isci2.maas();
        isci2.sigorta();
        System.out.println(isci2.isim);
        System.out.println(isci2.soyisim);
        System.out.println(isci2.departmant);

        /*
        Eger data turu olan class'da aradigimiz ozellik yoksa
        varsa onun parent'ina gidebilir
        ama child'a donuş olmaz
        Aradigi ozelligi bulamazsa CTE verir
         */

        List<String> list1 =new LinkedList<>();
        Deque<String> list2 = new LinkedList<>();
        Queue<String> list3= new LinkedList<>();

        /*
        Hepsi LinkedList olsa da
        list1 List gibi davranir
        list2 Deque gibi davranir
        list3 Queue gibi davranir
         */
    }
}
