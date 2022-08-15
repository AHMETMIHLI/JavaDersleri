package day33_encapsulation;

public class Tasit {

    private String tasitTuru;
    private boolean muayenesiVarMi;
    private int yil;

    public String getTasitTuru() {
        return tasitTuru;
    }
    //getter method'u da tek bir satirlik islem yapiyor
    //baska class'larin private oldugu icin
    //tasitTuru bilgisini, class icinden alip
    //istenen farklı class'lar return ediyor

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
    }

    public boolean isMuayenesiVarMi() {
        return muayenesiVarMi;
    }
    //boolean variable ler icin olusturulan getter method'larin ismi
    //isVariableIsmi seklinde olur.

    public void setMuayenesiVarMi(boolean muayenesiVarMi) {
        this.muayenesiVarMi = muayenesiVarMi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
