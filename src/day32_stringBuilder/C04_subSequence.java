package day32_stringBuilder;

public class C04_subSequence {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("Kayra");

        sb.substring(0,3);
        //bu method string dondurdugu icin StringBuilderin eski halini degistiremez.

        System.out.println(sb); //Kayra

        sb.subSequence(0,3);

        System.out.println(sb); //Kayra

    }
}
