package day33_encapsulation;

public class Araba {

    String marka = "marka belirtilmedi"; //marka'nin access modifier'i default access modifier
    // oldugundan package icerisinde kullanilabilir
    private String model = "model belirtilmedi";
    private String yakit = "Elektrikli"; //tüm arabalar elektrikli ise bu variable'in degistirilmemesi lazim
    //private yaptigimiz model ve yakit variable'larina erisimi yetkilendirelim
    //modele deger atanabilsin ama gorulemesin (setter)
    //yakit ise gorulebilsin ama atama yapilamasin (getter)

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }


}
