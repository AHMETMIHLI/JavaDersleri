package day41_abstractClass_Interface;

public abstract class DAraba {
    public static void main(String[] args) {
        //abstroact classda main method opsiyoneldir(tercihe bağlıdır)
        //eger abstract class sadece child classların tasımak zorunda oldugu
        //ozellikleri belirlemek icin olusturulduysa
        //main methoda ihtiyac olmaz
        //sadece abstract methodlar olur

        /*
        ama bir abstract method'da
        standart belirlemek disinda da methodlar calisabilir.
        bu durumda ihtiyac olursa main method olusturulabilir.
         */
    }

    protected abstract void motor(); //abstract methodun bodysi yok
    /*
    sadece child classlarin mecburi tasiyacaklari ozellikleri belirleyen method'lar
    abstract method olur ve abstract method'larin body'si olmaz
     */

    public void klima(){ //concrete method bodysi var
        System.out.println("bazi arabalarda klima olabilir");
        /*
        abstract olmayan method'lara concrete method denir.
        abstract bir method'u abstract keyword ile belirtmek zorunludur.
        concrete methodlarda bunun deklare edilmesine gerek yoktur
        biz sadece abstraction ile ilgili konustugumuzda
        abstract olmayan method'lardan bahsetmek icin concrete tabirini kullaniriz
         */

    }
}
