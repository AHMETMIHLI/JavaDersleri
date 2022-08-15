package day28_staticBlock;

public class C02_PassByValue {

    public static void main(String[] args) {
        double satisFiyati=100;

        System.out.println(indirimliFiyat(satisFiyati));//90

        System.out.println(satisFiyati); //100

        System.out.println(indirimliFiyat(satisFiyati));//90
        //iki farklı methodda satisFiyati isminde variable olabilir
        //Java buna itiraz etmez cunku scope'lari ............

    }
    public static double indirimliFiyat(double orjinalFiyat){
        //methodumuz %10 indirim yapıp
        //yeni fiyatı main methoda dondursun
        double satisFiyati=orjinalFiyat*0.9;

        return satisFiyati;
    }
}
