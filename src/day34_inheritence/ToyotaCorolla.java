package day34_inheritence;

public class ToyotaCorolla extends Toyota {
    public static void main(String[] args) {
        /*
        child class'dan parent class'a erisimde
        access modifier........
         */
        ToyotaCorolla arb1=new ToyotaCorolla();

        System.out.println(arb1.marka);//Toyota
        System.out.println(arb1.model);//Model belirtilmedi
    }
}
