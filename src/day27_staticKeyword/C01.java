package day27_staticKeyword;

public class C01 {

    static int sayi= 10;
    int rakam=5;

    public static void main(String[] args) {

        /*
        ............
         */

        C01 obj1=new C01();
        System.out.println("obj1'in rakam degeri : "+ obj1.rakam); //
        System.out.println("obj1'in sayi degeri : "+ sayi);

        obj1.rakam+=1;
        obj1.sayi+=1;

        System.out.println("1 artirildiktan sonra obj1'in rakam degeri : "+ obj1.rakam);
        System.out.println("1 artirildiktan sonra obj1'in sayi degeri : "+ sayi);

        C01 obj2=new C01();

        System.out.println("obj2'in rakam degeri : "+ obj2.rakam);
        System.out.println("obj2'in sayi degeri : "+ obj2.sayi);

        obj2.rakam++;
        obj2.sayi++;


        System.out.println("1 artirildiktan sonra obj2'in rakam degeri : "+ obj2.rakam);
        System.out.println("1 artirildiktan sonra obj2'in sayi degeri : "+ obj2.sayi);







    }
}
