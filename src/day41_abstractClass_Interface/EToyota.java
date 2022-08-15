package day41_abstractClass_Interface;



public abstract class EToyota extends DAraba {

    @Override
    protected void motor() {
        System.out.println("Toyota arabalar cevreci motor kullanir");
    }
    /*
    parent class'daki standart belirleyici methodlar (abstract method)'larin
    tamami child class tarafindan override edilmelidir

    concrete method'larin override edilme mecburiyeti yoktur
    istersek override edebiliriz, istemezsek etmeyiz

    aslinda Toyota class'i da obje üretecegimiz bir class degil
    bu durumda eger proje tasarımı yapıyorsaniz Toyota class'ini da
    abstract yapmaniz güzel olur
     */
}
