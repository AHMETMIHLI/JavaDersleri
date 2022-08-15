package day13_MethodCreation;

public class C03_StringManipulations {
    public static void main(String[] args) {
        // Soru 1) String methodlarini kullanarak
        // “  Java ogrenmek123 Cok guzel@  ”  String’ini
        // “Java ogrenmek cok guzel.” sekline getirin.

        String str="  Java ogrenmek123 Cok guzel@  ";
        str=str.trim();
        str=str.replaceAll("\\d", "");
        str=str.replaceAll("@", "");
        str=str.replaceAll("C", "c");
        str=str+".";

        System.out.println(str);
    }
}
