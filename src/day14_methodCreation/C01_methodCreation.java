package day14_methodCreation;

import day13_MethodCreation.C04_MethodCreation;

public class C01_methodCreation {
    public static void main(String[] args) {
        //input olarak verilen 4 harfli bir stringi
        //tersten yazdiran bir method olusturalim
        terstenYazdir("Okan"); // nakO
        C04_MethodCreation.topla(6,5); //11

    }

    public static void terstenYazdir(String input){
        String tersInput=input.substring(3)+
                          input.substring(2,3)+
                            input.substring(1,2)+
                            input.substring(0,1);
        System.out.println("verilen kelimenin tersten yazilisi : "+tersInput);
    }
}
