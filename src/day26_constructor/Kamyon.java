package day26_constructor;

public class Kamyon {
    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;
    public int fiyat;

    @Override
    public String toString() {
        return
                "Kamyon{" +
                "\nmarka='" + marka + '\'' +
                "\nmodel='" + model + '\'' +
                "\nyil=" + yil +
                "\nfiyat=" + fiyat +'}';
    }
}
