package day06_concatenation;

public class day06_Concatenation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Güzeldir";
        int sayi1=5;
        int sayi2=4;

        System.out.println(str1+" " +str2+" "+ sayi1+sayi2);
        System.out.println(str1+" " +str2+" "+ (sayi1+sayi2));
        System.out.println(sayi1+sayi2+" "+str1);
        System.out.println(" " +sayi1+sayi2+" "+ str2);


        System.out.println(str1.concat(str2)); // JavaGüzeldir
        System.out.println(str1.concat(" ").concat(str2)); //Java Güzeldir


    }
}
