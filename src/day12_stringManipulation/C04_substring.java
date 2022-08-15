package day12_stringManipulation;

public class C04_substring {
    public static void main(String[] args) {

        String str ="Java cok yasa";

        System.out.println(str.substring(3,4));

        System.out.println(str.substring(5,7));

        System.out.println(str.substring(6,6));

        System.out.println("===");

        System.out.println(str.substring(6,2)); // exception

        //String str2=23; compile time error, syntax hatasi

    }
}
